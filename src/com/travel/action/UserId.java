package com.travel.action;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.travel.database.Database;

public class UserId extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String user_id;
    private String result;
	
	public String GetId() {
	    Database.Connect();
		JSONObject rsjson = new JSONObject();
		int id = (int)ActionContext.getContext().getSession().get("id");
		user_id = Database.SearchName(id);
        rsjson.put("result", user_id);
        result = JSONObject.fromObject(rsjson).toString();
        Database.Close();
		return SUCCESS;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
