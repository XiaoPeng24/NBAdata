package com.nba.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.Coach_teamDao;
import com.nba.bean.Coach_team;

public class Coach_teamDaoImpl implements Coach_teamDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Coach_team> getCaoch_teamByID(int coachid) {
		
		Session session = sessionFactory.getCurrentSession();
		List<Coach_team> c_ts = new ArrayList<Coach_team>();
		
		try{
			c_ts = session.createQuery("from Coach_team where coach_id=? order by season")
					                  .setInteger(0, coachid).list();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		return c_ts;
	}

}
