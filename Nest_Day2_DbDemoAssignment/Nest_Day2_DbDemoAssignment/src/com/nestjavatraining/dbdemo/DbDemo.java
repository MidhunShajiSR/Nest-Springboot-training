package com.nestjavatraining.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbDemo {

	private static String connectionString = "jdbc:mysql://localhost:3306/canddella_employee_db?allowPublicKeyRetrieval=true&useSSL=false";
	private static String userName = "root";
	private static String password = "midhun7";
	private static Connection connection = null;
	private static PreparedStatement prepstmt = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter Choice");
			System.out.println("1. Insert EmployeeUtility\r\n" + "2. Search EmployeeUtility by Id\r\n"
					+ "3. Update EmployeeUtility by Id\r\n" + "4. Delete EmployeeUtility by Id\r\n" + "");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				insertEmployee(10, "anu");
				break;
			case 2:
				searchEmployeeById(1);
				break;
			case 3:
				updateEmployeeById(6, "appu");
				break;
			case 4:
				deleteEmployeeById(6);
				break;
			case 5:
				display();
				break;
			}
			System.out.println("Go to Main Menu y/n");
			ch = scanner.next().charAt(0);
		} while (ch == 'y');
	}

	private static void insertEmployee(int i, String name) {
		String sql = "insert into employee(employeeid,employeename)" + "values(?,?)";
		try {
			prepstmt = connection.prepareStatement(sql);
			prepstmt.setInt(1, i);
			prepstmt.setString(2, name);
			prepstmt.executeUpdate();
			System.out.println(name + "" + i + "gygyguh");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception se) {
			se.printStackTrace();
		}
	}

	private static void deleteEmployeeById(int i) {
		String sql = "delete from employee where employeeid =\"" + i + "\"";
		try {
			prepstmt = connection.prepareStatement(sql);
			prepstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateEmployeeById(int i, String name) {

		String sql = "update employee set employeeid = ?, employeename = ? where employeeid =\"" + i + "\"";
		try {
			prepstmt = connection.prepareStatement(sql);
			prepstmt.setInt(1, i);
			prepstmt.setString(2, name);
			prepstmt.executeUpdate();

			System.out.println("Id : " + i + "  Name : " + name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void searchEmployeeById(int i) {

		String sql = "select * from employee where employeeid = \"" + i + "\"";
		try {
			prepstmt = connection.prepareStatement(sql);
			ResultSet resultSet = prepstmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("Id : " + resultSet.getInt(1) + "  Name : " + resultSet.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void display() {
		// TODO Auto-generated method stub
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employee");
			while (resultSet.next())
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
