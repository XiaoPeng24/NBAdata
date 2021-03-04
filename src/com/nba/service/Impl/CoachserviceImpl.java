package com.nba.service.Impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.CoachDao;
import com.nba.Dao.Coach_teamDao;
import com.nba.Dao.TeamDao;
import com.nba.bean.Coach;
import com.nba.bean.Coach_team;
import com.nba.bean.Team;
import com.nba.service.Coachservice;

public class CoachserviceImpl implements Coachservice {

	@Autowired
	private CoachDao coach;
	
	@Autowired
	private TeamDao team;
	
	public TeamDao getTeam() {
		return team;
	}
	
	@Autowired
	private Coach_teamDao coach_team;
	
	public CoachDao getCoach() {
		return coach;
	}

	public Coach_teamDao getCoach_team() {
		return coach_team;
	}
	@Override
	public Coach getCoachByID(int id) {
		
		return coach.getCoachByID(id);
	}

	@Override
	public Map<Vector<String>, Coach_team> getCoach_teamsByID(int coachid,boolean re_or_ploff) {
		
		List<Coach_team> c_ts = coach_team.getCaoch_teamByID(coachid);
		Map<Vector<String>, Coach_team> coach_tdatas = new LinkedHashMap<Vector<String>,Coach_team>();
		
		for(Coach_team c_t : c_ts){
			if(c_t.isRe_or_ploff() == re_or_ploff){
				Vector<String> season_team = new Vector<String>();
				Team t = team.getTeamByID(c_t.getTeam_id());
				String season = c_t.getSeason();
				
				season_team.add(season);
				season_team.add(t.getName());
				coach_tdatas.put(season_team, c_t);
			}
		}
		
		return coach_tdatas;
	}

}
