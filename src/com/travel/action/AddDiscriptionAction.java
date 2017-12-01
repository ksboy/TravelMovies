package com.travel.action;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.travel.database.Database;

public class AddDiscriptionAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String result;
	private String user_id;
	private String x;
	private String y;
	private String place;
	private String visible;
	private String content;
	private String movie;
	private String thoughts;
	private String tags;
	
	public String AddDiscription() {
		Database.Connect();
		JSONObject rsjson = new JSONObject();
		int id = (int)ActionContext.getContext().getSession().get("id");
		System.out.println(id);
		int affectedItemNum = Database.AddDiscription(user_id, x, y, place, visible, content, movie, thoughts, tags);
		rsjson.put("result", affectedItemNum);
		result = JSONObject.fromObject(rsjson).toString();
		Database.Close();
		if(affectedItemNum == 1) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getVisible() {
		return visible;
	}
	public void setVisible(String visible) {
		this.visible = visible;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getThoughts() {
		return thoughts;
	}
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
}
