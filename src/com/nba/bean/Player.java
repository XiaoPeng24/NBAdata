package com.nba.bean;

import java.util.List;

public class Player {

	private int id;
	
	private String name;
	
	private String fullname;
	
	private String position;
	
	private String height;
	
	private String weight;
	
	private String birthday;
	
	private String born_city;
	
	private String highschool;
	
	private List teams;
	
	private List honors;
	
	public List getHonors() {
		return honors;
	}

	public void setHonors(List honors) {
		this.honors = honors;
	}

	public int getId() {
		return id;
	}

	public List getTeams() {
		return teams;
	}

	public void setTeams(List teams) {
		this.teams = teams;
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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDraft() {
		return draft;
	}

	public void setDraft(String draft) {
		this.draft = draft;
	}

	private String university;
	
	private String number;
	
	private String draft;
}
