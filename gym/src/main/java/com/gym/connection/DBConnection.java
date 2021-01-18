package com.gym.connection;

import java.sql.*;



public class DBConnection {
	Connection connection = null;
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SpringCRUD", "root", "razendra");
		java.sql.DatabaseMetaData dbmd = connection.getMetaData();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}

}
