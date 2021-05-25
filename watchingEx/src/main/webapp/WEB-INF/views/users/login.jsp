<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
</head>
<body>
	<h1>로그인페이지</h1>
	<h2>${error}</h2>
	<h2>${logout}</h2>
	<form action="${pageContext.request.contextPath}/users/doLogin" method="POST">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="text" name="username"/>
		<input type="password" name="password"/>
		<input type="submit"/>		
	</form>
</body>
</html>