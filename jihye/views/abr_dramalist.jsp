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
html, body {
  margin: 0; padding: 0;
  width: 100%; height: 100%;
  font-family: Verdana, sans-serif;
}
main.container-fluid {
  min-height: 100%;
}
.abr_dramalist_ul {
  display:inline-block; margin:10px;
}
.abr_dramalist_li {
  display:inline-block; margin:10px;
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
<%@include file="./template/top.jsp"%>

	<h3>해외 드라마</h3>

	<ul class="abr_dramalist_ul">
		<c:forEach items="${abr_dramalist}" var="adl">
		<li class="abr_dramalist_li">
			<form name="form1" method="post" action="/favorite/addfav">
				<input type="hidden" name="pCode" value="${adl.pCode}">
					<div class="pImg"><a href=""><img src="/resources/ProductImg/${adl.pImg}" style="width:250px; height:250px;"></a></div>
					<div class="pName"><a href="">${adl.pName}</a></div>
				<input type="submit" value="찜추가">
			</form>
		</li>
		
		</c:forEach>
	</ul>		
	
</main>
<%@include file="./template/bottom.jsp"%>

</body>
</html>