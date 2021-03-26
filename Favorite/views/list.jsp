<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 모드</title>
</head>
<body>

	<h1>관리자 모드</h1>
	
	<hr>
	<table class='table table-striped'>
		<tr>
			<th>관리번호</th>
			<th>분류</th>
			<th>제목</th>
		</tr>
	
			
		<tr>
			<td colspan="5">
			<button type="button" class = "btn btn-primary" onclick="location.href='/'">메인</button>
			<a class = "btn btn-primary" href="upload">글작성</a>
			</td>
		</tr>
	</table>

</body>
</html>