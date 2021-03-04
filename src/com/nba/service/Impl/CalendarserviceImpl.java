package com.nba.service.Impl;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.nba.Dao.GameDao;
import com.nba.service.Calendarservice;

public class CalendarserviceImpl implements Calendarservice {

	@Autowired
	private GameDao game;
	
	public GameDao getGame() {
		return game;
	}

	@Override
	public String getCalendarTabel(int year, int month) {
		    
		    String CalendarTable;
		    StringBuffer buffer = new StringBuffer();  
	        Calendar rili = Calendar.getInstance();  
	        rili.set(year,month-1,1);//將日曆翻到year年month月1日，注意0表示一月，以此類推11表示12月  
	        //獲取1日是星期幾(get方法返回的值是1表示星期日，返回的值是7表示星期六)  
	        int 星期幾 = rili.get(Calendar.DAY_OF_WEEK)-1;  
	        int day = 0;  
	        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)  
	        {  
	            day = 31;  
	        }  
	        if(month==4||month==6||month==9||month==11)  
	        {  
	            day = 30;  
	        }  
	        if(month==2)  
	        {  
	            if(((year%4==0)&&(year%100!=0))||(year%400==0))  
	            {  
	                day = 29;  
	            }  
	            else  
	            {  
	                day = 28;     
	            }  
	        }  
	        String a[] = new String[42];  
	        for(int i=0;i<星期幾;i++)  
	        {  
	            a[i] = " ";  
	        }  
	        for(int i=星期幾,n=1;i<星期幾+day;i++)  
	        {  
	            a[i] = String.valueOf(n);  
	            n++;  
	        }  
	        for(int i=星期幾+day;i<42;i++)  
	        {  
	            a[i] = " ";      
	        }  
	        //用表格顯示數組  
	        buffer.append("<div id='year_month'>"+year+"年"+month+"月</div><br>");
	        buffer.append("<table id='table_calendar' border=1>");  
	        buffer.append("<tr>");  
	        String weekday [] = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};   
	        for(int k=0;k<7;k++)  
	        {  
	            buffer.append("<td>"+weekday[k]+"</td>");  
	        }  
	        buffer.append("</tr>");  
	        for(int k=0;k<42;k=k+7)  
	        {  
	            buffer.append("<tr>");  
	            for(int j=k;j<Math.min(7+k, 42);j++)  
	            {  
	            	Map<Long,String> game_list  = game.getGame_SByDate(year, month, a[j]);
	                
	                String game_S = new String();
	                
	                for(Iterator<Long> itr = game_list.keySet().iterator();itr.hasNext();){
	                	Long game_id = itr.next();
	                	game_S += ("<br><a target='_blank' href='UI/Game_info.action?game_id="
	                	           +game_id+"'><span>"+game_list.get(game_id)+"</span></a>");
	                }
	            	buffer.append("<td align=center> <div id='day_game'>"+a[j]+game_S+
	                		"</div></td>");  
	            }  
	            buffer.append("</tr>");  
	        }  
	        buffer.append("</table>");  
	        CalendarTable = new String(buffer);  
	        return CalendarTable;  
	}

}
