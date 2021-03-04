<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>NBA球队</title>
    <link href="../CSS/Team.css" rel="stylesheet" type="text/css">
	
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
        
        <div class="title">
           NBA著名球队
        </div>
        
        <div class="stat_box">
         
           <table class="stat_box">
             <tbody>
             
                <tr>
                  <th colspan="3" style="font-size: 18px;cursor: default" class="normal">东部</th>
                  <th colspan="3" style="font-size: 18px;cursor: default" class="normal">西部</th>
                </tr>
                  
                <tr>
                  <th class="normal" style="font-size: 14px;cursor: default">中区</th>
                  <th class="normal" style="font-size: 14px;cursor: default">大西洋区</th>
                  <th class="normal" style="font-size: 14px;cursor: default">东南区</th>
                  <th class="normal" style="font-size: 14px;cursor: default">西北区</th>
                  <th class="normal" style="font-size: 14px;cursor: default">太平洋区</th>
                  <th class="normal" style="font-size: 14px;cursor: default">西南区</th>     
                </tr>
                
                <tr>
                  <td>
                     <div class="team">
                        <a target="_blank" class="team" href="Team.action?id=1">
                          <img alt="" src="../Picture/CHI.gif">
                          <div>芝加哥公牛</div>
                        </a>
					 </div>
					 <div class="team">
						<a target="_blank" class="team" href="Team.action?id=2">
						  <img alt="" src="../Picture/CLE.gif">
						  <div>克里夫兰骑士</div>
						</a>
					 </div>
                  </td>
                  <td>
                     <div class="team">
						<a target="_blank" class="team" href="Team.action?id=3">
						   <img alt="" src="../Picture/BKN.gif">
						   <div>布鲁克林篮网</div>
						</a>
					 </div>
					 <div class="team">
					    <a target="_blank" class="team" href="Team.action?id=4">
					       <img alt="" src="../Picture/NYK.gif">
					       <div>纽约尼克斯</div>
					    </a>
					 </div>
                  </td>
                  <td>
                     <div class="team">
						<a target="_blank" class="team" href="Team.action?id=5">
						   <img alt="" src="../Picture/MIA.gif">
						   <div>迈阿密热火</div>
						</a>
					 </div>
					 <div class="team">
						<a target="_blank" class="team" href="Team.action?id=6">
						   <img alt="" src="../Picture/WAS.gif">
						   <div>华盛顿奇才</div>
						</a>
					 </div>
                  </td>
                  <td>
                     <div class="team">
						<a target="_blank" class="team" href="Team.action?id=7">
						    <img alt="" src="../Picture/OKC.gif">
						    <div>俄克拉荷马雷霆</div>
						</a>
					 </div>
					 <div class="team">
						<a target="_blank" class="team" href="Team.action?id=8">
						    <img alt="" src="../Picture/POR.gif">
						    <div>波特兰开拓者</div>
						</a>
					 </div>
                  </td>
                  <td>
                     <div class="team">
						<a target="_blank" class="team" href="Team.action?id=9">
						   <img alt="" src="../Picture/GSW.gif">
						   <div>金州勇士</div>
						</a>
					 </div>
					 <div class="team">
						<a target="_blank" class="team" href="Team.action?id=10">
						   <img alt="" src="../Picture/LAL.gif">
						   <div>洛杉矶湖人</div>
						</a>
					 </div>
                  </td>
                  <td>
                     <div class="team">
						<a target="_blank" class="team" href="Team.action?id=11">
						   <img alt="" src="../Picture/HOU.gif">
						   <div>休斯顿火箭</div>
						</a>
					 </div>
					 <div class="team">
						<a target="_blank" class="team" href="Team.action?id=12">
						   <img alt="" src="../Picture/SAS.gif">
						   <div>圣安东尼奥马刺</div>
						</a>
					 </div>
                  </td>
                </tr>
             
             </tbody>
           </table>
         
        </div>
        
      </div>
     </div>
  </body>
</html>
