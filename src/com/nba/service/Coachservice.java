package com.nba.service;

import java.util.Map;
import java.util.Vector;

import com.nba.bean.Coach;
import com.nba.bean.Coach_team;

public interface Coachservice {

	public Coach getCoachByID(int id);
	
	public Map<Vector<String>,Coach_team> getCoach_teamsByID(int coachid, boolean re_or_ploff);
	
}
