package com.nba.service.Impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.PlayerDao;
import com.nba.Dao.Player_teamDao;
import com.nba.Dao.TeamDao;
import com.nba.bean.Player;
import com.nba.bean.Player_team;
import com.nba.bean.Team;
import com.nba.service.Teamservice;

public class TeamserviceImpl implements Teamservice {

	@Autowired
	private TeamDao team;
	
	@Autowired
	private PlayerDao player;
	
	@Autowired
	private Player_teamDao player_team;
	
	public PlayerDao getPlayer() {
		return player;
	}

	public Player_teamDao getPlayer_team() {
		return player_team;
	}

	public TeamDao getTeam() {
		return team;
	}

	@Override
	public Team getTeamByID(int id){
		return team.getTeamByID(id);
	}
	
	public Map<String,Player_team> getTeam_Pdata(int teamid){
		
		Map<String,Player_team> team_pdata = new LinkedHashMap<String,Player_team>();
		
		List<Player_team> p_ts =  player_team.getTeam_PdataByID(teamid);
		
		for(Player_team p_t : p_ts){
			Player p = player.getPlayerByID(p_t.getPlayer_id());
			team_pdata.put(p.getName(), p_t);
		}
		
		return team_pdata;
		
	}

}
