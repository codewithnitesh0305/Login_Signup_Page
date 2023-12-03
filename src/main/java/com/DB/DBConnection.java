package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection connection = null;
	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/career_guidance";
			String username= "root";
			String password = "Nitesh@0305";
			connection = DriverManager.getConnection(url, username, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
