<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.watching.dto.ProductDTO" %>
<%@ page import="com.watching.service.CategoryService" %>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 (로그인 후)</title>
<style>
ul li {
display:inline-block; 
margin:5px;
}
h4 {
margin:10px;
}
</style>
</head>
<body>

<%@include file="top.jsp"%>

<c:set var="ddl" value="${dms_dramalist}"/>
<c:set var="adl" value="${abr_dramalist}"/>
<c:set var="dfl" value="${dms_filmlist}"/>
<c:set var="afl" value="${abr_filmlist}"/>

	<h4>신작</h4>
	
	<h4>국내 드라마</h4>
		<ul>
		<c:forEach items="${dms_dramalist}" var="ddl" varStatus="status">
		<li>
			<div class="pImg"><a href=""><img src="/resources/ProductImg/${ddl.pImg}" style="width:150px; height:150px;"></a></div>
			<div class="pName"><a href="">${ddl.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				
				
	<h4>해외 드라마</h4>
		<ul>
		<c:forEach items="${abr_dramalist}" var="adl" varStatus="status">
		<li>
			<div class="pImg"><a href=""><img src="/resources/ProductImg/${adl.pImg}" style="width:150px; height:150px;"></a></div>
			<div class="pName"><a href="">${adl.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				
		
	<h4>국내 영화</h4>
		<ul>
		<c:forEach items="${dms_filmlist}" var="dfl" varStatus="status">
		<li>
			<div class="pImg"><a href=""><img src="/resources/ProductImg/${dfl.pImg}" style="width:150px; height:150px;"></a></div>
			<div class="pName"><a href="">${dfl.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				
			
	<h4>해외 영화</h4>
		<ul>
		<c:forEach items="${abr_filmlist}" var="afl" varStatus="status">
		<li>
			<div class="pImg"><a href=""><img src="/resources/ProductImg/${afl.pImg}" style="width:150px; height:150px;"></a></div>
			<div class="pName"><a href="">${afl.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				


<%@include file="bottom.jsp"%>

</body>
</html>