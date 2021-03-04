<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     <title><tiles:getAsString name="title"/></title>
  </head>
  
  <body>
    <div id="page">
    
        <div id="background">
        
        <div class="header" style="margin-bottom: 0px;">
           
           <div class="logo" >
              <img alt="" src='<tiles:getAsString name="logo-src"/>'>
           </div>
           <div class="itemList" align="center">
                   <div class="item" ><td><a hidefocus="true" href="UI/Game.jsp">比赛</a></td></div>
                   <div class="item" ><td><a hidefocus="true" href="UI/Team.jsp">球队</a></td></div>
                   <div class="item" ><td><a hidefocus="true" href="UI/Player_Coach.jsp">球员/教练</a></td></div>
                   <div class="item" ><td><a hidefocus="true" href="UI/Honor.jsp">荣誉</a></td></div>
                   <div class="item" ><td><a hidefocus="true" href="">帮助</a></td></div>
            </div>
        
        </div>
        <tiles:insertAttribute name="content">
        </tiles:insertAttribute>
        </div>
     </div>
  </body>
</html>
