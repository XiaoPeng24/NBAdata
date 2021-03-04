package com.nba.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.Team_honorDao;
import com.nba.bean.Team_honor;

public class Team_honorDaoImpl implements Team_honorDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Team_honor> getTeam_hs() {
		
		Session session = sessionFactory.getCurrentSession();
		List<Team_honor> team_honor = new ArrayList<Team_honor>();
		
		try{
			
			team_honor = session.createQuery("from Team_honor").list();
		} catch(Exception ex){
			ex.printStackTrace();
		}
		
		return team_honor;
	}

}
