package com.travel.action;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.travel.database.Database;

public class ReadRouteAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String result;
	
	public String createdisJson(ResultSet dis) {
		JSONObject outer = new JSONObject();
		List<JSONObject> outerlist = new ArrayList<JSONObject>();
		try {
			while(dis.next()) {
				String route_id = dis.getString("route_id");
				String user_id = dis.getString("user_id");
				String item_ids = dis.getString("item_ids");
				String des = dis.getString("des");
				JSONObject inner = new JSONObject();
				inner.put("route_id", route_id);
				inner.put("user_id", user_id);
				inner.put("item_ids", item_ids);
				inner.put("des", des);
				outerlist.add(inner);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		outer.put("dis", outerlist);
		return JSONObject.fromObject(outer).toString();
	}
	
	public String ReadRoute() {
		Database.Connect();
		ResultSet dis_list = Database.ReadRoute();
		result = createdisJson(dis_list);
		Database.Close();
		return SUCCESS;
	}
	public String ReadSelfRoute() {
		Database.Connect();
		int id = (int)ActionContext.getContext().getSession().get("id");
		ResultSet dis_list = Database.ReadSelfRoute(String.valueOf(id));
		result = createdisJson(dis_list);
		Database.Close();
		return SUCCESS;
	}
	public String ReadFavRoute() {
		Database.Connect();
		int id = (int)ActionContext.getContext().getSession().get("id");
		ResultSet dis_list = Database.ReadFavRoute(String.valueOf(id));
		result = createdisJson(dis_list);
		Database.Close();
		return SUCCESS;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
