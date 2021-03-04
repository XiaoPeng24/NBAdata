package com.nba.bean;

import java.sql.Date;
import java.util.List;

public class Teamname {

	private long id;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private String home;
	
	private String away;
	
    private Date date;
	
	private List teamdatas;
	
	public List getTeamdatas() {
		return teamdatas;
	}

	public void setTeamdatas(List teamdatas) {
		this.teamdatas = teamdatas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getAway() {
		return away;
	}

	public void setAway(String away) {
		this.away = away;
	}
}
