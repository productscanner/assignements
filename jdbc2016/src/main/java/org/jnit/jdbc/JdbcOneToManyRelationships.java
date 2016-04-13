package org.jnit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.jnit.domain.Author;
import org.jnit.domain.Books;

public class JdbcOneToManyRelationships {

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

	public static Author getAuthorBookData(int id) {
		Author author = new Author();
		try {
			Connection conn = getConnection();
			List<Books> books = new ArrayList();
			String query = "select a.name,a.city,a.authorId,b.authorId,b.title from demo.author a join demo.books b "
							+ "on a.authorId = b.authorId where a.authorId = ?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();
			while (rst.next()) {
				author.setAuthorId(rst.getInt("authorId"));
				author.setName(rst.getString("name"));
				author.setCity(rst.getString("city"));
				Books book = new Books();
				book.setTitle(rst.getString("title"));
				book.setAthorId(rst.getInt("authorId"));
				books.add(book);
			}
			
			author.setBooks(books);
			rst.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return author;
	}

	public static void main(String[] args) {

		Author author1 = getAuthorBookData(1);

		System.out.println(author1.getName());
		System.out.println(author1.getBooks());
	}

}
