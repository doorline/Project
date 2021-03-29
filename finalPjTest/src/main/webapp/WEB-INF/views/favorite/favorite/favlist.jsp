<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>찜한 콘텐츠</title>

<style>
.favlist_li {
display:inline-block; margin:10px;
}
.productName {
}
.deletefav_btn {
background-color:red;
padding:5px;
color:white;
}
</style>

</head>
<body>


<%@include file="/WEB-INF/views/top.jsp"%>

	<h3>찜한 콘텐츠</h3>
	
	<ul class="favlist_ul">
		<c:forEach items="${favlist}" var="fav">
		<li class="favlist_li">
			<div class="productImg"><img src="/resources/ProductImg/${fav.pImg}" style="width:250px; height:250px;"/></div>
			<div class="productName"><a href="영상보기">${fav.pName}</a></div> 
			<a class="deletefav_btn" href="${path}/favorite/deletefav?fCode=${fav.fCode}">찜해제</a>
		</li>
		</c:forEach>
	</ul>

		
	
<%@include file="/WEB-INF/views/bottom.jsp"%>

</body>
</html>