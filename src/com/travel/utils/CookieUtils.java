package com.travel.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.travel.bean.User;
import com.travel.dao.UserCheck;

public class CookieUtils {
	public static final String USER_COOKIE = "user.cookie";
	
	public Cookie addUserCookie(User user) {
		Cookie cookie = new Cookie(USER_COOKIE, user.getUsername() + ","+ user.getPassword());
		System.out.println("Add user cookie");
		cookie.setMaxAge(60*60*24*14);
		return cookie;
	}
	
	public boolean getCookie(HttpServletRequest request, UserCheck userCheck) {
		Cookie[] cookies = request.getCookies();
		System.out.println("Get cookies: " + cookies);
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				System.out.println("Cookie: "+ cookie.getName());
				if(CookieUtils.USER_COOKIE.equals(cookie.getName())) {
					String value = cookie.getValue();
					if(StringUtils.isNotBlank(value)) {
						String[] split = value.split(",");
					}
				}
			}
			
		}
		return false;
	}
}
