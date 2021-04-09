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
html, body {
  margin: 0; padding: 0;
  width: 100%; height: 100%;
  font-family: Verdana, sans-serif;
}
main.container-fluid {
  min-height: 100%;
}
.dms_dramalist_ul {
  display:inline-block; margin:10px;
}
.dms_dramalist_li {
  display:inline-block; margin:10px;
}
a, a:link, a:visited {
  color: white;
  text-decoration: none;
  algin: center;
}
.fav_btn {
  background-color: red;
  padding: 5px;
  color: white;
}
</style>
</head>
<body>
<main class="container-fluid">
<%@include file="/WEB-INF/views/template/top.jsp"%>

	<h3>국내 드라마</h3>
	
	<c:set var="ddl" value="${dms_dramalist}"/>
	<c:set var="fav" value="${favlist}"/>
	
	<ul class="dms_dramalist_ul">
		<c:forEach items="${dms_dramalist}" var="ddl" varStatus="status">
		<li class="dms_dramalist_li">
			<form name="form1" method="post" action="/favorite/addfav">
				<input type="hidden" name="pCode" value="${ddl.pCode}">
					<div class="pImg"><a href=""><img src="/resources/ProductImg/${ddl.pImg}" style="width:250px; height:250px;"></a></div>
					<div class="pName"><a href="">${ddl.pName}</a></div>
				<input class="fav_btn" type="submit" value="찜추가">
			</form>
		</li>
		</c:forEach>
	</ul>				

</main>			

<%@include file="/WEB-INF/views/template/bottom.jsp"%>

</body>
</html>