package org.jnit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jnit.domain.Reviewer;

public class TransactionDemo {

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

	public static void insertComics(Connection conn) throws SQLException {
		String query = "insert into comics (comicId, comic_name) values ('2','BatMan')";

		Statement stmt = conn.prepareStatement(query);

		int i = stmt.executeUpdate(query);
		System.out.println("i "+i);

	}

	public static void insertCharacter(Connection conn) throws SQLException {
		String query = "insert into characterDetails (comicId character_name,character_power,character_city) values ('2','BatMan','Fear','Gotham')";

		Statement stmt = conn.prepareStatement(query);

		int i = stmt.executeUpdate(query);
		System.out.println("i "+i);
	}

	public static void main(String[] args) {

		Connection conn = null;
		try {
			conn = getConnection(); 
            conn.setAutoCommit(false);
			insertComics(conn);
			insertCharacter(conn);
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				System.out.println("JDBC Transaction rolled back successfully");
			} catch (SQLException e1) {
				System.out.println("SQLException in rollback" + e.getMessage());
			}
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
