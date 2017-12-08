
package com.travel.action;

import net.sf.json.JSONObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.travel.database.Database;

public class SearchMovie extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String result;
	private String movie;
	private int ind;
	
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
	
	public String SearchMovieName() {
		Database.Connect();
		ResultSet des_list;
		if(ind == 0) des_list = Database.SearchMovie(movie);
		else if(ind == 1) des_list = Database.SearchPlace(movie);
		else if(ind == 2)des_list = Database.SearchTag(movie);
		else des_list = Database.SearchPlot(movie);
		result = createdisJson(des_list);
		Database.Close();
		return SUCCESS;
	}
	

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }
	
}
