<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<body>
	<div style="float: none; margin: 0 auto;">
		<h1>Login</h1>
		<form action="/member/login" name="LoginForm" method="post">
			<h1>ID</h1>
			<input type="text" required name="mid">
			<h1>PW</h1>
			<input type="password" required name="mpw">
			<button type="submit">Login</button>
		</form>
		<button type="button" onclick="location.href='/member/joinPage'">Join</button>
		<button type="button" onclick="location.href='/member/findPage'">Find Id/Pw</button>
		<button type="button" onclick="location.href='/'">Main</button>
	</div>
</body>
</html>
