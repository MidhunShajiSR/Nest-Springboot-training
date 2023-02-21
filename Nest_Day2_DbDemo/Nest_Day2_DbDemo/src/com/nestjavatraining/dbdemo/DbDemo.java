package com.nestjavatraining.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String connectionString = "jdbc:mysql://localhost:3306/canddella_employee_db?allowPublicKeyRetrieval=true&useSSL=false";
			String userName = "root";
			String password = "midhun7";
			Connection connection = DriverManager.getConnection(connectionString, userName, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employee");
			while (resultSet.next())

				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
