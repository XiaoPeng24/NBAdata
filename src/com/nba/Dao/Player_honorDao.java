package com.nba.Dao;

import java.util.List;

import com.nba.bean.Player_honor;

public interface Player_honorDao {

	public List<Player_honor> getP_hByID(int playerid);
	
	public List<Player_honor> getP_hdataByName(String honorname);
}
