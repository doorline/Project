<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin:0px;
}

.navbar {
  overflow: hidden;
  padding:20px;
  background-color: black;
}

.navbar a {
  float: left;
  font-size: 20px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 20px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
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
	  <a href="/">Watching</a>
	  
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
	  
	  <a href="/favorite/favlist">찜한 콘텐츠</a>
	  
	  <a href="/listsearch">검색하기</a>
	  
	  <div class="rightmenu">
		  <div class="dropdown">
		    <button class="dropbtn">검색 
		      <i class="fa fa-caret-down"></i>
		    </button>
		    <div class="dropdown-content">
		      <input type="text" name="keyword" value="${keyword}"/>
				<button type="button">검색</button>
		    </div>
		    </div>
		    
		  <div class="dropdown">
		    <button class="dropbtn">계정 
		      <i class="fa fa-caret-down"></i>
		    </button>
		    <div class="dropdown-content">
		      <a href="">회원정보</a>
		      <a href="">로그아웃</a>
		    </div>
		  </div>
		  
		  <a href="">로그인</a>
		 
		</div>
	</div>

	
</body>
</html>