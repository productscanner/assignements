package org.jnit.jdbc;

import java.sql.*;

/*This Class along with the sql file my_table.sql will demonstrate the creation and calling of procedures with IN and OUT parameters*/

public class StoredProcedure_1 {

	public static void main(String[] args) {
		
		Connection myConn = null;
		CallableStatement myCallableStmt = null;
		ResultSet myRs = null;
		String url =  "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "ravi";
		String department = null;
		boolean check;
		
		try{
			myConn =  DriverManager.getConnection(url, user, password);
			Statement myStmt =   myConn.createStatement();
			department = "HR";
			
			System.out.println("Salaries before modification");
			myCallableStmt = (CallableStatement) myConn.prepareCall("call show_salaries(?)"); // stored procedure to show the table entries with department = HR
			myCallableStmt.setString(1, department);
			check = myCallableStmt.execute();
			System.out.println("Check "+check);
			myRs = myCallableStmt.getResultSet();			
			while (myRs.next()) {
				System.out.println(myRs.getString("department")+"   "+myRs.getString("salary"));				
			}
			
			
			int incrementInSalary = 3470;
			myCallableStmt = (CallableStatement) myConn.prepareCall("call increase_salaries_for_department(?,?)");
			myCallableStmt.setString(1,department);
			myCallableStmt.setDouble(2, incrementInSalary);
					
			System.out.println("\nCalling stored procedure increase_salaries_for "+department +" department ");
            check = myCallableStmt.execute();
					
			System.out.println("Salaries after modification");		
			myCallableStmt = (CallableStatement) myConn.prepareCall("call show_salaries(?)");
			myCallableStmt.setString(1, department);
			check = myCallableStmt.execute();
			System.out.println("Check "+check);
			myRs = myCallableStmt.getResultSet();			
			while (myRs.next()) {
				System.out.println(myRs.getString("department")+"   "+myRs.getString("salary"));				
			}
			
		}catch(Exception e){
			System.out.println("cought an exception" +e);
		}
	}
}
