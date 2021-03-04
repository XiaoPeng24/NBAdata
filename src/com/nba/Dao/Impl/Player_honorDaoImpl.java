package com.nba.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.Player_honorDao;
import com.nba.bean.Player_honor;

public class Player_honorDaoImpl implements Player_honorDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Player_honor> getP_hByID(int playerid) {

		Session session = sessionFactory.getCurrentSession();
		List<Player_honor> p_hs  = null;
		
		try{
			
			p_hs = (List<Player_honor>)session.createQuery("from Player_honor where player_id = ?")
					                                        .setInteger(0, playerid).list();
			
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return p_hs;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Player_honor> getP_hdataByName(String honorname) {
		Session session = sessionFactory.getCurrentSession();
		List<Player_honor> p_hs  = null;
		
		try{
			
			p_hs = (List<Player_honor>)session.createQuery("from Player_honor where honor_name = ?"
					                              + "order by time").setString(0, honorname).list();
			
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return p_hs;
	}

}
