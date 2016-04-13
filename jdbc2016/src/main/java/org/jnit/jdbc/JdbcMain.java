package org.jnit.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.jnit.domain.Customer;

public class JdbcMain {
	
	public static Connection getConnection() {
		String url =  "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "ravi";
		Connection conn = null;;
		try {
			conn =  DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void getCustomerData(){
		
		try {
			Connection conn =  getConnection();
			String query = "select * from customer";
			Statement  stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getString("customerId")+"  ");
				System.out.println(rs.getString("name"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//prepared statement
	public static void insertCustomer(Customer customer) {
		
		try {
			Connection conn =  getConnection();
			String query = "insert into customer(name, city, street, state, country, zipcode) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, customer.getName());
			pst.setString(2, customer.getStreet());
			pst.setString(3, customer.getCity());
			pst.setString(4, customer.getState());
			pst.setString(5, customer.getCountry());
			pst.setString(6, customer.getZipCode());
			
			int noOfRowAffected = pst.executeUpdate();
			
			System.out.println(noOfRowAffected);
			pst.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Customer> getCustomerList(){
		// DriverManager, Datasource
		
		List<Customer> customers =  new ArrayList();
		try {
			Connection conn =  getConnection();
			String query = "select * from customer";
			Statement  stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Customer cust = new Customer();
				
				cust.setName(rs.getString("name"));
				cust.setStreet(rs.getString("street"));
				cust.setCity(rs.getString("city"));
				cust.setState(rs.getString("state"));
				cust.setCountry(rs.getString("country"));
				cust.setZipCode(rs.getString("zipcode"));
				
				customers.add(cust);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}
	
	
	public static void main(String[] args) {
		//JdbcMain.getCustomerData();
		Customer customer1 =  new Customer();
		customer1.setName("Ram");
		customer1.setStreet("SS Nagar");
		customer1.setCity("Bangalore");
		customer1.setState("Karnataka"); 
		customer1.setCountry("India");
		customer1.setZipCode("583101");
		//insertCustomer(customer1);
		
		Customer customer2 =  new Customer();
		customer2.setName("Sham");
		customer2.setStreet("Bandra");
		customer2.setCity("Mumbai");
		customer2.setState("Maharastra");
		customer2.setCountry("India");
		customer2.setZipCode("124101");
		//insertCustomer(customer2);
		
		System.out.println("---------------------------------------");
		//JdbcMain.getCustomerData();
		
		List<Customer> customers = getCustomerList();
		//customers.forEach(custm -> System.out.println(custm.getName()));
	}
	
}
