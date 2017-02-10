package com.wenbo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;



public class JDBC {
	@Test
	public void conn() throws ClassNotFoundException, SQLException {
		/**
		 * JDBC 四大参数 
		 * driverClassName
		 * url
		 * username
		 * password
		 */
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/bragi";
		String userName = "root";
		String password = "wenbomysql2017";
		Connection conn = DriverManager.getConnection(url, userName, password);
		System.out.println(conn);
		
	}
}
