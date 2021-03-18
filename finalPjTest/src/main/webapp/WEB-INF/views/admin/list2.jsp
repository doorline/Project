<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.finalPj.testpj.dto.ProductDTO" %>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<title>list</title>

<style>
	ul li{list-style:none;}
	.fl{float:left;}
	.tc{text-align:center;}
	.board{width:1800px;}
	.w70{width:70px;}
	.w500{width:500px;}
	.w120{width:120px;}
	.w300{width:300px;}	
</style>
</head>
<body>
<form action="/admin/delete" >
 <div class="list">
 	<ul class="board fl">
 		<li class="fl tc w70">&nbsp;</li>
 		<li class="fl tc w70">pCode</li>
 		<li class="fl tc w500">제목</li>
 		<li class="fl tc w70">게시자</li>
 		<li class="fl tc w300">업로드 일자</li>
 	</ul>
 	<c:forEach items="${dtos}" var="dtos">
	 	<ul class="board fl">
	 		<li class="fl tc w70"><input name="pCodes" type="checkbox" value ="${dtos.pCode}"></li>
	 		<li class="fl tc w70">${dtos.pCode}</li>
	 		<li class="fl tc w500"><a href="/admin/view?pCode=${dtos.pCode}">${dtos.pName}</a></li>
	 		<li class="fl tc w70">${dtos.aId}</li>
	 		<li class="fl tc w300">${dtos.pUploadDate}</li>
	 	</ul>
	 </c:forEach>
	 <ul class="board fl">
		<input type="submit" value="삭제"/>
		<input type="button" onclick="location.href='uploadView'" value="업로드작성">
	</ul>
 </div>
</form>
</body>
</html>