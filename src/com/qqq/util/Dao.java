package com.qqq.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	static public Connection conn() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Success loading Mysql Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connect = DriverManager
					.getConnection("jdbc:sqlserver://10.8.100.102:1433;DatabaseName=2019-nCoV","sa","Sippl@123");
			System.out.println("Success connect Mysql server");
			return connect;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
}
