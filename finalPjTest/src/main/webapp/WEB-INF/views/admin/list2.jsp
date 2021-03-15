<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.finalPj.testpj.dto.ProductDTO" %>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>

<style>
	ul li{list-style:none;}
	.fl{float:left;}
	.tc{text-align:center;}
	.board{width:950px;}
	.w70{width:70px;}
	.w500{width:500px;}
	.w120{width:120px;}
	.w100{width:100px;}	
</style>
</head>
<body>
 <div class="list">
 	<ul class="board fl">
 		<li class="fl tc w70"> </li>
 		<li class="fl tc w70">pCode</li>
 		<li class="fl tc w70">제목</li>
 		<li class="fl tc w70">게시자</li>
 	</ul>
 	<c:forEach items="${dtos}" var="dtos">
	 	<ul class="board fl">
	 		<li class="fl tc w70"><input name="pCheck" type="checkbox" value ="${dtos.pCode}"></li>
	 		<li class="fl tc w70">${dtos.pCode}</li>
	 		<li class="fl tc w70"><a href="/admin/view/${dtos.pCode}">${dtos.pName}</a></li>
	 		<li class="fl tc w70">${dtos.aId}</li>
	 	</ul>
	 </c:forEach>
 </div>
</body>
</html>