<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<link href="CSS/Game.css" rel="stylesheet" type="text/css">
	
	<script type="text/javascript" src="scripts/jquery-2.1.4.js"></script>
	
	<style type="text/css">
	
	    .divOver{
	       background:#4b8ccb;
	    }
	
	</style>
	
	<script type="text/javascript">
	    
	  
	   $(function(){
		   $(".year").hover(function(){
	    		$(this).addClass("divOver");
	    	},function(){
	    		$(this).removeClass("divOver");
	    	});
	    	
	    	$(".month").hover(function(){
	    		$(this).addClass("divOver");
	    	},function(){
	    		$(this).removeClass("divOver");
	    	});
	    	
	    	$(".year > input").click(function(){
	    		$.post("UI/Calendar.action",
	    		{
	    			year: $("input:checked").first().val(),
	    		    month: $("input:checked").last().val()
	    		}, function(returnedData, status){
	    			$("#calendar").html(returnedData);
	    		});
	    	});
	    	
	    	$(".month > input").click(function(){
	    	    $.post("UI/Calendar.action",
	    	    {
	    	    	year: $("input:checked").first().val(),
	    	    	month: $("input:checked").last().val()
	    	    }, function(returnedData, status){
	    	    	$("#calendar").html(returnedData);
	    	    });
	    	});
	    });
	</script>
	
	<tiles:insertDefinition name="Game-definition" flush="true"></tiles:insertDefinition>