package com.rizz.DAOs;

import java.sql.*;
//singleton class for establishing the connection b/w Servlet & DB
// Follow the pattern for creating the singleton class

public class DBConnection {

	private static Connection con = null;

	private DBConnection() {}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(DBInfo.DB_URL, DBInfo.DB_UNAME, DBInfo.DB_PWORD);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
	}
}
