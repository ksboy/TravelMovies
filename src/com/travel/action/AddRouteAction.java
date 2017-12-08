package com.travel.action;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.travel.database.Database;

public class AddRouteAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String result;
	private String user_id;
	private String ids;
	private String des;
	
	public String AddRoute() {
		Database.Connect();
		JSONObject rsjson = new JSONObject();
		int id = (int)ActionContext.getContext().getSession().get("id");
		user_id = String.valueOf(id);
		//System.out.println(id);
		int affectedItemNum = Database.AddRoute(user_id, ids, des);
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
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
}
