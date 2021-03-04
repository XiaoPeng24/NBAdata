package com.nba.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nba.service.Coachservice;
import com.opensymphony.xwork2.ActionSupport;

public class CoachAction extends ActionSupport {

	private int id;

	@Autowired
	@Qualifier("coachService")
	private Coachservice coach;
	
	public Coachservice getCoach() {
		return coach;
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
		
		request.setAttribute("coach", coach.getCoachByID(id));
		request.setAttribute("coach_team_re", coach.getCoach_teamsByID(id, true));
		request.setAttribute("coach_team_ploff", coach.getCoach_teamsByID(id, false));
		
		return SUCCESS;
	}
}
