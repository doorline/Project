<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Login</title>

</head>
<body>
	
	<%@ include file="/WEB-INF/views/common/top.jsp" %>
	<div class="container" style="padding-top:20px;">
	<h3 align='center'>Login</h3>
	<div class="form-group" style="padding-top:20px;">
	<table class="table table-sm" style="width:50%;"  align='center'>
		<form action="/member/login" method="post">
			<tr>
				<td scope="col" class="text-center"> 아이디 </td>
				<td style="width:60%;"> <input type="text" name="id" class="form-control"> </td>
			</tr>
			<tr>
				<td scope="col" class="text-center"> 비밀번호 </td>
				<td style="width:60%;"> <input type="text" name="password" class="form-control"> </td>
			</tr>
			<tr >
				<td colspan="2" align="right">
					<input type="submit" value="로그인" class="btn btn-primary"> &nbsp;&nbsp;
					<a href="/home" class="btn btn-primary">목록보기</a>
				</td>
			</tr>
		</form>
	</table>
	</div>
	</div>
	<div style="padding-top:20px;"></div>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	
	
	
</body>
</html>