package com.nba.Dao;

import java.util.List;

import com.nba.bean.Player_team;

public interface Player_teamDao {

	public List<Player_team> getTeam_PdataByID(int teamid);
	
	public List<Player_team> getPlayer_TdataByID(int playerid);
}
