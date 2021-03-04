package com.nba.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nba.Dao.PlayerDao;
import com.nba.Dao.Player_teamDao;
import com.nba.Dao.TeamDao;
import com.nba.Dao.Impl.PlayerDaoImpl;
import com.nba.Dao.Impl.Player_teamDaoImpl;
import com.nba.Dao.Impl.TeamDaoImpl;
import com.nba.service.Teamservice;
import com.nba.service.Impl.TeamserviceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class TeamAction extends ActionSupport {
	
    private int id;
    
    @Autowired
    @Qualifier("teamService")
    private Teamservice team;
	
    public Teamservice getTeam() {
		return team;
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
		 
		 request.setAttribute("team", team.getTeamByID(id));
		 request.setAttribute("team_pdata", team.getTeam_Pdata(id));
		
		return SUCCESS;
    }
}
