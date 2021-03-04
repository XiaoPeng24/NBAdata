package com.nba.Dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.PlayerDao;
import com.nba.bean.Gamedate;
import com.nba.bean.Player;
import com.nba.hibernateUtil.HibernateUtil;

public class PlayerDaoImpl implements PlayerDao {

	@Autowired
    private  SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public Player getPlayerByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Player p = new Player();
		
		try{
			
			p = (Player)session.get(Player.class, id);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return p;
	}

}
