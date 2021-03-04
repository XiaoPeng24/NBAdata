package com.nba.bean;

import java.io.Serializable;

/*
 * 显示教练和球队的效力情况
 */
public class Coach_team implements Serializable{

	private int coach_id;
	
	private int team_id;
	
	private String season;
	
	private boolean re_or_ploff;
	
	private String games;
	
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
	
	private String score;
	
	private String win;
	
	private String lose;
	
	private String winrate;

	public int getCoach_id() {
		return coach_id;
	}

	public void setCoach_id(int coach_id) {
		this.coach_id = coach_id;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public boolean isRe_or_ploff() {
		return re_or_ploff;
	}

	public void setRe_or_ploff(boolean re_or_ploff) {
		this.re_or_ploff = re_or_ploff;
	}

	public String getGames() {
		return games;
	}

	public void setGames(String games) {
		this.games = games;
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}

	public String getLose() {
		return lose;
	}

	public void setLose(String lose) {
		this.lose = lose;
	}

	public String getWinrate() {
		return winrate;
	}

	public void setWinrate(String winrate) {
		this.winrate = winrate;
	}
}
