package com.bridgelabz.mysqule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class My_DataBase {
	public static void main(String[] args) throws ClassNotFoundException  {
		   try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   System.out.println("Driver loded");
			   
		Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmarks", "root", "Nitish@123");//Establishing connection
		System.out.println("Connected With the database successfully");
				
				
				
			} catch (SQLException e) {
				System.out.println(e);
				
				System.out.println("Error while connecting to the database");
			
					}
	}
}
