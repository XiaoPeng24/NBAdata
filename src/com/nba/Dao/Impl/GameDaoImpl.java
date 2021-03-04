package com.nba.Dao.Impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.GameDao;
import com.nba.bean.Gamedate;
import com.nba.bean.Playerdata;
import com.nba.bean.Teamdata;
import com.nba.bean.Teamname;

public class GameDaoImpl implements GameDao {

	@Autowired
	private  SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public Map<Long,String> getGame_SByDate(int year, int month, String day) {
		Session session = sessionFactory.getCurrentSession();
		Map<Long,String> Game_S = new LinkedHashMap<Long,String>();
		try{
			if(!" ".equals(day)){
			String datestr = year+"-"+month+"-"+day;
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟  
		    Date dateutil=sdf.parse(datestr);  
		    java.sql.Date date=new java.sql.Date(dateutil.getTime());
		    @SuppressWarnings("unchecked")
			List<Teamname> tns  = (List<Teamname>) session.createQuery("from Teamname tn left join fetch tn.teamdatas"
					+ " where tn.date = ?").setDate(0, date).list();
		    for(Teamname tn : tns){
		    	
		    	@SuppressWarnings("unchecked")
				Iterator<Teamdata> it = tn.getTeamdatas().iterator();
		    	it.hasNext();
		    	Teamdata td_a = it.next();
		    	Teamdata td_h = it.next();
		    	
		    	Game_S.put(tn.getId(), tn.getAway()+td_a.getScore()+"-"+td_h.getScore()+tn.getHome());
		    }
		   }
		    
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return Game_S;
	}
	
	@Override
	public Gamedate getDateByID(long id) {
		Session session = sessionFactory.getCurrentSession();
		Gamedate gd = new Gamedate();
		
		try{
			
			gd = (Gamedate)session.get(Gamedate.class, id);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return gd;
	}
	
	@Override
	public Teamname getNameByID(long id) {
		Session session = sessionFactory.getCurrentSession();
		Teamname tn = new Teamname();
		
		try{
			
			tn = (Teamname)session.get(Teamname.class, id);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return tn;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Playerdata> getPlayerdataByID(long game_id, boolean h_or_a) {
		Session session = sessionFactory.getCurrentSession();
		List<Playerdata> players = new ArrayList<Playerdata>();
		
		try{
			
			players = (List<Playerdata>)session.createQuery("from Playerdata where game_id=? and"
					+ " h_or_a=?").setLong(0, game_id).setBoolean(1, h_or_a).list();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return players;
	}
	
	@Override
	public Teamdata getTeamdataByID(long id,boolean h_or_a) {
		Session session = sessionFactory.getCurrentSession();
		Teamdata td = new Teamdata();
		
		try{
			
			td = (Teamdata)session.createQuery("from Teamdata where id=? and h_or_a=?")
					              .setLong(0, id).setBoolean(1, h_or_a).uniqueResult();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return td;
	}

}
