<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script language="javascript"> 
	function checks() { 
		//값 불러오기 
		var getMpw = document.getElementById("mpw");
		var getPwCheck = document.getElementById("password_check"); 
	//value 불러오기
	var mpw = getMpw.value; 
	var pwCheck = getPwCheck.value; 
	//유효성 검사 
	var regExp = /^[a-zA-Z0-9]{4,12}$/; 
	//id, password
	if (!regExp.test(mpw)) { //password
	alert("비밀번호 다시 설정"); 
		getMpw.value = "";
		getMpw.focus(); 
		return false; 
		} else if (!(pwCheck.slice(0, pwCheck.length) == mpw.slice(0, mpw.length))) { //password 동일한지 확인
	alert("비밀번호가 서로 다릅니다."); 
		getPwCheck.value = ""; 
		getPwCheck.focus(); 
		return false; 
		} else if ((mpw.slice(0, mpwCheck.length) == mid.slice(0, mid.length))) { //password랑 id 다른지 확인 
			alert("비밀번호와 id가 동일합니다."); 
		getMpw.value = ""; 
		getPwCheck.value = ""; 
		getMpw.focus(); 
		return false; } 
		} * / 
		} 
</script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/template/header.jsp" />
	<br>
	<form action="/member/edit" method="post" onSubmit="return checks()">
		<div style="float: none; margin: 0 auto;">
			<h1 align="center">Member Edit</h1>
			<h6>아이디</h6>
			<input type="text" name="mid" value="${memberEdit.mid}" readonly>
			<h6>비밀번호 : 4~12자의 영문 대소문자와 숫자로만 입력</h6>
			<input type="password" id="mpw" name="mpw" value="${memberEdit.mpw}">
			<h6>비밀번호 확인</h6>
			<input type="password" id="password_check" value="${memberEdit.mpw}">
			<h6>이름</h6>
			<input type="text" name="name" value="${memberEdit.mname}" readonly>
		</div>
		<br>
		<div align="center">
			<button type="submit">수정</button>
			<button type="button" onclick="location.href='/board/list'">뒤로</button>
		</div>
	</form>
</body>
</html>