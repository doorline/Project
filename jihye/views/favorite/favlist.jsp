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
html, body {
  margin: 0; padding: 0;
  width: 100%; height: 100%;
  font-family: Verdana, sans-serif;
}
main.container-fluid {
  min-height: 100%;
}
.favlist_li {
  display:inline-block; margin:10px;
}
.productName {
}
.deletefav_btn {
  background-color: red;
  padding: 5px;
  color: white;
}
a, a:link, a:visited {
  color: white;
  text-decoration: none;
  algin: center;
}
</style>

</head>
<body>

<main class="container-fluid">
<%@include file="../template/top.jsp"%>

	<h3>찜한 콘텐츠</h3>
	<c:choose>
		<c:when test="${map.count == 0}">
			마음에 뜨는 작품을 찜해서 언제든 즐겨보세요
		</c:when>
		
		<c:otherwise>
			<ul class="favlist_ul">
				<c:forEach items="${map.favlist}" var="fav">
				<li class="favlist_li">
					<div class="productImg"><img src="/resources/ProductImg/${fav.pImg}" style="width:250px; height:250px;"/></div>
					<div class="productName"><a href="영상보기">${fav.pName}</a></div> 
					<a class="deletefav_btn" href="${path}/favorite/deletefav?fCode=${fav.fCode}">찜해제</a>
				</li>
				</c:forEach>
			</ul>
		
		</c:otherwise>
	</c:choose>
	
</main>
<%@include file="../template/bottom.jsp"%>

</body>
</html>