package com.travel.database;

import java.sql.*;
public class Database {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/travel";
	
	static final String USER = "root";
	static final String PASS = "1q2w3e4r";

	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null; 
	
	/** 连接数据库
	 * 
	 */
	public static void Connect() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/** 关闭数据库
	 * 
	 */
	public static void Close() {
		try {
			if(pstmt != null) {
				pstmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			if(conn != null) {
				conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkUser(String username, String password) {
		String sql = "SELECT * FROM user WHERE username = ?";
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			rs.next();
			if(rs.getString("password").equals(password)) {
				return true;
			}
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return false;
	}
}
