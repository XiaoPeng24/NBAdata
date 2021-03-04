package com.nba.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nba.Dao.GameDao;
import com.nba.Dao.Impl.GameDaoImpl;
import com.nba.service.Calendarservice;
import com.nba.service.Impl.CalendarserviceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CalendarAction extends ActionSupport {
       
	private int year;
	
	private int month;
	
	@Autowired
	@Qualifier("calendarService")
	private Calendarservice calendar;
	
	public Calendarservice getCalendar() {
		return calendar;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	@Override
	public String execute() throws Exception {
		
        HttpServletResponse response = ServletActionContext.getResponse();
		
		response.setContentType("text/html; charset=utf-8");
		response.setHeader("cache-control", "no-cache"); 
		
		PrintWriter out = response.getWriter();
		
		out.println(calendar.getCalendarTabel(year, month));
		out.flush();
		out.close();
		
		return null;
	}
	
}
