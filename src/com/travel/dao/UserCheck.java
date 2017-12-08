package com.travel.dao;

import com.travel.bean.User;
import com.travel.database.Database;

public class UserCheck {
	/** 检查用户密码是否正确
	 * @param username 用户名
	 * @param password 密码
	 * @return 用户
	 */
	public User checkUser(String username, String password) {
		Database.Connect();
		if(Database.checkUser(username, password)!= -1) {
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			return user;
		}
		return null;
	}
}
