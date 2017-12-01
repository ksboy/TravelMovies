package com.travel.database;

import java.sql.*;
import java.util.ArrayList;

public class Database {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/travel";
	
	static final String USER = "root";
	static final String PASS = "1q2w3e4r";

	static Connection conn = null;
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
	public static boolean signup(ArrayList<String> message){
	   String sql = "INSERT INTO user(name, password, nickname,question,answer,age,gender, birth_date,bio,tags)values(?,?,?,?,?,?,?,?,?,?)"; 
       try{
	    pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,message.get(0));
        pstmt.setString(2,message.get(1));
        pstmt.setString(3,message.get(2));
        pstmt.setString(4,message.get(3));
        pstmt.setString(5,message.get(4));
        pstmt.setString(6,message.get(5));
        pstmt.setString(7,message.get(6));
        pstmt.setString(8,message.get(7));
        pstmt.setString(9,message.get(8));
        pstmt.setString(10,message.get(9));
        int result = pstmt.executeUpdate();
        if(result == 0) return false;
        else return true;
       }catch(Exception e) {  
        System.out.print("get data error!");  
        e.printStackTrace();  
       }
	    
	    return false;
	    
	}
	
	public static int checkUser(String username, String password) {
		String sql = "SELECT * FROM user WHERE name = ?";
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			int user_id ;
			rs = pstmt.executeQuery();
			rs.next();
			if(rs.getString("password").equals(password)) {
			   user_id= rs.getInt("id");
				return user_id;
			}
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return -1;
	}
	
	public static int AddDiscription(String user_id, String x, String y, String place, String visible, String content, String movie, String thoughts, String tags) {
		String sql = "INSERT INTO description (user_id, x, y, place, visible, content, movie, thoughts, tags) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setDouble(2, Double.parseDouble(x));
			pstmt.setDouble(3, Double.parseDouble(y));
			pstmt.setString(4, place);
			pstmt.setString(5, visible);
			pstmt.setString(6, content);
			pstmt.setString(7, movie);
			pstmt.setString(8, thoughts);
			pstmt.setString(9, tags);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			
		}
		return result;
	}
	
	public static int DeleteDiscriptionById(String item_id) {
		String sql = "DELETE FROM description WHERE item_id = ?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, item_id);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			
		}
		return result;
	}
	
	public static ResultSet ReadDiscriptionUserId(String user_id, String visible) {
		String sql = "SELECT * FROM description WHERE user_id = ? AND visible = ?";
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setString(2, visible);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
		
		}
		return result;
	}
}
