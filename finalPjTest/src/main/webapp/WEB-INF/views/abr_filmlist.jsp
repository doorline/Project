<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>해외 영화</title>
<style>
.abr_filmlist_ul {
display:inline-block; margin:10px;
}
.abr_filmlist_li {
display:inline-block; margin:10px;
}
</style>
</head>
<body>

<%@include file="top.jsp"%>

	<h3>해외 영화</h3>

	<ul class="abr_filmlist_ul">
		<c:forEach items="${abr_filmlist}" var="afl">
		<li class="dms_filmlist_li">
			<form method="post" action="${path}/favorite/addfav">
				<input type="hidden" name="fdto" value="${fdto}">
					<div class="pImg"><a href=""><img src="/resources/ProductImg/${afl.pImg}" style="width:250px; height:250px;"></a></div>
					<div class="pName"><a href="">${afl.pName}</a></div>
				<input type="submit" value="찜추가">
			</form>
		</li>
		</c:forEach>
	</ul>				
	
<%@include file="bottom.jsp"%>

</body>
</html>