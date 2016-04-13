package org.jnit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jnit.domain.Customer;
import org.jnit.domain.PhoneInformation;

public class JdbcOneToOneRelationships {

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "ravi";
		Connection conn = null;
		;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	public static Customer getCustomerPhoneData(int id) {
		Customer customer = new Customer();
		try {
			Connection conn = getConnection();
			String query = "select cust.name,cust.city,cust.state,phone.cell,phone.work from demo.customer cust join demo.phoneinfo phone "
					        + "on cust.customerId = phone.phoneId where cust.customerId = ?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();
			while (rst.next()) {
				customer.setName(rst.getString("name"));
				customer.setCity(rst.getString("city"));
				customer.setState(rst.getString("state"));
				PhoneInformation phone = new PhoneInformation();
				phone.setCell(rst.getString("cell"));
				phone.setWork(rst.getString("work"));
				customer.setPhoneInfo(phone);
			}
			rst.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customer;
	}

	public static void main(String[] args) {

		Customer customer1 = getCustomerPhoneData(3);

		System.out.println(customer1.getPhoneInfo().getCell());
	}

}
