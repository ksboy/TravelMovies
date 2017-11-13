
package com.travel.action;

import java.util.Map;
import java.util.Date;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.travel.bean.User;
import com.travel.dao.UserCheck;
import com.travel.utils.CookieUtils;

import com.travel.database.Database;

public class SignupAction extends ActionSupport{
	private static final long serialVersionUID = -3220291143111112470L;
	public static final String USER_SESSION = "user.session";
	private HttpServletResponse response;
	private HttpServletRequest request;
	private Map<String, Object> session;
	
	private Database db;
	
	public Database getDb() {
		return db;
	}
    public void setDb(Database db) {
		this.db = db;
	}

	
    public SignupAction () {
 	   db = new Database();
 	}
	
	
	public String execute() throws Exception {
	      return "success";
	   }
	
//	private int id;
//	private String name;
//	private String password;
//	private String nickname;
//	private String question;
//	private String answer;
//	private String avartar;
//	private String age;
//	private String gender;
//	private String birth_date;
//	private String bio;
//	private String tags;
//	private boolean userCookie;
//	
//
//	public boolean isUserCookie() {
//		return userCookie;
//	}
//
//	public void setUserCookie(boolean userCookie) {
//		this.userCookie = userCookie;
//	}
//
//	public void setServletResponse(HttpServletResponse response) {
//		this.response = response;
//	}
//
//	public void setServletRequest(HttpServletRequest request) {
//		this.request = request;
//	}
//
//	public void setSession(Map<String, Object> session) {
//		this.session = session;
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	public String getNickname() {
//		return nickname;
//	}
//
//	public void setNickname(String nickname) {
//		this.nickname = nickname;
//	}
//
//	public String getQuestion() {
//		return question;
//	}
//
//	public void setQuestion(String question) {
//		this.question = question;
//	}
//
//	public String getAnswer() {
//		return answer;
//	}
//
//	public void setAnswer(String answer) {
//		this.answer = answer;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//	
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	
//	public String getBirth_date() {
//		return birth_date;
//	}
//
//	public void setBirth_date(String birth_date) {
//		this.birth_date = birth_date;
//	}
//
//	public String getBio() {
//		return bio;
//	}
//
//	public void setBio(String bio) {
//		this.bio = bio;
//	}
//
//	public String getTags() {
//		return tags;
//	}
//
//	public void setTags(String tags) {
//		this.tags = tags;
//	}
    
	public String InsertUser(){
		//Map session;
    	ServletRequest request = ServletActionContext.getRequest();
    	String name=request.getParameter("name");
    	String nickname=request.getParameter("nickname");
    	String question=request.getParameter("question");
    	String answer=request.getParameter("answer");
    	String password=request.getParameter("password");
    	String age=request.getParameter("age");
    	String gender=request.getParameter("gender");
    	String birth_date=request.getParameter("birth_date");
    	String bio=request.getParameter("bio");
    	String tags=request.getParameter("tags");
	    
    	System.out.println(name);
    	System.out.println(nickname);
    	System.out.println(password);
//    	int result=Database.InsertUser(getName().trim(), getNickname().trim(), getQuestion().trim(), getAnswer().trim(), 
//    			getPassword().trim(), getAge(), getGender(), getBirth_date(), getBio().trim(), getTags().trim());
    	
    	int result=Database.InsertUser( name,nickname, question , answer ,  password , age , gender , birth_date , bio , tags);
    	if(result==1) return "success";
    	else return "error";
	}
	
	
	
}
