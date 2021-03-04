package com.nba.test.bean;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nba.bean.Player;
import com.nba.bean.Player_team;
import com.nba.bean.Playerdata;
import com.nba.bean.Team;
import com.nba.bean.Teamdata;
import com.nba.bean.Teamname;
import com.nba.hibernateUtil.HibernateUtil;

@SuppressWarnings("deprecation")
public class TestBean {
	
	@Autowired
    private SessionFactory sessionfactory;
    
	
    
//    public static void getGamedateByID(long id){
//    	Session session = sessionfactory.openSession();
//		Transaction tx = null;
//		
//		try{
//			tx = session.beginTransaction();
//			
//			Gamedate gd = (Gamedate) session.get(Gamedate.class, id);
//			
//			System.out.println(gd.getTeamname().getHome());
//			
//			tx.commit();
//			
//		} catch(Exception ex){
//			if(null != tx){
//				tx.rollback();
//			}
//		} finally{
//			if(null != session){
//				session.close();
//			}
//			
//		}
//    	
//    }
//    
//	public static void getTeamnameByID(long id){
//    	Session session = sessionfactory.openSession();
//		Transaction tx = null;
//		
//		try{
//			tx = session.beginTransaction();
//			
//			Teamname tn = (Teamname)session.get(Teamname.class, id);
//			
//			System.out.println(tn.getTeamdatas());
//			
//			
//			tx.commit();
//			
//		} catch(Exception ex){
//			if(null != tx){
//				tx.rollback();
//			}
//		} finally{
//			if(null != session){
//				session.close();
//			}
//			
//		}
//    	
//    }
//    
//    public static void getPlaydataByID(long id){
//    	Session session = sessionfactory.openSession();
//		Transaction tx = null;
//		
//		try{
//			tx = session.beginTransaction();
//			
//			Playerdata pd = (Playerdata)session.get(Playerdata.class, id);
//			System.out.println(pd.getTeamdata().getScore());
//			
//			System.out.println(pd.getName());
//			
//			
//			tx.commit();
//			
//		} catch(Exception ex){
//			if(null != tx){
//				tx.rollback();
//			}
//		} finally{
//			if(null != session){
//				session.close();
//			}
//			
//		}
//    	
//    }
//    
//    public static void getTeamByPlayer(int id){
//    	Session session = sessionfactory.openSession();
//		Transaction tx = null;
//		
//		try{
//			tx = session.beginTransaction();
//			
//			Player p = (Player)session.get(Player.class, id);
//			List<Team> teams = (List<Team>)p.getTeams();
//			
//			for(Team team : teams){
//				System.out.println(team.getShort_name());
//			}
//			
//			tx.commit();
//			
//		} catch(Exception ex){
//			if(null != tx){
//				tx.rollback();
//			}
//		} finally{
//			if(null != session){
//				session.close();
//			}
//			
//		}
//    	
//    }
    
//    public static void getTeamdataByID(long id){
//    	Session session = sessionfactory.openSession();
//		Transaction tx = null;
//		
//		try{
//			tx = session.beginTransaction();
//			
//			List<Teamdata> tds = (List<Teamdata>)session.createQuery("from Teamdata where id=?").setLong(0, id).list();
//			
//			for(Teamdata td : tds){
//				System.out.println(td.getScore());
//				System.out.println(td.getTeamname().getAway());
//			}
//			
//			
//			tx.commit();
//			
//		} catch(Exception ex){
//			if(null != tx){
//				tx.rollback();
//			}
//		} finally{
//			if(null != session){
//				session.close();
//			}
//			
//		}
//    	
//    }
    
    public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public static void getTeam_PdataByID(int teamid) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = null;
		List<Player_team> ps = new ArrayList<Player_team>();
		
		try{
			tx = session.beginTransaction();
			
			ps = (List<Player_team>)session.createQuery("from Player_team where team_id=? and season=?")
					                 .setInteger(0, teamid).setString(1, "14-15").list();
			for(Player_team p : ps){
				System.out.println(p.getPlayer_id());
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
    
//    public static void getGame_SByDate(int year,int month,String day){
//    	Session session = sessionfactory.openSession();
//		Transaction tx = null;
//		
//		try{
//			tx = session.beginTransaction();
//			
//			List<String> Game_S = new ArrayList<String>();
//			String datestr = year+"-"+month+"-"+day;
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟  
//		    Date dateutil=sdf.parse(datestr);  
//		    java.sql.Date date=new java.sql.Date(dateutil.getTime());
//		    List<Gamedate> gds  = (List<Gamedate>) session.createQuery("from Gamedate where date = ?")
//		    		               .setDate(0, date).list();
//		    for(Gamedate gd : gds){
//		    	Teamname tn = gd.getTeamname();
//		    	
//		    	Iterator<Teamdata> it = tn.getTeamdatas().iterator();
//		    	it.hasNext();
//		    	Teamdata td_a = it.next();
//		    	Teamdata td_h = it.next();
//		    	
//		    	Game_S.add(tn.getHome()+td_a.getScore()+"-"+td_h.getScore()+tn.getAway());
//		    }
//		    for(Iterator<String> it = Game_S.iterator();it.hasNext();){
//		    	System.out.println(it.next());
//		    }
//		    
//			tx.commit();
//			
//		} catch(Exception ex){
//			if(null != tx){
//				tx.rollback();
//			}
//		} finally{
//			if(null != session){
//				session.close();
//			}
//			
//		}
//    	
//    }
    
    @SuppressWarnings("unchecked")
	public void updatewin_or_lose(int teamid) {
    	Session session = sessionfactory.getCurrentSession();
		List<Teamdata> tds = new ArrayList<Teamdata>();
		
		try{
			tds = (List<Teamdata>)session.createQuery("from Teamdata where id=?")
					                 .setInteger(0, teamid).list();
			Teamdata tda = tds.get(0);
			Teamdata tdh = tds.get(1);
			if(tda.getScore() > tdh.getScore()){
				tda.setWin_or_lose(true);
				tdh.setWin_or_lose(false);
			}else{
				tda.setWin_or_lose(false);
				tdh.setWin_or_lose(true);
			}
			
			session.update(tda);
			session.update(tdh);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
    }
    
    public static void main(String[] args){
    	
//    	getGamedateByID(1);
//    	getTeamdataByID(1);
//    	getTeamnameByID(1);
//    	getGame_SByDate(1985,10,"29");
//    	getPlaydataByID(13);
//    	getTeamByPlayer(45);
    	System.out.println("before");
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"nba.xml");
    	System.out.println("after");
    	TestBean testbean = (TestBean) ctx.getBean("testBean");
    	for(int i = 34655;i<=37460;i++){
    		testbean.updatewin_or_lose(i);
    	}
    }
}
