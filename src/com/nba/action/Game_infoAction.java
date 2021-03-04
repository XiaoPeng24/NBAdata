package com.nba.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nba.service.Game_infoservice;
import com.opensymphony.xwork2.ActionSupport;

public class Game_infoAction extends ActionSupport {

	private long game_id;
	
	@Autowired
	@Qualifier("game_infoService")
	private Game_infoservice game_info;
	
	public Game_infoservice getGame_info() {
		return game_info;
	}

	public long getGame_id() {
		return game_id;
	}

	public void setGame_id(long game_id) {
		this.game_id = game_id;
	}

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("date", game_info.getNameByID(game_id).getDate().toString());
		request.setAttribute("teamname_h", game_info.getNameByID(game_id).getHome());
		request.setAttribute("teamname_a", game_info.getNameByID(game_id).getAway());
		request.setAttribute("players_h",game_info.getPlayerdataByID(game_id, true));
		request.setAttribute("players_a",game_info.getPlayerdataByID(game_id, false));
		request.setAttribute("teamdata_h",game_info.getTeamdataByID(game_id, true));
		request.setAttribute("teamdata_a",game_info.getTeamdataByID(game_id, false));
		
		return SUCCESS;
	}
}
