package com.nba.service;

import java.util.Map;

import com.nba.bean.Player_team;
import com.nba.bean.Team;

public interface Teamservice {

	public Team getTeamByID(int id);
	
	public Map<String,Player_team> getTeam_Pdata(int id);
}
