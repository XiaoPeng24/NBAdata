package com.nba.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nba.service.Honorservice;
import com.opensymphony.xwork2.ActionSupport;

public class HonorAction extends ActionSupport {

	private String honorname;
	
	@Autowired
	@Qualifier("honorService")
	private Honorservice honor;

	public String getHonorname() {
		return honorname;
	}

	public void setHonorname(String honorname) {
		this.honorname = honorname;
	}

	public Honorservice getHonor() {
		return honor;
	}
	
	@Override
	public String execute() throws Exception {
		
		HttpServletResponse response = ServletActionContext.getResponse();
		
		response.setContentType("text/html; charset=utf-8");
		response.setHeader("cache-control", "no-cache");
		
		String resulttable;
		if("总冠军".equals(honorname)){
			System.out .println("xiao:"+honorname);
			resulttable = honor.getTeam_honorTable();
			
		}else{
			resulttable = honor.getHonor_pdataTable(honorname);
		}
		
		PrintWriter out = response.getWriter();
		out.println(resulttable);
		
		out.flush();
		out.close();
		
		return null;
	}
	
}
