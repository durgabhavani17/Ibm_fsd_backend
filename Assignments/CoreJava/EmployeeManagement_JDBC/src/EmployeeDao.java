package EmployeeManagement;

import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeDao {
	Connection conn = null;
	int key = 100;

	public EmployeeDao() {
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/jdbctraining";

		// Database credentials
		final String USER = "root";
		final String PASS = "pass@word1";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (ClassNotFoundException c) {
			System.err.println("class not found");
		} catch (SQLException s) {
			System.err.println("there is sysntax error");
		}
	}

	public void createUser(Employee emp) {

		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver

			// STEP 4: Execute a query
			

			String sql2 = "INSERT INTO employee(name,salary,dob,age,des,dep)values(?,?,?,?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(sql2);

			pstmt.setString(1, emp.getName());
			pstmt.setDouble(2, emp.getSalary());
			pstmt.setNString(3, emp.getDob());
			pstmt.setInt(4, emp.getAge());
			pstmt.setString(5, emp.getDes());

			pstmt.setString(6, emp.getDep());

//			boolean status = stmt.execute(sql2);
			boolean status = pstmt.execute();
			System.out.println("employee added successfully");

			// STEP 6: Clean-up environment

			
			
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} 

	}

	public void updateUser(String name, double salary, String dob, int age, String des, int id) {
		

		try {

			String sql2 = "update employee set name=?,salary=?,dob=?,age=?,des=? where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(6, id);
			pstmt.setString(1, name);
			pstmt.setDouble(2, salary);
			pstmt.setNString(3, dob);
			pstmt.setInt(4, age);
			pstmt.setString(5, des);
			boolean status = pstmt.execute();
			System.out.println("employee updated successfully");
		} catch (SQLException s) {
			System.err.println("syntax error");
		}
	}

	public Map displayUsers() {

		Statement stmt = null;
		Map tree = new TreeMap();

		try {
			stmt = conn.createStatement();
			String sql2 = "select * from employee";
			ResultSet rs = stmt.executeQuery(sql2);
			if (rs.next()) {
				System.out.format("Id \t\tName \t\tSalary \t\t\tDob \t\tAge \tDesignation \tDepartment\n");
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------");
				while (rs.next()) {

					int id = rs.getInt("id");
					int age = rs.getInt("age");
					String name = rs.getString("name");

					Date dob = rs.getDate("dob");

					double salary = rs.getDouble("salary");
					String des = rs.getString("des");
					String dep = rs.getString("dep");
					System.out.format("%d \t%11s \t%10f \t\t%10s \t%10d \t%10s \t%10s\n", id, name, salary, dob, age,
							des, dep);
					tree.put(key++, new Employee(id, name, salary, dob, age, des, dep));
				}

			} else {
				System.out.println("no data found");
			}
			rs.close();

		} catch (SQLException e) {
			System.err.println("syntax error");
		}
		return tree;
	}

	public void displayUsersById(int kid) {
		
		Statement stmt = null;
  try {
		stmt = conn.createStatement();
		String sql2 = "select * from employee where id=" + kid;
		ResultSet rs = stmt.executeQuery(sql2);

		System.out.format("Id \t\tName \t\tSalary \t\t\tDob \t\tAge \tDesignation \tDepartment\n");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");

			while (rs.next()) {

				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String name = rs.getString("name");

				Date dob = rs.getDate("dob");

				double salary = rs.getDouble("salary");
				String des = rs.getString("des");
				String dep = rs.getString("dep");
				System.out.format("%d \t%11s \t%10f \t\t%10s \t%10d \t10%s \t%10s\n", id, name, salary, dob, age, des,
						dep);

		
		}
		rs.close();
  }catch(SQLException e) {
	  System.err.println("syntax error");
  }

	}

	public void deleteEmployee(int did)  {
		
		Statement stmt = null;
  try {
		stmt = conn.createStatement();
		String sql = "delete from Employee where id=" + did;
		stmt.execute(sql);

		System.out.println("employee deleted successfully");
  }
  catch(SQLException e) {
	  System.err.println("syntax error");
  }
	}
}