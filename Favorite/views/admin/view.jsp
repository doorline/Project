<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.watching.dto.ProductDTO" %>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>콘텐츠 보기</title>

<style>
	.tc{text-align:left;}
	.board{width:950px;}
	.w70{width:70px;}
	.w500{width:500px;}
	.w200{width:200px;}
	.w120{width:120px;}
	.w100{width:100px;}	
</style>

</head>
<body>

	<div class="board">
 	<div class="row tc">
 		<span class="menu w100">pCode</span>
 		<span class="content w500">${view.pCode}</span>
 	</div>
 	<div class="row tc">
 		<span class="menu w70">제목</span>
 		<span class="content w500">${view.pName}</span>
 	</div>
 	<div class="row tc">
 		<span class="menu w70">게시자</span>
 		<span class="content w500">${view.aId}</span>
 	</div>
 	
 	<div class="row tc">
 	<span class="menu w70">분류</span>
 		<span class="content w500">${view.kCode}</span>
 	</div>
 	<div class="row tc">
 		<span class="menu w70">상세장르</span>
 		<span class="content w500">${view.tCode}</span>
 	</div>
 	<div class="row tc">
 		<span class="menu w70">내용</span>
 		<span class="content w500">${view.pContent}</span>
 	</div>
 	
 	<div class="row tc">
 		<span class="menu w70">이미지</span>
 		<span class="content w500"><img src="/resources/ProductImg/${view.pImg}" class="w200"/></span>
 	</div>
 	<div class="row tc">
 		<span class="menu w70">VOD</span>
 		<span class="content w500"><video src="/resources/productImg/${view.pVod}" class="w500" controls/></span>
 	</div>
 	<div>
 		<input type="button" onclick="location.href='/admin/modifyView?pCode=${view.pCode}'" value="수정">
 	
 	<div>
 		<input type="button" onclick="location.href='list'" value="목록보기">
 	</div>
 	</div>

</body>
</html>