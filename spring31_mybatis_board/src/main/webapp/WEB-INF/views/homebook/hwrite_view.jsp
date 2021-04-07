<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.sjw.mymember.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Homebook write</title>
<%
MDto login_hdto = (MDto)session.getAttribute("login_user");
%>

</head>
<body>
	<%@ include file="/WEB-INF/views/common/top.jsp" %>
	
	<div class="container" style="padding-top:20px;">
	<h2 align="left">가계부 작성</h2>
	<div class="form-group" style="padding-top:20px;">
	<table class="table">
		<form action="write" method="post">
			<tr>
				<th>작성자</th>
				<th>날짜</th>
				<th>분류</th>
				<th>계정</th>
				<th>내역</th>
				<th>수입</th>
				<th>지출</th>
			</tr>
		<tr>
			<td><input type="hidden" name="mid" value="${login_user.id}" class="form-control">${login_user.id}</td>
			<td><input type="datetime-local" name="day" class="form-control"></td>
			<td><select name="section">
				<option value="수입">수입</option>
				<option value="지출">지출</option>
				<option value="저축">저축</option>
				<option value="보험">보험</option>
				<option value="기타">기타</option>
				</select>
			</td>
			<td><input type="text" name="accountTitle" class="form-control"></td>
			<td><input type="text" name="remark" class="form-control"></td>
			<td><input type="text" name="revenue" value=0 class="form-control"></td>
			<td><input type="text" name="expense" value=0 class="form-control"></td>					
		</tr>	
		<tr>
			<td colspan="7" align="right">
				<input type="submit" value="입력" class="btn btn-primary">
				&nbsp;&nbsp; <a href="/homebook/list" class="btn btn-primary">목록</a>
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