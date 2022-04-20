package com.revature.connectdb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {



		public static Connection getConnection() {


			Connection conn = null;

			try {
			conn = DriverManager.getConnection("db_path");
					/*
					 * (System.getenv("db_url"),
					 
					System.getenv("db_user"),
					System.getenv("db_pass"));
                   */
			System.out.println("Connected to the PostgreSQL server successfully.");
			}catch(SQLException e) {
				System.out.println("failed");
			
			}
            
			return conn;}}

