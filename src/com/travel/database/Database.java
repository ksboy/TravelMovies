package com.travel.database;

import java.sql.*;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;

public class Database {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/travel";
	
	static final String USER = "root";
	static final String PASS = "1q2w3e4r";

	static Connection conn = null;
	static PreparedStatement pstmt = null; 
	static PreparedStatement pstmt2 = null;
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
	public static boolean add_follower(int id1,int id2)
	{
	    String sql = "INSERT INTO user_follow(self_id,follow_id)values(?,?)";
	    String sql2 = "SELECT * FROM user_follow where self_id = ? AND follow_id = ?";
	    try{
	        pstmt2= conn.prepareStatement(sql2);
	        pstmt2.setInt(1,id1);
	        pstmt2.setInt(2,id2);
	        ResultSet rs = pstmt2.executeQuery();
	        if(rs.next()) return true;
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1,id1);
	        pstmt.setInt(2,id2);
	        if(id1 == id2) return true;
	        int result = pstmt.executeUpdate();
	        if(result == 0) return false;
	        else return true;
	    }catch(Exception e) {  
	        System.out.print("get data error!");  
	        e.printStackTrace();  
	       }
	    
	    return false;
	    
	}
	public static boolean del_follower(int id1,int id2)
    {
        String sql = "delete FROM user_follow where self_id = ? AND follow_id = ?";
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id1);
            pstmt.setInt(2,id2);
            int result = pstmt.executeUpdate();
            if(result == 0) return false;
            else return true;
        }catch(Exception e) {  
            System.out.print("get data error!");  
            e.printStackTrace();  
           }
        
        return false;
        
    }
	public static ArrayList<Integer> search_follower(int id1)
    {
        String sql = "SELECT * FROM user_follow where self_id = ?";
        //ArrayList<String> result = new ArrayList<String>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id1);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                result.add(rs.getInt("follow_id"));
            }
            
        }catch(Exception e) {  
            System.out.print("get data error!");  
            e.printStackTrace();  
           }
        
        return result;
        
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
	
	public static int AddRoute(String user_id, String ids, String des) {
		String sql = "INSERT INTO route (user_id, item_ids, des) VALUES (?, ?, ?)";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setString(2, ids);
			pstmt.setString(3, des);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
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
	public static String SearchName(int id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        String result = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            result=rs.getString("name");
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
	public static ResultSet SearchMovie(String moviename) {
		String sql = "SELECT * FROM description WHERE movie = ?";
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, moviename);
			result = pstmt.executeQuery();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static ResultSet SearchPlace(String moviename) {
        String sql = "SELECT * FROM description WHERE place like \"%\"?\"%\" ";
        ResultSet result = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, moviename);
            result = pstmt.executeQuery();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
	public static ResultSet SearchTag(String moviename) {
        String sql = "SELECT * FROM description WHERE tags like \"%\"?\"%\" ";
        ResultSet result = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, moviename);
            result = pstmt.executeQuery();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
	public static ResultSet SearchPlot(String moviename) {
        String sql = "SELECT * FROM description WHERE content like \"%\"?\"%\" ";
        ResultSet result = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, moviename);
            result = pstmt.executeQuery();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
	public static ResultSet ReadDiscriptionUserId(String user_id, String visible) {
		String sql = "SELECT * FROM description WHERE user_id = ?";
		ResultSet result = null;
		try {
		    int id = (int)ActionContext.getContext().getSession().get("id");
	        user_id = String.valueOf(id);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			//pstmt.setString(2, visible);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
		
		}
		return result;
	}
	public static ResultSet ReadRoute() {
		String sql = "SELECT * FROM route";
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
		
		}
		return result;
	}
	public static ResultSet ReadSelfRoute(String user_id) {
		String sql = "SELECT * FROM route WHERE user_id = ?";
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
		
		}
		return result;
	}
	public static ResultSet ReadFavRoute(String self_user_id) {
		String sql = "SELECT * FROM user_follow WHERE self_id = ?";
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, self_user_id);
			result = pstmt.executeQuery();
			sql = "SELECT * FROM route WHERE user_id = ";
			result.next();
			sql += result.getString("follow_id");
			while(result.next()) {
				sql += " OR user_id = ";
				sql += result.getString("follow_id");
			}
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
			
		} catch (SQLException e) {
		
		}
		return result;
	}
	public static ResultSet ReadDiscriptionUserIdAll(String user_id, String visible) {
        String sql = "SELECT * FROM description where visible = ? OR user_id = ?";
        ResultSet result = null;
        try {
            int id = (int)ActionContext.getContext().getSession().get("id");
            user_id = String.valueOf(id);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, visible);
            pstmt.setString(2, user_id);
            result = pstmt.executeQuery();
        } catch (SQLException e) {
        
        }
        return result;
    }
	public static ResultSet DisplayRoute(String route_id) {
		String sql = "SELECT * FROM route WHERE route_id = ?";
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, route_id);
			result = pstmt.executeQuery();
			result.next();
			String ids = result.getString("item_ids");
			String idsplit[] = ids.split("\\|");
			sql = "SELECT * FROM description WHERE item_id = ";
			for(int i = 0; i < idsplit.length - 1; i++) {
				sql += idsplit[i];
				sql += " OR item_id = ";
			}
			sql += idsplit[idsplit.length-1];
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
		
		}
		return result;
	}
}
