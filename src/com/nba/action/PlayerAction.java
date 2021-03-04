package com.nba.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nba.service.Playerservice;
import com.opensymphony.xwork2.ActionSupport;

public class PlayerAction extends ActionSupport {

    private int id;
    
    @Autowired
    @Qualifier("playerService")
    private Playerservice player;

	public Playerservice getPlayer() {
		return player;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("player", player.getPlayerByID(id));
		request.setAttribute("player_tdata", player.getPlayer_tdataByID(id));
		request.setAttribute("player_honors", player.getPlayer_honorByID(id));
		
		return SUCCESS;
	}
}
