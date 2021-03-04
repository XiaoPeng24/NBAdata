<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>NBA荣誉列表</title>
    <link href="../CSS/Honor.css" rel="stylesheet" type="text/css">
	
	<script type="text/javascript" src="../scripts/jquery-2.1.4.js"></script>
	
	<script type="text/javascript">
	
	    $(function(){
	    	$(".honor > input").click(function(){
	    		$.post("Honor.action",{
	    			honorname: $("input:checked").first().val(),
	    		    t_or_p: $("input:checked").first().val()
	    		},function(returnedData, status){
	    			$("div.stat_box").html(returnedData);
	    		});
	    	});
	    });
	
	</script>

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
        
        <div class="title">NBA荣誉</div>
        
        <div class="honors">
                    
            <label class="honor">最有价值球员(MVP)
                  <input type="radio" name="honorname" value="最有价值球员(MVP)">
            </label>
            <label class="honor">最佳防守球员(DPOY)
                   <input type="radio" name="honorname" value="最佳防守球员(DPOY)">
            </label>
            <label class="honor">最佳新秀(ROY)
                   <input type="radio" name="honorname" value="最佳新秀(ROY)">
            </label>
            <label class="honor">最佳第六人(SMOY)
                   <input type="radio" name="honorname" value="最佳第六人(SMOY)">
            </label>
            <label class="honor">进步最快球员(MIP)
                   <input type="radio" name="honorname" value="进步最快球员(MIP)">
            </label>
            <label class="honor">总决赛最有价值球员(FMVP)
                   <input type="radio" name="honorname" value="总决赛最有价值球员(FMVP)">
            </label>
            <label class="honor">全明星最有价值球员(AMVP)
                   <input type="radio" name="honorname" value="全明星最有价值球员(AMVP)">
            </label>
            <label class="honor">总冠军
                   <input type="radio" name="honorname" value="总冠军">
            </label>
                       
        </div>
        
       <div class="title">历史一览</div> 
       <div class="stat_box">
         
        </div>
     
     </div>
     
    </div>
  </body>
</html>
