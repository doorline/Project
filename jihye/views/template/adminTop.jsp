<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
.menu {
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
a:link{
		text-decoration:none;
		color: #fff;		
		}
	a:visited{
		text-decoration:none;
		color: #fff;
		}
	a:hover{
		color: #fff;
	}
</style>
</head>
<body>

	<div class="navbar">
	 	<a class="logo" href="/main_after" ><img src="/resources/Logo/logo_red.JPG/" width="150px" height="50"></a>
	  		  
	  <div class="rightmenu">
		  <div class="dropdown">
		    <button class="dropbtn"><a href="/main_after">메인화면</a></button>
		  </div>
		  <div class="dropdown">
		    <button class="dropbtn"><a href="/admin/list">리스트</a>
		      <i class="fa fa-caret-down"></i>
		    </button>
		  </div>
		   <div class="dropdown">
		    <button class="dropbtn"><a href="/admin/adminLogout">로그아웃</a>
		      <i class="fa fa-caret-down"></i>
		    </button>
		  </div>
	  </div>
	</div>

</body>
</html>