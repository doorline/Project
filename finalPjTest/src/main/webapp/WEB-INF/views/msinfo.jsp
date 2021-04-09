<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버십 안내</title>
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
#bottom {
  width:100%;
  height:100px;
  font-family: Arial, Helvetica, sans-serif;
  font-weight: lighter;
  bottom:0;
  background:black;
  text-align: center;
  color: white;
}
#membership_chart {
  position: relative;
  left: 70%;
  transform: translate(-50%);
}
</style>
</head>
<body>

	<div class="navbar">
	 	<a  class="logo" href="/" ><img src="<spring:url value ='/resources/Logo/logo_red.JPG'/>" width="150px" height="50"></a>
	  			  
	<div class="rightmenu">		 
	   <a class="menu" href="/member/joinPage">멤버십 시작하기</a>
	</div>
	
	</div>
	 

	<br/>

	<h1 align="center">Watching 멤버십 가격표</h1>
	
	<div id="membership_chart">
	<img src="resources\Logo\membership.JPG"/>
	</div>
	
	<p/>
	
	
	<table id="bottom" width="100%" bgcolor='black'>
		<tr height="5">
			<td align="center"> 
			<font color="white" size="2">
			OTT Platform Web Site WATCHING  | 권문선, 백지혜, 임성섭 | Project Duration 2021.02.23 - 2021.03
			| Vision Occupation Training School | Daejeon, Korea | 042-252-5963
			
			</font> 
			</td>
		</tr>
	</table>



</body>
</html>