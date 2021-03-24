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
</head>
<style>
	ul li{list-style:none;}
	.fl{float:left;}
	.fr{float:right;}
	.tc{text-align:center;}
	.tl{text-align:left;}
	.board{width:1800px;}
	.m5{margin:5px;}
	.w70{width:70px;}
	.w500{width:500px;}
	.w120{width:120px;}
	.w300{width:300px;}	
</style>
<script>
	$(document).on('click','#btnSearch',function(e){
		e.preventDefault();
		var url="${targetURL}";
		url = url+"?searchType="+$('#searchType').val();
		url = url+"&keyword="+$('#keyword').val();
		url = url+"&nowPage="+$('#nowPage').val();
		location.href = url;
		console.log(url);
	});
</script>
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
<div class="search tc">
	<div class="tc fl m5">
		<select name="searchType" id="searchType">
			<option value="pName">제목</option>
			<option value="pContent">내용</option>
		</select>
	</div>
	<div class="tc fl m5">
		<input type="text" name="keyword" id="keyword">
		<input type="hidden" name="nowPage" id="nowPage" value="${paging.nowPage}">
	</div>
	<div class="tc fl m5">
		<c:url var="targetURL" value="/admin/list"></c:url>
		<button name="btnSearch" id="btnSearch">검색</button>
	</div>
</div>
 <div class="tc">
 	<c:if test="${paging.startPage != 1}">
 		<a href="/admin/list?nowPage=${paging.startPage -1}">&lt;</a>
 	</c:if>
 	<c:if test="${search.keyword == null }">
	 	<c:forEach begin="${paging.startPage}" end="${paging.endPage}" var="p">
	 		<c:choose>
	 			<c:when test="${p == paging.nowPage}">
	 				<b>${p}</b>	
	 			</c:when>
	 			<c:when test="${p != paging.nowPage}">
	 				<a href="/admin/list?nowPage=${p}">${p}</a>
	 			</c:when>
	 		</c:choose>
	 	</c:forEach>
 	</c:if>
 	<c:if test="${search.keyword != null }">
	 	<c:forEach begin="${paging.startPage}" end="${paging.endPage}" var="p">
	 		<c:choose>
	 			<c:when test="${p == paging.nowPage}">
	 				<b>${p}</b>	
	 			</c:when>
	 			<c:when test="${p != paging.nowPage}">
	 				<a href="/admin/list?searchType=${search.searchType}&keyword=${search.keyword}&nowPage=${p}">${p}</a>
	 			</c:when>
	 		</c:choose>
	 	</c:forEach>
 	</c:if>
 	<c:if test="${paging.startPage != paging.lastPage}">
 		<a href="/admin/list?nowPage=${paging.startPage +1}">&gt;</a>
 	</c:if>
 </div>

</body>
</html>