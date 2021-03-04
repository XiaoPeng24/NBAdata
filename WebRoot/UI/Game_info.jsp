<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

  
<link href="../CSS/Game_info.css" rel="stylesheet" type="text/css">
	
<script type="text/javascript" src="../scripts/jquery-2.1.4.js"></script>
        
            <div id="date">
                <s:property value="#request.date"/>
            </div>
            
            <div class="basic">
            
                <div class="teamDiv"><s:property value="#request.teamname_a"/></div>
                <div class="scorebox">
                   <div class="score_a"><s:property value="#request.teamdata_a.score"/><div class="away">客场</div></div>
                   
                   <div class="score_h"><s:property value="#request.teamdata_h.score"/><div class="home">主场</div></div>
                   
                </div>
                <div class="teamDiv"><s:property value="#request.teamname_h"/></div>
            
            </div>
            
            <div class="detail">
            
                 <div class="title"><s:property value="#request.teamname_a"/></div>
                 <div class="stat_box">
                    <table class="stat_box">
                      <thead><tr><td>球员</td><td>首发</td><td>时间</td><td>投篮</td><td>命中</td>
                          <td>出手</td><td>三分</td><td>命中</td><td>出手</td><td>罚球</td>
                          <td>命中</td><td>出手</td><td>真实命中率</td><td>篮板</td><td>前场</td>
                          <td>后场</td><td>助攻</td><td>抢断</td><td>盖帽</td><td>失误</td>
                          <td>犯规</td><td>得分</td></tr></thead>
                       <s:iterator value="#request.players_a" id="player_a">
                         <tr><td><s:property value="#player_a.name"/></td><td><s:property value="#player_a.thefirst"/></td>
                             <td><s:property value="#player_a.timeonteam"/></td><td><s:property value="#player_a.shoot"/></td>
                             <td><s:property value="#player_a.hit"/></td><td><s:property value="#player_a.shot"/></td>
                             <td><s:property value="#player_a.threep"/></td><td><s:property value="#player_a.hit2"/></td>
                             <td><s:property value="#player_a.shot2"/></td><td><s:property value="#player_a.freet"/></td>
                             <td><s:property value="#player_a.hit3"/></td><td><s:property value="#player_a.shot3"/></td>
                             <td><s:property value="#player_a.realhit"/></td><td><s:property value="#player_a.backboard"/></td>
                             <td><s:property value="#player_a.frontcourt"/></td><td><s:property value="#player_a.backcourt"/></td>
                             <td><s:property value="#player_a.assists"/></td><td><s:property value="#player_a.steals"/></td>
                             <td><s:property value="#player_a.blockashot"/></td><td><s:property value="#player_a.anerror"/></td>
                             <td><s:property value="#player_a.foul"/></td><td><s:property value="#player_a.score"/></td></tr>
                       </s:iterator>
                          <tr><td>球队总计</td><td></td><td></td><td>投篮</td><td>命中</td>
                          <td>出手</td><td>三分</td><td>命中</td><td>出手</td><td>罚球</td>
                          <td>命中</td><td>出手</td><td>真实命中率</td><td>篮板</td><td>前场</td>
                          <td>后场</td><td>助攻</td><td>抢断</td><td>盖帽</td><td>失误</td>
                          <td>犯规</td><td>得分</td></tr>
                          <tr><td>--</td><td></td><td></td><td><s:property value="#request.teamdata_a.shoot"/></td>
                             <td><s:property value="#request.teamdata_a.hit"/></td><td><s:property value="#request.teamdata_a.shot"/></td>
                             <td><s:property value="#request.teamdata_a.threep"/></td><td><s:property value="#request.teamdata_a.hit2"/></td>
                             <td><s:property value="#request.teamdata_a.shot2"/></td><td><s:property value="#request.teamdata_a.freet"/></td>
                             <td><s:property value="#request.teamdata_a.hit3"/></td><td><s:property value="#request.teamdata_a.shot3"/></td>
                             <td><s:property value="#request.teamdata_a.realhit"/></td><td><s:property value="#request.teamdata_a.backboard"/></td>
                             <td><s:property value="#request.teamdata_a.frontcourt"/></td><td><s:property value="#request.teamdata_a.backcourt"/></td>
                             <td><s:property value="#request.teamdata_a.assists"/></td><td><s:property value="#request.teamdata_a.steals"/></td>
                             <td><s:property value="#request.teamdata_a.blockashot"/></td><td><s:property value="#request.teamdata_a.anerror"/></td>
                             <td><s:property value="#request.teamdata_a.foul"/></td><td><s:property value="#request.teamdata_a.score"/></td></tr>
                    </table>
                 </div>
                 <div class="title"><s:property value="#request.teamname_h"/></div>
                 <div class="stat_box">
                    <table class="stat_box">
                       <thead><tr><td>球员</td><td>首发</td><td>时间</td><td>投篮</td><td>命中</td>
                          <td>出手</td><td>三分</td><td>命中</td><td>出手</td><td>罚球</td>
                          <td>命中</td><td>出手</td><td>真实命中率</td><td>篮板</td><td>前场</td>
                          <td>后场</td><td>助攻</td><td>抢断</td><td>盖帽</td><td>失误</td>
                          <td>犯规</td><td>得分</td></tr></thead>
                       <s:iterator value="#request.players_h" id="player_h">
                         <tr><td><s:property value="#player_h.name"/></td><td><s:property value="#player_h.thefirst"/></td>
                             <td><s:property value="#player_h.timeonteam"/></td><td><s:property value="#player_h.shoot"/></td>
                             <td><s:property value="#player_h.hit"/></td><td><s:property value="#player_h.shot"/></td>
                             <td><s:property value="#player_h.threep"/></td><td><s:property value="#player_h.hit2"/></td>
                             <td><s:property value="#player_h.shot2"/></td><td><s:property value="#player_h.freet"/></td>
                             <td><s:property value="#player_h.hit3"/></td><td><s:property value="#player_h.shot3"/></td>
                             <td><s:property value="#player_h.realhit"/></td><td><s:property value="#player_h.backboard"/></td>
                             <td><s:property value="#player_h.frontcourt"/></td><td><s:property value="#player_h.backcourt"/></td>
                             <td><s:property value="#player_h.assists"/></td><td><s:property value="#player_h.steals"/></td>
                             <td><s:property value="#player_h.blockashot"/></td><td><s:property value="#player_h.anerror"/></td>
                             <td><s:property value="#player_h.foul"/></td><td><s:property value="#player_h.score"/></td></tr>
                       </s:iterator>
                         <tr><td>球队总计</td><td></td><td></td><td>投篮</td><td>命中</td>
                          <td>出手</td><td>三分</td><td>命中</td><td>出手</td><td>罚球</td>
                          <td>命中</td><td>出手</td><td>真实命中率</td><td>篮板</td><td>前场</td>
                          <td>后场</td><td>助攻</td><td>抢断</td><td>盖帽</td><td>失误</td>
                          <td>犯规</td><td>得分</td></tr>
                          <tr><td>--</td><td></td><td></td><td><s:property value="#request.teamdata_h.shoot"/></td>
                             <td><s:property value="#request.teamdata_h.hit"/></td><td><s:property value="#request.teamdata_h.shot"/></td>
                             <td><s:property value="#request.teamdata_h.threep"/></td><td><s:property value="#request.teamdata_h.hit2"/></td>
                             <td><s:property value="#request.teamdata_h.shot2"/></td><td><s:property value="#request.teamdata_h.freet"/></td>
                             <td><s:property value="#request.teamdata_h.hit3"/></td><td><s:property value="#request.teamdata_h.shot3"/></td>
                             <td><s:property value="#request.teamdata_h.realhit"/></td><td><s:property value="#request.teamdata_h.backboard"/></td>
                             <td><s:property value="#request.teamdata_h.frontcourt"/></td><td><s:property value="#request.teamdata_h.backcourt"/></td>
                             <td><s:property value="#request.teamdata_h.assists"/></td><td><s:property value="#request.teamdata_h.steals"/></td>
                             <td><s:property value="#request.teamdata_h.blockashot"/></td><td><s:property value="#request.teamdata_h.anerror"/></td>
                             <td><s:property value="#request.teamdata_h.foul"/></td><td><s:property value="#request.teamdata_h.score"/></td></tr>
                    </table>
                 </div>
                 
                 
            </div>
    
