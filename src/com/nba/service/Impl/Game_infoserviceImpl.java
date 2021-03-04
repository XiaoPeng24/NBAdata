package com.nba.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.GameDao;
import com.nba.bean.Playerdata;
import com.nba.bean.Teamdata;
import com.nba.bean.Teamname;
import com.nba.service.Game_infoservice;

public class Game_infoserviceImpl implements Game_infoservice {

	@Autowired
	private GameDao game;
	
	public GameDao getGame() {
		return game;
	}

	
//	@Override
//	public Gamedate getDateByID(long id) {
//		
//		return game.getDateByID(id);
//	}

	@Override
	public Teamname getNameByID(long id) {
		
		return game.getNameByID(id);
	}
	
	@Override
	public Teamdata getTeamdataByID(long id,boolean h_or_a) {
		
		return game.getTeamdataByID(id, h_or_a);
	}
	
	@Override
	public List<Playerdata> getPlayerdataByID(long game_id, boolean h_or_a) {
		
		return game.getPlayerdataByID(game_id, h_or_a);
	}

}
