package com.nba.service;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.nba.bean.Player;
import com.nba.bean.Player_honor;
import com.nba.bean.Player_team;

public interface Playerservice {

	public Player getPlayerByID(int playerid);
	
	public Map<Vector<String>, Player_team> getPlayer_tdataByID(int playerid);
	
	public List<Player_honor> getPlayer_honorByID(int playerid);
}
