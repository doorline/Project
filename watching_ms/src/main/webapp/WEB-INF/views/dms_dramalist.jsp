<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국내 드라마</title>
<style>
.dms_dramalist_ul {
display:inline-block; margin:10px;
}
.dms_dramalist_li {
display:inline-block; margin:10px;
}
</style>
</head>
<body>

<%@include file="top.jsp"%>

	<h3>국내 드라마</h3>
	<c:set var="ddl" value="${dms_dramalist}"/>
	<c:set var="fav" value="${favlist}"/>
	<ul class="dms_dramalist_ul">
		<c:forEach items="${dms_dramalist}" var="ddl" varStatus="status">
		<li class="dms_dramalist_li">
			<form name="form1" method="post" action="${path}/favorite/addfav">
				<input type="hidden" name="pCode" value="${fdto.pCode}">
					<div class="pImg"><a href=""><img src="/resources/ProductImg/${ddl.pImg}" style="width:250px; height:250px;"></a></div>
					<div class="pName"><a href="">${ddl.pName}</a></div>
				<input type="submit" value="찜추가">
				<a class="addfav_btn" href="${path}/favorite/addfav?pCode=${fav[status.index].pCode}">찜추가</a>
			</form>
		</li>
		</c:forEach>
	</ul>				

<%@include file="bottom.jsp"%>

</body>
</html>