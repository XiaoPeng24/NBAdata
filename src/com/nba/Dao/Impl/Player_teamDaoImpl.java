package com.nba.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.Player_teamDao;
import com.nba.bean.Player_team;

@SuppressWarnings("unchecked")
public class Player_teamDaoImpl implements Player_teamDao {

	@Autowired
	private  SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public List<Player_team> getTeam_PdataByID(int teamid) {
		Session session = sessionFactory.getCurrentSession();
		List<Player_team> ps = new ArrayList<Player_team>();
		
		try{
			
			ps = (List<Player_team>)session.createQuery("from Player_team where team_id=? and season=?"
					               + "order by score desc").setInteger(0, teamid).setString(1, "14-15").list();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return ps;
	}
	
	@Override
	public List<Player_team> getPlayer_TdataByID(int playerid) {
		Session session = sessionFactory.getCurrentSession();
		List<Player_team> ps = new ArrayList<Player_team>();
		
		try{
			
			ps = (List<Player_team>)session.createQuery("from Player_team where player_id=?"
					               + "order by season").setInteger(0, playerid).list();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return ps;
	}

}
