package com.nba.service.Impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.PlayerDao;
import com.nba.Dao.Player_honorDao;
import com.nba.Dao.Player_teamDao;
import com.nba.Dao.TeamDao;
import com.nba.bean.Player;
import com.nba.bean.Player_honor;
import com.nba.bean.Player_team;
import com.nba.bean.Team;
import com.nba.service.Playerservice;

public class PlayerserviceImpl implements Playerservice {

	@Autowired
	private PlayerDao player;
	
	@Autowired
	private TeamDao team;
	
	public TeamDao getTeam() {
		return team;
	}

	@Autowired
	private Player_teamDao player_team;
	
	@Autowired
	private Player_honorDao player_honor;
	
	public PlayerDao getPlayer() {
		return player;
	}

	public Player_teamDao getPlayer_team() {
		return player_team;
	}

	public Player_honorDao getPlayer_honor() {
		return player_honor;
	}

	@Override
	public Player getPlayerByID(int playerid) {
		
		return player.getPlayerByID(playerid);
	}

	@Override
	public Map<Vector<String>, Player_team> getPlayer_tdataByID(int playerid) {
		
		
		Map<Vector<String>, Player_team> player_tdata = new LinkedHashMap<Vector<String>,Player_team>();
		List<Player_team> pts = player_team.getPlayer_TdataByID(playerid);
		for(Player_team pt : pts){
			Vector<String> season_team = new Vector<String>();
			Team t = team.getTeamByID(pt.getTeam_id());
			String season = pt.getSeason();
			season_team.add(season);
			season_team.add(t.getName());
			player_tdata.put(season_team, pt);
		}
		
//		for(Iterator<Vector<String>> itr = player_tdata.keySet().iterator();itr.hasNext();){
//			System.out.println("xiao"+itr.next());
//		}
		
		return player_tdata;
	}

	@Override
	public List<Player_honor> getPlayer_honorByID(int playerid) {
		
		return player_honor.getP_hByID(playerid);
	}

}
