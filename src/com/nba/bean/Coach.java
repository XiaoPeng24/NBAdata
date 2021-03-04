package com.nba.bean;

import java.util.List;

public class Coach {
	
    private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBorn_city() {
		return born_city;
	}

	public void setBorn_city(String born_city) {
		this.born_city = born_city;
	}

	public String getHighschool() {
		return highschool;
	}

	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCoach_career() {
		return coach_career;
	}

	public void setCoach_career(String coach_career) {
		this.coach_career = coach_career;
	}

	public String getRegulations() {
		return regulations;
	}

	public void setRegulations(String regulations) {
		this.regulations = regulations;
	}

	public String getPlayoffs() {
		return playoffs;
	}

	public void setPlayoffs(String playoffs) {
		this.playoffs = playoffs;
	}

	public String getFinals() {
		return finals;
	}

	public void setFinals(String finals) {
		this.finals = finals;
	}

	public String getChampions() {
		return champions;
	}

	public void setChampions(String champions) {
		this.champions = champions;
	}

	public String getCOYs() {
		return COYs;
	}

	public void setCOYs(String cOYs) {
		COYs = cOYs;
	}

	private String name;
	
	private String birthday;
	
	private String born_city;
	
	private String highschool;
	
	private String university;
	
	private String coach_career;
	
	private String regulations;
	
	private String playoffs;
	
	private String finals;
	
	private String champions;
	
	private String COYs;
	
	private List teams;

	public List getTeams() {
		return teams;
	}

	public void setTeams(List teams) {
		this.teams = teams;
	}
}
