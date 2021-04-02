<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 (로그인 전)</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
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
  position: relative;
  width:100%;
  height:100px;
  font-family: Arial, Helvetica, sans-serif;
  font-weight: lighter;
  bottom:0;
  background:black;
  text-align: center;
  color: white;
  margin-top:100px;
}
.btn btn-lg btn-primary btn-block {
  background-color: red;
}
@import url("http://fonts.googleapis.com/earlyaccess/nanumgothic.css");
	
.card {
        margin: 0 auto; /* Added */
        float: none; /* Added */
        margin-bottom: 10px; /* Added */
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
	}
	
	.form-signin .form-control {
  		position: relative;
  		height: auto;
  		-webkit-box-sizing: border-box;
     	-moz-box-sizing: border-box;
        	 box-sizing: border-box;
  		padding: 10px;
  		font-size: 16px;
	}
</style>
</head>
<body>

<div class="navbar">
	 	<a  class="logo" href="/" ><img src="<spring:url value ='/resources/Logo/logo_red.JPG'/>" width="150px" height="50"></a>
	  		  

	  <div class="rightmenu">		 
	   <a class="menu" href="/">멤버십 안내</a>
	</div>
	</div>
	<br/>

	<h1 align="center">Watching에서 다양한 콘텐츠를 만나보세요</h1>

	<br/>
	<br/>
	<br/>
	
	<div class="card align-middle" style="width:300px; border-radius:50px;">

		<div class="card-body">
      <form class="form-signin" method="POST" action="/member/login" name="LoginForm">
        <label for="inputEmail" class="sr-only">ID</label>
        <input type="text" required id="mid" name="mid" class="form-control" placeholder="ID"  autofocus><BR>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" required id="mpw" name="mpw" class="form-control" placeholder="Password" ><br>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 아이디 저장
          </label>
        </div>
        <button id="login_btn" class="btn btn-lg btn-danger btn-block" type="submit">로그인</button>
        <button id="join_btn" class="btn btn-lg btn-danger btn-block" onclick="location.href='join'">회원가입</button>
      </form>
      
		</div>
	</div>

	<div class="modal">
	</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 


	<table id="bottom" width="100%" bgcolor='black'>
		<tr height="5">
			<td align="center"> 
			<font color="white" size="2">
			OTT Platform Web Site WATCHING  | 권문선, 백지혜, 임성섭 | Project Duration 2021.02.23 - 2021.03
			| Vision Occupation Training School | Daejeon, Korea | 042-252-5963			
			</font> 
			</td>
		</tr>
		<c:if test="${aid == null }">
		<tr>
			<td>
				<button onclick="location.href='/admin/admin_login_view'">admin</button>
			</td>
		</tr>
		</c:if>
	</table>
</body>
</html>