package com.travel.action;

import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import com.travel.database.Database;

import net.sf.json.JSONObject;


public class Signup {
  private String id;
  private String name;
  private String password;
  private String nickname;
  private String question;
  private String answer;
  private String avartar;
  private String age;
  private String gender;
  private String birth_date;
  private String bio;
  private String tags;
  private boolean userCookie;
  private String result;
  
  public String execute() throws Exception { 
      ArrayList<String> tit = new ArrayList<String>() ;
      //tit.add(id);
	  Database.Connect();
	  JSONObject rsjson = new JSONObject();
      tit.add(name);
      tit.add(password);
      tit.add(nickname);
      tit.add(question);
      tit.add(answer);
      //tit.add(avartar);
      tit.add(age);
      tit.add(gender);
      tit.add(birth_date);
      tit.add(bio);
      tit.add(tags);
      //System.out.print(tit);
      boolean flag =Database.signup(tit);
      rsjson.put("result", flag);
	  Database.Close();
      if(flag) return "success";
      else return "error";
     }
  
  

public String getId() {
    return id;
}



public void setId(String id) {
    this.id = id;
}



}
