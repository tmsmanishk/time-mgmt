package com.tms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	
	public static String DB_DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static String DB_URL = "jdbc:mysql://localhost:3306/tmstaskmgmt";
	public static String DB_USERNAME = "root";
	public static String DB_PASSWORD = "manish";

	public static Connection getJDBCConnection(){
		Connection con = null;
		try {
			Class.forName(DB_DRIVER_NAME);
			con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}  
		return con;	 
	}

}
