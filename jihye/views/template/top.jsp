<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<style>
body {
  background-color:black;
  margin: 0;
  height: 100%;
  color: white;
  font-family: Arial, Helvetica, sans-serif;
  margin:0px;
}

html {
  height: 100%;
}

.navbar {
  overflow: hidden;
  padding:20px;
  background-color: black;
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

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-family: Arial, Helvetica, sans-serif;
  font-weight: bold;
  font-size: 20px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.menu:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: black;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: white;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.rightmenu {
  float:right;
}
</style>

</head>
<body>

	<div class="navbar">
	 	<a  class="logo" href="/main_after" ><img src="<spring:url value ='/resources/Logo/logo_red.JPG'/>" width="150px" height="50"></a>
	  		  
	  <div class="dropdown">
	    <button class="dropbtn">드라마 
	      <i class="fa fa-caret-down"></i>
	    </button>
	    <div class="dropdown-content">
	      <a href="/dms_dramalist">국내 드라마</a>
	      <a href="/abr_dramalist">해외 드라마</a>
	    </div>
	  </div>
	  
	  <div class="dropdown">
	    <button class="dropbtn">영화 
	      <i class="fa fa-caret-down"></i>
	    </button>
	    <div class="dropdown-content">
	      <a href="/dms_filmlist">국내 영화</a>
	      <a href="/abr_filmlist">해외 영화</a>
	    </div>
	  </div>
	  
	  <a class="menu" href="/favorite/favlist">찜한 콘텐츠</a>
	  
	  <a class="menu" href="/listsearch">검색하기</a>
	  
	  <div class="rightmenu">
		  <div class="dropdown">
		    <button class="dropbtn">
		    <c:if test="${aId != null }">
				${aId} 님
		    </c:if>
		     <c:if test="${mId != null }">
				${mId} 님
		    </c:if>
				<i class="fa fa-caret-down"></i>
		    </button>
		    <div class="dropdown-content">
		      <a href="/member/detail">회원정보</a>
		      <a href="/member/logout">로그아웃</a>
		    </div>
		    
		  </div>
		</div>
		
	</div>

	
</body>
</html>