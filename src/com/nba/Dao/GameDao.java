package com.nba.Dao;

import java.util.List;
import java.util.Map;

import com.nba.bean.Gamedate;
import com.nba.bean.Playerdata;
import com.nba.bean.Teamdata;
import com.nba.bean.Teamname;

public interface GameDao {

	public Map<Long,String> getGame_SByDate(int year,int month,String day);//用年月日查出当天的赛况;
	
	public Gamedate getDateByID(long id);
	
	public Teamname getNameByID(long id);
	
	public Teamdata getTeamdataByID(long id, boolean h_or_a);
	
	public List<Playerdata> getPlayerdataByID(long game_id, boolean h_or_a);
}
