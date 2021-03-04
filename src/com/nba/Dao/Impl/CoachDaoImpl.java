package com.nba.Dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.CoachDao;
import com.nba.bean.Coach;

public class CoachDaoImpl implements CoachDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public Coach getCoachByID(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		Coach c = new Coach();
		
		try{
			c = (Coach)session.get(Coach.class, id);
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		
		return c;
	}

}
