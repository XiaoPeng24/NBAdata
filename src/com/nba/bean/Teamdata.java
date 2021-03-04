package com.nba.bean;

import java.io.Serializable;
import java.util.List;

public class Teamdata implements Serializable{

	private long id;
	
	private boolean h_or_a;
	
    private String shoot;
	
	private String hit;
	
	private String shot;
	
	private String threep;
	
	private String hit2;
	
	private String shot2;
	
	private String freet;
	
	private String hit3;
	
	private String shot3;
	
	private String realhit;
	
	private String backboard;
	
	private String frontcourt;
	
	private String backcourt;
	
	private String assists;
	
    private String steals;
	
	private String blockashot;
	
	private String anerror;
	
    private String foul;
	
	private int score;
	
	private boolean win_or_lose;

	public boolean isWin_or_lose() {
		return win_or_lose;
	}

	public void setWin_or_lose(boolean win_or_lose) {
		this.win_or_lose = win_or_lose;
	}

//	private Teamname teamname;
//	
//	private List playerdatas;
	
//	public List getPlayerdatas() {
//		return playerdatas;
//	}
//
//	public void setPlayerdatas(List playerdatas) {
//		this.playerdatas = playerdatas;
//	}
//
//	public Teamname getTeamname() {
//		return teamname;
//	}
//
//	public void setTeamname(Teamname teamname) {
//		this.teamname = teamname;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isH_or_a() {
		return h_or_a;
	}

	public void setH_or_a(boolean h_or_a) {
		this.h_or_a = h_or_a;
	}

	public String getShoot() {
		return shoot;
	}

	public void setShoot(String shoot) {
		this.shoot = shoot;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

	public String getShot() {
		return shot;
	}

	public void setShot(String shot) {
		this.shot = shot;
	}

	public String getThreep() {
		return threep;
	}

	public void setThreep(String threep) {
		this.threep = threep;
	}

	public String getHit2() {
		return hit2;
	}

	public void setHit2(String hit2) {
		this.hit2 = hit2;
	}

	public String getShot2() {
		return shot2;
	}

	public void setShot2(String shot2) {
		this.shot2 = shot2;
	}

	public String getFreet() {
		return freet;
	}

	public void setFreet(String freet) {
		this.freet = freet;
	}

	public String getHit3() {
		return hit3;
	}

	public void setHit3(String hit3) {
		this.hit3 = hit3;
	}

	public String getShot3() {
		return shot3;
	}

	public void setShot3(String shot3) {
		this.shot3 = shot3;
	}

	public String getRealhit() {
		return realhit;
	}

	public void setRealhit(String realhit) {
		this.realhit = realhit;
	}

	public String getBackboard() {
		return backboard;
	}

	public void setBackboard(String backboard) {
		this.backboard = backboard;
	}

	public String getFrontcourt() {
		return frontcourt;
	}

	public void setFrontcourt(String frontcourt) {
		this.frontcourt = frontcourt;
	}

	public String getBackcourt() {
		return backcourt;
	}

	public void setBackcourt(String backcourt) {
		this.backcourt = backcourt;
	}

	public String getAssists() {
		return assists;
	}

	public void setAssists(String assists) {
		this.assists = assists;
	}

	public String getSteals() {
		return steals;
	}

	public void setSteals(String steals) {
		this.steals = steals;
	}

	public String getBlockashot() {
		return blockashot;
	}

	public void setBlockashot(String blockashot) {
		this.blockashot = blockashot;
	}

	public String getAnerror() {
		return anerror;
	}

	public void setAnerror(String anerror) {
		this.anerror = anerror;
	}

	public String getFoul() {
		return foul;
	}

	public void setFoul(String foul) {
		this.foul = foul;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
