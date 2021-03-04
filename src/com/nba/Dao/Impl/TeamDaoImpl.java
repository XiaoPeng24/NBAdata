package com.nba.Dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.TeamDao;
import com.nba.bean.Gamedate;
import com.nba.bean.Team;
import com.nba.hibernateUtil.HibernateUtil;

public class TeamDaoImpl implements TeamDao {

	@Autowired
    private  SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public Team getTeamByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Team t = new Team();
		
		try{
			
			t = (Team)session.get(Team.class, id);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return t;
	}

}
