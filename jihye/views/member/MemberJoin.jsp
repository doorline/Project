<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<script src='{% static "js/jquery-1.11.3.min.js" %}'></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
html {
    height: 100%;
}
body {
  background-color:black;
  color: white;
  margin: 0;
  height: 100%;
  font-family: Dotum,'돋움',Helvetica,sans-serif;
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


/* 레이아웃 틀 */
}
#logo {
    width: 240px;
    height: 44px;
    cursor: pointer;
}

#wrapper {
    position: relative;
    height: 100%;
}

#content {
    position: absolute;
    left: 50%;
    transform: translate(-50%);
    width: 460px;
}

/* 입력폼 */
h3 {
    margin: 19px 0 8px;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 14px;
    font-weight: 700;
}


.box {
    display: block;
    width: 100%;
    height: 51px;
    border: solid 1px #dadada;
    padding: 10px 14px 10px 14px;
    box-sizing: border-box;
    background: #fff;
    position: relative;
}

.int {
    display: block;
    position: relative;
    width: 100%;
    height: 29px;
    border: none;
    background: #fff;
    font-size: 15px;
}

input {
    font-family: Arial, Helvetica, sans-serif;   
}

.box.int_id {
    padding-right: 110px;
}

.box.int_pass {
    padding-right: 40px;
}

.box.int_pass_check {
    padding-right: 40px;
}

.step_url {
    /*@naver.com*/
    position: absolute;
    top: 16px;
    right: 13px;
    font-size: 15px;
    color: #8e8e8e;
}


.pswdImg {
    width: 18px;
    height: 20px;
    display: inline-block;
    position: absolute;
    top: 50%;
    right: 16px;
    margin-top: -10px;
    cursor: pointer;
}

select {
    width: 100%;
    height: 29px;
    font-size: 15px;
    background: #fff url(https://static.nid.naver.com/images/join/pc/sel_arr_2x.gif) 100% 50% no-repeat;
    background-size: 20px 8px;
    -webkit-appearance: none;
    display: inline-block;
    text-align: start;
    border: none;
    cursor: default;
    font-family: Arial, Helvetica, sans-serif;
}

/* 에러메세지 */

.error_next_box {
    margin-top: 9px;
    font-size: 12px;
    color: red;    
    display: none;
}

#alertTxt {
    position: absolute;
    top: 19px;
    right: 38px;
    font-size: 12px;
    color: red;
    display: none;
}

/* 버튼 */

.btn_area {
    margin: 30px 0 91px;
}

#btnJoin {
    width: 100%;
    padding: 21px 0 17px;
    border: 0;
    cursor: pointer;
    color: #fff;
    background-color: #F60101;
    font-size: 20px;
    font-weight: 400;
    font-family: Arial, Helvetica, sans-serif;
}

</style>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script language="javascript">
 function checks() { 
	 //값 불러오기 
	 var getmId = document.getElementById("mId"); 
	 var getmPw = document.getElementById("mPw"); 
	 var getPwCheck = document.getElementById("password_check");
	 var getmName = document.getElementById("mName"); 
	 //value 불러오기 
	 var mId = getmId.value; 
	 var mPw = getmPw.value; 
	 var pwCheck = getPwCheck.value; 
	 var mname = getmName.value; 
	 //유효성 검사 
	 var regExp = /^[a-zA-Z0-9]{4,12}$/; 
	 //id, password 
	 var regName = /^[가-힝]{2,}$/; 
	 //name 
	 if (!regExp.test(mId)) { //id
		 alert("아이디 다시 설정"); 
	 	getmId.value = "";
	 	getmId.focus(); 
	 	return false; 
	 	} else if (!regExp.test(mPw)) { //password 
	 	alert("비밀번호 다시 설정");
	 	getmPw.value = ""; 
	 	getmPw.focus(); 
	 	return false; 
	 	} else if (!(pwCheck.slice(0, pwCheck.length) == mPw.slice(0, mPw.length))) { //password 동일한지 확인 
	 		alert("비밀번호가 서로 다릅니다."); 
	 	getPwCheck.value = ""; 
	 	getPwCheck.focus(); 
	 		return false; 
	 		} else if ((mPw.slice(0, pwCheck.length) == mId.slice(0, mId.length))) { //password랑 id 다른지 확인 
	 			alert("비밀번호와 id가 동일합니다."); 
	 		getmPw.value = ""; 
	 		getPwCheck.value = ""; 
	 		getmPw.focus(); 
	 		return false; 
	 		} else if (!regmName.test(mName)) { //이름 확인 
	 			alert("이름 다시"); 
	 		getmName.value = "";
	 		getmName.focus(); 
	 		return false; 
	 		} 
	 } 
 </script>
<script> 
	$(document).ready(function () { 
		$('#idCheck').on('click', function () { 
			$.ajax({ 
				type: 'POST',
				url: '/member/idCheck?mId=' + $('#mId').val(), 
						success: function (data) { 
							console.log('ddd', data) 
							if (data == 0) { 
								alert("사용 가능한 아이디 입니다.") 
								} else { 
									alert("이미 사용 중인 아이디 입니다.") 
									$('#mId').val(''); 
									}
							} 
			}); 
			}); 
		}); 
</script>
</head>
<body>

	 	<div class="navbar">
	 		<a class="logo" href="/" ><img src="<spring:url value ='/resources/Logo/logo_red.JPG'/>" width="150px" height="50"></a>
	  		  

	  <div class="rightmenu">		 
	   <a class="menu" href="/msinfo">멤버십 안내</a>
	</div>
	</div>
	<br/>

		
	<h1 align="center">회원가입</h1>
		<form action="/member/join" method="post" onSubmit="return checks()">
				
			<div id="wrapper">
				<div id="content">

					<label >이름</label>
						<span class="box int_name">
							<input type="text" name="mName" id="mName" class="int">
						</span><p/>
					
					<label>아이디</label>
						<span class="box int_id">
				        	<input type="text" name="mId" id="mId" class="int" required autofocus> 
				        	<button type="button" id="idCheck" class="step_url">중복 확인</button>
				    	</span><p/>
				    	
				    <label for="inputPassword" >비밀번호</label>
				    	<span class="box int_id">
				        	<input type="password" name="mPw" id="mPw" class="int" required>
				        </span><p/>
					
					<label for="inputPassword">비밀번호 확인</label>
						<span class="box int_pass_check">
							<input type="password" id="password_check" class="int">
						</span><p/>
						
					<p>멤버십</p>
					<label>Bronze<input type="radio" name="Bronze" value="msCode"></label>
					<label>Silver<input type="radio" name="Silver" value="msCode"></label>
					<label>Gold<input type="radio" name="Gold" value="msCode"></label>


				
			<p/>
				
			<div class="btn_area">
					<button type="submit" id="btnJoin">회원 가입</button>
			</div>
				</div>
			</div>
		</form>
				
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