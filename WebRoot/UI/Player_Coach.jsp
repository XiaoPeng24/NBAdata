<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>NBA著名球员/教练</title>
    <link href="../CSS/Player.css" rel="stylesheet" type="text/css">
	
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
           NBA现役著名球员列表
        </div>
        
        <div class="playerList">
            <div class="name">
               <a class="starplayer" href="Player.action?id=45" target="_blank">
                 <span>卡梅罗-安东尼/Carmelo Anthony</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=104" target="_blank">
                 <span>拉玛库斯-阿尔德里奇/LaMarcus Aldridge</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=149" target="_blank">
                 <span>吉米-巴特勒/Jimmy Butler</span>
               </a> 
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=195" target="_blank">
                 <span>科比-布莱恩特/Kobe Bryant</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=319" target="_blank">
                 <span>克里斯-波什/Chris Bosh</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=526" target="_blank">
                 <span>斯蒂芬-库里/Stephen Curry</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=779" target="_blank">
                 <span>凯文-杜兰特/Kevin Durant</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=785" target="_blank">
                 <span>蒂姆-邓肯/Tim Duncan</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=1316" target="_blank">
                 <span>马努-吉诺比利/Manu Ginobili</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=1355" target="_blank">
                 <span>保罗-加索尔/Pau Gasol</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=1367" target="_blank">
                 <span>凯文-加内特/Kevin Garnett</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=1437" target="_blank">
                 <span>德怀特-霍华德/Dwight Howard</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=1628" target="_blank">
                 <span>詹姆斯-哈登/James Harden</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=1690" target="_blank">
                 <span>凯里-欧文/Kyrie Irving</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=1862" target="_blank">
                 <span>勒布朗-詹姆斯/LeBron James</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=2069" target="_blank">
                 <span>凯文-乐福/Kevin Love</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=2961" target="_blank">
                 <span>德里克-罗斯/Derrick Rose</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=3175" target="_blank">
                 <span>阿玛雷-斯塔德迈尔/Amare Stoudemire</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=3920" target="_blank">
                 <span>拉塞尔-威斯布鲁克/Russell Westbrook</span>
               </a>
            </div>
            <div class="name">
                <a class="starplayer" href="Player.action?id=4009" target="_blank">
                 <span>约翰-沃尔/John Wall</span>
               </a>
            </div>
        </div>
        
        <div class="title">
           NBA现役著名教练列表
        </div>
        
        <div class="coachList">
            <div class="name">
               <a class="starcoach" href="Coach.action?id=31" target="_blank">
                 <span>斯科特-布鲁克斯/Scott Brooks</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=124" target="_blank">
                 <span>莱昂内尔-霍林斯/Lionel Hollins</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=188" target="_blank">
                 <span>凯文-麦克海尔/Kevin McHale </span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=218" target="_blank">
                 <span>格雷格-波波维奇/Gregg Popovich</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=247" target="_blank">
                 <span>拜伦-斯科特/Byron Scott</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=261" target="_blank">
                 <span>埃里克-斯波尔斯特拉/Erik Spoelstra</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=266" target="_blank">
                 <span>特里-斯托特斯/Terry Stotts</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=271" target="_blank">
                 <span>汤姆-希伯杜/Tom Thibodeau</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=304" target="_blank">
                 <span>兰迪-惠特曼/Randy Wittman</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=309" target="_blank">
                 <span>德里克-费舍尔/Derek Fisher</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=310" target="_blank">
                 <span>斯蒂夫-科尔/Steve Kerr</span>
               </a>
            </div>
            <div class="name">
               <a class="starcoach" href="Coach.action?id=311" target="_blank">
                 <span>大卫-布拉特/David Blatt</span>
               </a>
            </div>
        </div>
     </div>
    </div>
  </body>
</html>
