<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>教练详情</title>
    <link href="../CSS/Coach_info.css" rel="stylesheet" type="text/css">
	
	<script type="text/javascript" src="../scripts/jquery-2.1.4.js"></script>

  </head>
  
  <body>
    <div id="page">
    
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
        
        <div class="coachinfo">
        
          <div class="name"><s:property value="#request.coach.name"/></div>
          <div class="detail">
            <div class="row">
                <div class="column">出生日期：</div>
                <s:property value="#request.coach.birthday"/>
            </div>
            <div class="row">
                <div class="column">出生城市：</div>
                <s:property value="#request.coach.born_city"/>
            </div>
            <div class="row">
                <div class="column">高    中：</div>
                <s:property value="#request.coach.highschool"/>
            </div>
            <div class="row">
                <div class="column">大    学：</div>
                <s:property value="#request.coach.university"/>
            </div>
            <div class="row">
                <div class="column">常规赛：</div>
                <s:property value="#request.coach.coach_career"/>
            </div>
            <div class="row">
                <div class="column">常规赛：</div>
                <s:property value="#request.coach.regulations"/>
            </div>
            <div class="row">
                <div class="column">季后赛：</div>
                <s:property value="#request.coach.playoffs"/>
            </div>
            <div class="row">
                <div class="column">总决赛：</div>
                <s:property value="#request.coach.finals"/>
            </div>
            <div class="row">
                <div class="column">总冠军：</div>
                <s:property value="#request.coach.champions"/>
            </div>
            <div class="row">
                <div class="column">最佳教练：</div>
                <s:property value="#request.coach.COYs"/>
            </div>
          </div>
        
        </div>
        
        <div class="stat_box">
            <div style="float: left;width: 980px;height: 24px;line-height: 18px;margin-left: 130px">
	        <table style="float: right;margin-left: 10px;height: 24px;margin-bottom:-1px;" class="chooser2">
		     <thead>
			  <tr>
				<th class="normal" style="cursor: default;color:white;">
					常规赛
				</th>
			</tr>
		    </thead>
	       </table>
	       </div>
            <table class="stat_box">
                <thead>
                  <tr>
                     <th>赛季<th>球队</th><th>执教</th><th>投篮</th><th>命中</th>
                     <th>出手</th><th>三分</th><th>命中</th><th>出手</th><th>罚球</th>
                     <th>命中</th><th>出手</th><th>篮板</th><th>前场</th>
                     <th>后场</th><th>助攻</th><th>抢断</th><th>盖帽</th><th>失误</th>
                     <th>犯规</th><th>得分</th><th>胜</th><th>负</th><th>胜率</th>
                  </tr>
                </thead>
                <tbody>
                <s:iterator value="#request.coach_team_re" id="column">
                       <tr><s:iterator value="key" id="c">
                         <td><s:property value="c"/></td>
                            </s:iterator>
                             <td><s:property value="value.games"/></td><td><s:property value="value.shoot"/></td>
                             <td><s:property value="value.hit"/></td><td><s:property value="value.shot"/></td>
                             <td><s:property value="value.threep"/></td><td><s:property value="value.hit2"/></td>
                             <td><s:property value="value.shot2"/></td><td><s:property value="value.freet"/></td>
                             <td><s:property value="value.hit3"/></td><td><s:property value="value.shot3"/></td>
                             <td><s:property value="value.backboard"/></td>
                             <td><s:property value="value.frontcourt"/></td><td><s:property value="value.backcourt"/></td>
                             <td><s:property value="value.assists"/></td><td><s:property value="value.steals"/></td>
                             <td><s:property value="value.blockashot"/></td><td><s:property value="value.anerror"/></td>
                             <td><s:property value="value.foul"/></td><td><s:property value="value.score"/></td>
                             <td><s:property value="value.win"/></td><td><s:property value="value.lose"/></td>
                             <td><s:property value="value.winrate"/></td>
                         </s:iterator>
                </tbody>
            </table>
           
            <div style="float: left;width: 980px;height: 24px;line-height: 18px;margin-left: 130px">
	        <table style="float: right;margin-left: 10px;height: 24px;margin-bottom:-1px;" class="chooser2">
		     <thead>
			  <tr>
				<th class="normal" style="cursor: default;color:white;">
					季后赛
				</th>
			</tr>
		    </thead>
	       </table>
	       </div>
            <table class="stat_box">
                <thead>
                  <tr>
                     <th>赛季<th>球队</th><th>执教</th><th>投篮</th><th>命中</th>
                     <th>出手</th><th>三分</th><th>命中</th><th>出手</th><th>罚球</th>
                     <th>命中</th><th>出手</th><th>篮板</th><th>前场</th>
                     <th>后场</th><th>助攻</th><th>抢断</th><th>盖帽</th><th>失误</th>
                     <th>犯规</th><th>得分</th><th>胜</th><th>负</th><th>胜率</th>
                  </tr>
                </thead>
                <tbody>
                <s:iterator value="#request.coach_team_ploff" id="column">
                       <tr><s:iterator value="key" id="c">
                         <td><s:property value="c"/></td>
                            </s:iterator>
                             <td><s:property value="value.games"/></td><td><s:property value="value.shoot"/></td>
                             <td><s:property value="value.hit"/></td><td><s:property value="value.shot"/></td>
                             <td><s:property value="value.threep"/></td><td><s:property value="value.hit2"/></td>
                             <td><s:property value="value.shot2"/></td><td><s:property value="value.freet"/></td>
                             <td><s:property value="value.hit3"/></td><td><s:property value="value.shot3"/></td>
                             <td><s:property value="value.backboard"/></td>
                             <td><s:property value="value.frontcourt"/></td><td><s:property value="value.backcourt"/></td>
                             <td><s:property value="value.assists"/></td><td><s:property value="value.steals"/></td>
                             <td><s:property value="value.blockashot"/></td><td><s:property value="value.anerror"/></td>
                             <td><s:property value="value.foul"/></td><td><s:property value="value.score"/></td>
                             <td><s:property value="value.win"/></td><td><s:property value="value.lose"/></td>
                             <td><s:property value="value.winrate"/></td>
                         </s:iterator>
                </tbody>
            </table>
           
        </div>
      </div>
     </div>
  </body>
</html>
