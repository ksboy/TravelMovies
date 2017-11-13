package com.travel.action;

import java.util.ArrayList;

import com.travel.database.Database;

public class Login {
     private String name;
     private String password;
     
     public String execute() throws Exception { 
        
         Database.Connect();
         boolean flag =Database.checkUser(name,password);
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
     
}
