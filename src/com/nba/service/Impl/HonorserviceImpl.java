package com.nba.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.PlayerDao;
import com.nba.Dao.Player_honorDao;
import com.nba.Dao.TeamDao;
import com.nba.Dao.Team_honorDao;
import com.nba.bean.Player;
import com.nba.bean.Player_honor;
import com.nba.bean.Team;
import com.nba.bean.Team_honor;
import com.nba.service.Honorservice;

public class HonorserviceImpl implements Honorservice {

	@Autowired
	private Player_honorDao player_honor;
	
	public Team_honorDao getTeam_honor() {
		return team_honor;
	}
	
	@Autowired
	private PlayerDao player;
	
	@Autowired
	private Team_honorDao team_honor;
	
	@Autowired
	private TeamDao team;
	
	public TeamDao getTeam() {
		return team;
	}

	public Player_honorDao getPlayer_honor() {
		return player_honor;
	}

	public PlayerDao getPlayer() {
		return player;
	}

	@Override
	public String getHonor_pdataTable(String honorname) {
		StringBuffer buffer = new StringBuffer();
		List<Player_honor> phs = player_honor.getP_hdataByName(honorname);
		
		buffer.append("<table class='stat_box'><thead><tr><th>赛季</th><th>球员</th><th>出场</th><th>首发"
				+ "</th><th>时间</th><th>投篮</th><th>命中</th><th>出手</th><th>三分</th><th>命中</th>"
				+ "<th>出手</th><th>罚球</th><th>命中</th><th>出手</th><th>篮板</th><th>前场</th><th>后场</th>"
				+ "<th>助攻</th><th>抢断</th><th>盖帽</th><th>失误</th><th>犯规</th><th>得分</th></tr></thead>"
				+ "<tbody>");
		for(Player_honor ph : phs){
			buffer.append("<tr>");
			buffer.append("<td>"+ph.getTime()+"</td>\n");
			Player p =player.getPlayerByID(ph.getPlayer_id());
			buffer.append("<td>"+p.getName()+"</td>\n");
			buffer.append("<td>"+ph.getGames()+"</td>\n");
			buffer.append("<td>"+ph.getThefirst()+"</td>\n");
			buffer.append("<td>"+ph.getTimeonteam()+"</td>\n");
			buffer.append("<td>"+ph.getShoot()+"</td>\n");
			buffer.append("<td>"+ph.getHit()+"</td>\n");
			buffer.append("<td>"+ph.getShot()+"</td>\n");
			buffer.append("<td>"+ph.getThreep()+"</td>\n");
			buffer.append("<td>"+ph.getHit2()+"</td>\n");
			buffer.append("<td>"+ph.getShot2()+"</td>\n");
			buffer.append("<td>"+ph.getFreet()+"</td>\n");
			buffer.append("<td>"+ph.getHit3()+"</td>\n");
			buffer.append("<td>"+ph.getShot3()+"</td>\n");
			buffer.append("<td>"+ph.getBackboard()+"</td>\n");
			buffer.append("<td>"+ph.getFrontcourt()+"</td>\n");
			buffer.append("<td>"+ph.getBackcourt()+"</td>\n");
			buffer.append("<td>"+ph.getAssists()+"</td>\n");
			buffer.append("<td>"+ph.getSteals()+"</td>\n");
			buffer.append("<td>"+ph.getBlockashot()+"</td>\n");
			buffer.append("<td>"+ph.getAnerror()+"</td>\n");
			buffer.append("<td>"+ph.getFoul()+"</td>\n");
			buffer.append("<td>"+ph.getScore()+"</td>\n");
			buffer.append("</tr>");
		}
		buffer.append("</tbody></table>");
		String Honor_pdataTable = new String(buffer);
		return Honor_pdataTable;
	}
	
	@Override
	public String getTeam_honorTable() {
		StringBuffer buffer = new StringBuffer();
		List<Team_honor> ths = team_honor.getTeam_hs();
		
		buffer.append("<table class='stat_box1'><thead><tr><th>赛季</th><th>球队</th></tr></thead><tbody>");
		for(Team_honor th : ths){
			buffer.append("<tr>");
			Team t = team.getTeamByID(th.getTeam_id());
			buffer.append("<td>"+th.getSeason()+"</td>");
			buffer.append("<td>"+t.getName()+"</td>");
			buffer.append("</tr>");
		}
		buffer.append("</tbody></table>");
		String team_honortable = new String(buffer);
		
		return team_honortable;
	}

}
