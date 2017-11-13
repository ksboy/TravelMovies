package com.travel.action;

import java.util.ArrayList;

import com.travel.database.Database;

import net.sf.json.JSONObject;

public class Login {
     private String name;
     private String password;
 	 private String result;
     
     public String execute() throws Exception { 
         Database.Connect();
 		 JSONObject rsjson = new JSONObject();
         boolean flag =Database.checkUser(name,password);
         rsjson.put("result", flag);
 		 result = JSONObject.fromObject(rsjson).toString();
         Database.Close();
         if(flag) return "success";
         else return "error";
        }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
     
}
