package org.jnit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jnit.domain.Reviewer;
import org.jnit.domain.Task;

public class JdbcManyToManyRelationships {

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

	public static Reviewer getReviewerData(int id) {
		Reviewer reviewer = new Reviewer();
		try {
			Connection conn = getConnection();
			List<Task> tasks = new ArrayList();
			String query = "select * from  reviewer r join reviewer_tasks rt on r.reviewerID = rt.reviewerID "
							+ "join tasks t on t.taskID = rt.taskID where r.reviewerID = ?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rst = pstmt.executeQuery();
			while (rst.next()) {
				reviewer.setId(rst.getInt("reviewerId"));
				reviewer.setName(rst.getString("reviewer"));
				Task task = new Task();
				task.setTaskId(rst.getInt("taskId"));
				task.setTaskName(rst.getString("task"));
				tasks.add(task);
			}
			
			reviewer.setTasks(tasks);
			rst.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reviewer;
	}
	
	
	public static void main(String[] args) {

		Reviewer reviewer1 = getReviewerData(4);

		System.out.println(reviewer1.getName());
		System.out.println(reviewer1.getTasks());
		//System.out.println(reviewer1.toString());
	}

	
}
