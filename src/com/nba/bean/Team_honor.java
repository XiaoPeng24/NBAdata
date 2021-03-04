package com.nba.bean;

import java.io.Serializable;

public class Team_honor implements Serializable{

	private int team_id;
	
	private String honor_name;
	
	private String season;

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getHonor_name() {
		return honor_name;
	}

	public void setHonor_name(String honor_name) {
		this.honor_name = honor_name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
}
