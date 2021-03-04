package com.nba.Dao;

import java.util.List;

import com.nba.bean.Coach_team;

public interface Coach_teamDao {

	public List<Coach_team> getCaoch_teamByID(int coachid);
}
