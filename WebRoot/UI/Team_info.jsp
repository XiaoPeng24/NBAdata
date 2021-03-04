<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>球队详情</title>
    <link href="../CSS/Team_info.css" rel="stylesheet" type="text/css">
	
	<script type="text/javascript" src="../scripts/jquery-2.1.4.js"></script>
  </head>
  
  <body><div id="page">
    
        <div id="background">
        
        <div class="header" style="margin-bottom: 0px;">
           
           <div class="logo" >
              <img alt="" src="../Picture/logo.png">
           </div>
           <div class="itemList" align="center">
                   <div class="item" ><td><a hidefocus="true" href="../">比赛</a></td></div>
                   <div class="item" ><td><a hidefocus="true" href="Team.jsp">球队</a></td></div>
                   <div class="item" ><td><a hidefocus="true" href="Player_Coach.jsp">球员/教练</a></td></div>
                   <div class="item" ><td><a hidefocus="true" href="Honor.jsp">荣誉</a></td></div>
                   <div class="item" ><td><a hidefocus="true" href="">帮助</a></td></div>
            </div>
        
        </div>
        
        <div class="intro">
        
            <div class="text">
                <div class="head"> <s:property value="#request.team.name"/> </div>
                <div class="row">
                   <div class="column">英文名：</div>
                   <div class="value"><s:property value="#request.team.en_name"/></div>
                </div>
                <div class="row">
                   <div class="column">退役球衣：</div>
                   <div class="value"><s:property value="#request.team.retired_nums"/></div>
                </div>
            </div>
        
        </div>
        
        <div class="title">14-15赛季效力球员数据</div> 
        
        <div class="stat_box">
           <table class="stat_box">
                <thead>
                  <tr>
                     <th>球员</th><th>出场</th><th>首发</th><th>时间</th><th>投篮</th><th>命中</th>
                     <th>出手</th><th>三分</th><th>命中</th><th>出手</th><th>罚球</th>
                     <th>命中</th><th>出手</th><th>篮板</th><th>前场</th>
                     <th>后场</th><th>助攻</th><th>抢断</th><th>盖帽</th><th>失误</th>
                     <th>犯规</th><th>得分</th>
                  </tr>
                </thead>
                <tbody>
                <s:iterator value="#request.team_pdata" id="column">
                       <tr>
                         <td><s:property value="key"/></td>
                        
                             <td><s:property value="value.games"/></td><td><s:property value="value.thefirst"/></td>
                             <td><s:property value="value.timeonteam"/></td><td><s:property value="value.shoot"/></td>
                             <td><s:property value="value.hit"/></td><td><s:property value="value.shot"/></td>
                             <td><s:property value="value.threep"/></td><td><s:property value="value.hit2"/></td>
                             <td><s:property value="value.shot2"/></td><td><s:property value="value.freet"/></td>
                             <td><s:property value="value.hit3"/></td><td><s:property value="value.shot3"/></td>
                             <td><s:property value="value.backboard"/></td>
                             <td><s:property value="value.frontcourt"/></td><td><s:property value="value.backcourt"/></td>
                             <td><s:property value="value.assists"/></td><td><s:property value="value.steals"/></td>
                             <td><s:property value="value.blockashot"/></td><td><s:property value="value.anerror"/></td>
                             <td><s:property value="value.foul"/></td><td><s:property value="value.score"/></td>
                         </s:iterator>
                       </tr>
                
                </tbody>
           </table>
        </div>
        
        
      </div>
     </div>
      
  </body>
</html>
