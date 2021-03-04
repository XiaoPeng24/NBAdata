package com.nba.bean;

import java.util.List;

public class Team {

	private int id;
	
	private String name;
	
	private String en_name;
	
	private String retired_nums;
	
	private String conference;
	
	private String division;
	
	private String short_name;
	
	public List getPlayers() {
		return players;
	}

	public void setPlayers(List players) {
		this.players = players;
	}

	private List players;
	
	private List coaches;
	
	private List honors;

	public List getHonors() {
		return honors;
	}

	public void setHonors(List honors) {
		this.honors = honors;
	}

	public List getCoaches() {
		return coaches;
	}

	public void setCoaches(List coaches) {
		this.coaches = coaches;
	}

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

	public String getEn_name() {
		return en_name;
	}

	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}

	public String getRetired_nums() {
		return retired_nums;
	}

	public void setRetired_nums(String retired_nums) {
		this.retired_nums = retired_nums;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
}
