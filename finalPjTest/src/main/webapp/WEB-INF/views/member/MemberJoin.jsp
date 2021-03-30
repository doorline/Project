<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src='{% static "js/jquery-1.11.3.min.js" %}'></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<head>
<meta charset="UTF-8">
<title>User Join</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script language="javascript">
 function checks() { 
	 //값 불러오기 
	 var getMid = document.getElementById("mid"); 
	 var getMpw = document.getElementById("mpw"); 
	 var getPwCheck = document.getElementById("password_check");
	 var getMname = document.getElementById("mname"); 
	 //value 불러오기 
	 var mid = getMid.value; 
	 var mpw = getMpw.value; 
	 var pwCheck = getPwCheck.value; 
	 var mname = getMname.value; 
	 //유효성 검사 
	 var regExp = /^[a-zA-Z0-9]{4,12}$/; 
	 //id, password 
	 var regName = /^[가-힝]{2,}$/; 
	 //name 
	 if (!regExp.test(mid)) { //id
		 alert("아이디 다시 설정"); 
	 	getMid.value = "";
	 	getMid.focus(); 
	 	return false; 
	 	} else if (!regExp.test(mpw)) { //password 
	 	alert("비밀번호 다시 설정");
	 	getMpw.value = ""; 
	 	getMpw.focus(); 
	 	return false; 
	 	} else if (!(pwCheck.slice(0, pwCheck.length) == mpw.slice(0, pw.length))) { //password 동일한지 확인 
	 		alert("비밀번호가 서로 다릅니다."); 
	 	getPwCheck.value = ""; 
	 	getPwCheck.focus(); 
	 		return false; 
	 		} else if ((mpw.slice(0, pwCheck.length) == mid.slice(0, mid.length))) { //password랑 id 다른지 확인 
	 			alert("비밀번호와 id가 동일합니다."); 
	 		getMpw.value = ""; 
	 		getPwCheck.value = ""; 
	 		getMpw.focus(); 
	 		return false; 
	 		} else if (!regMname.test(mname)) { //이름 확인 
	 			alert("이름 다시"); 
	 		getMname.value = "";
	 		getMname.focus(); 
	 		return false; 
	 		} 
	 } 
 </script>
<script> 
$(document).ready(function () { 
	$('#idCheck').on('click', function () { 
		$.ajax({ 
			type: 'POST',
			url: '/member/idCheck?md=' + $('#mid').val(), 
					success: function (data) { 
						console.log('ddd', data) 
						if (data == 0) { 
							alert("사용 가능") 
							} else { 
								alert("사용 불가능") 
								$('#mid').val(''); 
								}
						} 
		}); 
		}); 
	}); 
	</script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/template/header.jsp" />
	<form action="/member/join" method="post" onSubmit="return checks()">
		<div style="float: none; margin: 0 auto;">
			<h1 align="center">Member Join</h1>
			<div>
				<h6>
					아이디 : 4~12자의 영문 대소문자와 숫자
					<button type="button" id="idCheck" >중복 확인</button>
				</h6>
				<input type="text" id="mid" name="mid">
				<h6>비밀번호 : 4~12자의 영문 대소문자와 숫자</h6>
				<input type="password" id="mpw" name="mpw">
				<h6>비밀번호 확인</h6>
				<input type="password" id="password_check">
				<h6>이름</h6>
				<input type="text" name="mname" id="mname">
				<div align="center">
					<button type="submit">회원 가입</button>
					<button type="reset">다시 입력</button>
					<button type="button" onclick="location.href='/user/loginPage'">뒤로</button>
				</div>
			</div>
	</form>
</body>
</html>
