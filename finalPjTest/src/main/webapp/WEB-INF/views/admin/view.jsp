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
<title>상세 페이지</title>
<style>
	body{
		background-color:black;
		line-height:2em;
		color:#fff;
		margin:30px;
		}
	.board{
		width:800px;
		position: relative;
		display:table;
		margin:auto;
	}
	.row{
		display:table-row;
		position:relative;
    	padding: 0 auto;
		margin:5px;
	}
	.caption{
		display:table-caption;
		caption-side:bottom;
		margin:5px;
	}
	.b_menu{
		width:80px;
		margin:10px;
		display:table-cell;
		vertical-align:middle;
	}
	.content{
		margin:10px;
		display:table-cell;
		vertical-align:middle;
	}	
	.tc{
		text-align:left;
		padding:10px;
	}
	fieldset{
		width:900px;
	}
	.btn{
		border:0;
		height:25px;
		background-color:#DC143C;
		border-radius:1px;
		font-weight:bold;
	}
	.w70{width:70px;}
	.w500{width:500px;}
	.w200{width:200px;}
	.w120{width:120px;}
	.w100{width:100px;}
</style>
</head>
	<%@include file="/WEB-INF/views/top.jsp"%>
<body>

		<h1 style="margin:0 0 0 30px;">작품 상세보기</h1>
	
	<hr>
 <div class="board">
<fieldset>
 	<div class="row tc">
 		<span class="b_menu">pCode</span>
 		<span class="content">${view.pCode}</span>
 	</div>
 	<div class="row tc">
 		<span class="b_menu">제목</span>
 		<span class="content">${view.pName}</span>
 	</div>
 	<div class="row tc">
 		<span class="b_menu">게시자</span>
 		<span class="content">${view.aId}</span>
 	</div>
 	<div class="row tc">
 		<span class="b_menu">분류</span>
 		<span class="content">${view.kCode}</span>
 	</div>
 	<div class="row tc">
 		<span class="b_menu">상세장르</span>
 		<span class="content">${view.tCode}</span>
 	</div>
 	<div class="row tc">
 		<span class="b_menu">내용</span>
 		<span class="content">${view.pContent}</span>
 	</div>
 	<div class="row tc">
 		<span class="b_menu">이미지</span>
 		<span class="content"><img src="/resources/ProductImg/${view.pImg}" class="w200"/></span>
 	</div>
 	<div class="row tc">
 		<span class="b_menu">VOD</span>
 		<span class="content"><video src="/resources/ProductImg/${view.pVod}" class="w500" controls/></span>
 	</div>
</fieldset>
 	<div class="caption">
 		<input type="button" onclick="location.href='/admin/modifyView?pCode=${view.pCode}'" value="수정" class="btn">
 		<input type="button" onclick="location.href='list'" value="목록보기" class="btn">
 	</div>
 </div>
</body>
	<%@include file="/WEB-INF/views/bottom.jsp"%>
</html>