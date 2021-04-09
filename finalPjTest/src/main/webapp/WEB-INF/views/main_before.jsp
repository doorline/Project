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
#bottom {
  position: absolute;
  width:100%;
  height:100px;
  font-family: Arial, Helvetica, sans-serif;
  font-weight: lighter;
  bottom:0;
  background:black;
  text-align: center;
  color: white;
}
.btn_area {
  margin: 10px;
}
#btnn {
    width: 93%;
    padding: 10px;
    border: 0;
    cursor: pointer;
    color: #fff;
    background-color: #F60101;
    font-size: 20px;
    font-weight: 400;
    font-family: Arial, Helvetica, sans-serif;
}
@import url("http://fonts.googleapis.com/earlyaccess/nanumgothic.css");
	
.card {
  margin: 0 auto;
  float: none;
  margin-bottom: 10px; 
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

<%@include file="./template/top_before.jsp"%> 

	<br/>

	<h1 align="center">Watching에서 다양한 콘텐츠를 만나보세요</h1>

	<br/>
	<br/>
	<br/>
	
	<div class="card align-middle" style="width:300px; border-radius:50px;">

		<div class="card-body">
      <form class="form-signin" method="POST" action="/member/login" name="LoginForm">
        <label for="inputEmail" class="sr-only">ID</label>
        <input type="text" required id="mId" name="mId" class="form-control" placeholder="ID"  autofocus><BR>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" required id="mPw" name="mPw" class="form-control" placeholder="Password" ><br>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 아이디 저장
          </label>
        </div>

		<div>
        	<button type="submit" class="btn_area" id="btnn">로그인</button>
        	<button id="btnn" class="btn_area" onclick="location.href='/member/joinPage'">회원가입</button>
		</div>
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