package com.travel.action;

import com.opensymphony.xwork2.ActionSupport;
import com.travel.database.Database;

import net.sf.json.JSONObject;

public class DeleteDiscriptionAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String result;
	private String item_id;
	public String DeleteDiscriptionById() {
		Database.Connect();
		JSONObject rsjson = new JSONObject();
		int affectedItemNum = Database.DeleteDiscriptionById(item_id);
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
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	
}
