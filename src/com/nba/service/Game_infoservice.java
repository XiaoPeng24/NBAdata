package com.nba.service;

import java.util.List;

import com.nba.bean.Gamedate;
import com.nba.bean.Playerdata;
import com.nba.bean.Teamdata;
import com.nba.bean.Teamname;

public interface Game_infoservice {
	
//    public Gamedate getDateByID(long id);
	
	public Teamname getNameByID(long id);
	
	public List<Playerdata> getPlayerdataByID(long game_id, boolean h_or_a);
	
	public Teamdata getTeamdataByID(long id,boolean h_or_a);

}
