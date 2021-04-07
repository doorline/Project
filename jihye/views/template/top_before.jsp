<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<style>
body {
  background-color:black;
  color: white;
  font-family: Arial, Helvetica, sans-serif;
  margin:0px;
}

.navbar {
  overflow: hidden;
  padding:20px;
  background-color: black;
}

a, a:link, a:visited {
  color: white;
  text-decoration: none;
  algin: center;
}

.menu {
  font-family: Arial, Helvetica, sans-serif;
  font-weight: bold;
  float: left;
  font-size: 20px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.logo {
  margin:10px 10px;
  float: left;
  font-size: 20px;
  color: white;
  text-align: center;
  padding: 0px;
  text-decoration: none;
}

.menu:hover {
  background-color: red;
}

.rightmenu {
  float:right;
}
</style>

</head>
<body>

	<div class="navbar">
	 	<a  class="logo" href="/" ><img src="<spring:url value ='/resources/Logo/logo_red.JPG'/>" width="150px" height="50"></a>
	  			  
	<div class="rightmenu">		 
	   <a class="menu" href="msinfo">멤버십 안내</a>
	</div>
	
	</div>

	
</body>
</html>