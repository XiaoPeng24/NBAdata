<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>My JSP 'showCalendar.jsp' starting page</title>  
      
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    <!--  
    <link rel="stylesheet" type="text/css" href="styles.css" mce_href="styles.css">  
    -->  
  
  </head>  
    
  <body>  
     <jsp:useBean id="rili" class="com.nba.test.bean.CalendarBean" scope="request" />  
     <jsp:setProperty name="rili" property="*"/>  
     <form action="" method="post" name="form">  
     <!-- 輸入日曆的年份:<input type="text" value="2008" name="year" size=5>-->  
                       輸入日曆的年份:   
            <select name="year">  
               <%  
                  for(int i=1900;i<2500;i++)  
                  {  
                      if(i==2015)  
                      {  
                        %>  
                           <option value=<%=i%> selected><%=i%>年</option>  
                        <%  
                      }  
                      else  
                      {  
                         %>  
                           <option value=<%=i%>><%=i%>年</option>  
                         <%  
                      }  
                  }  
                %>  
            </select>               
                       選擇日曆的月份:    
            <select name="month">  
               <%  
                  for(int i=1;i<13;i++)  
                  {  
                      %>  
                         <option value=<%=i%>><%=i%>月</option>  
                      <%  
                  }  
                %>  
            </select>    
            <br/><input type="submit" value="提交" name="submit">          
     </form>  
     <font color="blue"><jsp:getProperty name="rili" property="year"/></font>年  
     <font color="purple"><jsp:getProperty name="rili" property="month"/></font>月的日曆  
     <jsp:getProperty name="rili" property="calendar" />  
  </body>  
</html>  