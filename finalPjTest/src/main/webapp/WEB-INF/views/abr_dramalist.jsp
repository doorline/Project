<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>해외 드라마</title>
<style>
.abr_dramalist_ul {
display:inline-block; margin:10px;
}
.abr_dramalist_li {
display:inline-block; margin:10px;
}
</style>
</head>
<body>

<%@include file="top.jsp"%>

	<h3>해외 드라마</h3>

	<ul class="abr_dramalist_ul">
		<c:forEach items="${abr_dramalist}" var="adl">
		<li class="abr_dramalist_li">
			<div class="pImg"><a href=""><img src="/resources/ProductImg/${adl.pImg}" style="width:250px; height:250px;"></a></div>
			<div class="pName"><a href="">${adl.pName}</a></div>
			<p class="addfav"> 
			<button type="button" class="addfav_btn">찜추가</button>
			</p>
		</li>
		
		</c:forEach>
	</ul>		
	
<%@include file="bottom.jsp"%> 

</body>
</html>