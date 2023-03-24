package com.inventory.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "hr";
	private static final String PASSWORD = "hr";
	private static  Connection connection;
	
	public static Connection getConnection() throws SQLException {
		connection=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		return connection;
	}

}
