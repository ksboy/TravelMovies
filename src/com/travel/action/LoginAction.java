package com.travel.action;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.travel.bean.User;
import com.travel.dao.UserCheck;
import com.travel.utils.CookieUtils;

public class LoginAction extends ActionSupport implements ServletRequestAware, 
 ServletResponseAware, SessionAware{
	private static final long serialVersionUID = -3220291143111112470L;
	public static final String USER_SESSION = "user.session";
	private HttpServletResponse response;
	private HttpServletRequest request;
	private Map<String, Object> session;
	private CookieUtils cookieUtils = new CookieUtils();
	private UserCheck userCheck = new UserCheck();
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isUserCookie() {
		return userCookie;
	}

	public void setUserCookie(boolean userCookie) {
		this.userCookie = userCookie;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	private String username;
	private String password;
	private boolean userCookie;
	
	public String login() {
		if (cookieUtils.getUserCookie(request, userCheck)) {
			return SUCCESS;
		} else {
			return "login";
		}
	}
	
	// 正常登录
	public String execute() throws Exception {
		System.out.println(username + "\t" + password + "\t" + userCookie);
		String username = getUsername().trim();
		if (username != null && !"".equals(username) && password != null
				&& !"".equals(password)) {
			User user = userCheck.checkUser(username, password);
			System.out.println(user);
			if (user != null) {
				// 判断是否要添加到cookie中
				if (userCookie) {
					Cookie cookie = cookieUtils.addUserCookie(user);
					response.addCookie(cookie);// 添加cookie到response中
				}
				// 2.将user 设置到session中
				session.put(USER_SESSION, user);
				return SUCCESS;
			}
		}
		this.addFieldError("username", "用户名或密码错误!");
		return "login";
	}
	
	// 用户退出
	public String logout() {
		HttpSession session = request.getSession(false);
		if (session != null)
			session.removeAttribute(USER_SESSION);
		Cookie cookie = cookieUtils.delUserCookie(request);
		if (cookie != null)
			response.addCookie(cookie);
		return "login";
	}
}

