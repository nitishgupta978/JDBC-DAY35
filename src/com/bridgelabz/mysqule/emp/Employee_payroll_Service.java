package com.bridgelabz.mysqule.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee_payroll_Service {
	//private static final String ID = null;

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			System.out.println("Welcome to JDBC API ");
			try {
			//1st Driver load
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver lodaed");
			
			
			//final String url_w ="jdbc:mysql://localhost:3306/worker_db";
			final String url_w ="jdbc:mysql://localhost:3306/PayRoll_Service_Employee";
			final String userName = "root";
			final String password ="Nitish@123";
			
			//2nd Connection DB
			Connection con_w = DriverManager.getConnection(url_w, userName, password);
			System.out.println("connected with db(data base)");
			
			//3nd Create statement
			
			Statement stmt = con_w.createStatement();
			String query ="select*from customers";
			System.out.println("Query");
			
			//4th execute query and get result
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("--------------------");
				System.out.println("Id "+ rs.getInt("ID"));
				System.out.println("FirstName "+ rs.getString("FirstNAME"));
				System.out.println("LastName "+ rs.getString("LastName"));
				
				System.out.println("SALARY "+ rs.getBigDecimal("SALARY"));
				System.out.println("Mobile"+ rs.getLong("Mobile"));
			}
			con_w.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		}		
}
