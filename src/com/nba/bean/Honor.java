package com.nba.bean;

import java.util.List;

public class Honor {
	
    private String name;
    
    private List players;
    
    private List teams;

	public List getTeams() {
		return teams;
	}

	public void setTeams(List teams) {
		this.teams = teams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getPlayers() {
		return players;
	}

	public void setPlayers(List players) {
		this.players = players;
	}
}
