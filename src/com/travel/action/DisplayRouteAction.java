package com.travel.action;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.travel.database.Database;

public class DisplayRouteAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String result;
	private String route_id;
	
	public String createdisJson(ResultSet dis) {
		JSONObject outer = new JSONObject();
		List<JSONObject> outerlist = new ArrayList<JSONObject>();
		try {
			while(dis.next()) {
				String item_id = dis.getString("item_id");
				String user_id = dis.getString("user_id");
				String x = dis.getString("x");
				String y = dis.getString("y");
				String place = dis.getString("place");
				String visible = dis.getString("visible");
				String content = dis.getString("content");
				String movie = dis.getString("movie");
				String thoughts = dis.getString("thoughts");
				String tags = dis.getString("tags");
				JSONObject inner = new JSONObject();
				inner.put("item_id", item_id);
				inner.put("user_id", user_id);
				inner.put("x", x);
				inner.put("y", y);
				inner.put("place", place);
				inner.put("visible", visible);
				inner.put("content", content);
				inner.put("movie", movie);
				inner.put("thoughts", thoughts);
				inner.put("tags", tags);
				outerlist.add(inner);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		outer.put("dis", outerlist);
		return JSONObject.fromObject(outer).toString();
	}
	
	public String DisplayRoute() {
		Database.Connect();
		ResultSet dis_list = Database.DisplayRoute(route_id);
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
	public String getRoute_id() {
		return route_id;
	}

	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}
}
