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
html, body {
  margin: 0; padding: 0;
  width: 100%; height: 100%;
  font-family: Verdana, sans-serif;
}
main.container-fluid {
  min-height: 100%;
}
html, body {
  margin: 0; padding: 0;
  width: 100%; height: 100%;
  font-family: Verdana, sans-serif;
}
main.container-fluid {
  min-height: 100%;
}
.abr_filmlist_ul {
  display:inline-block; margin:10px;
}
.abr_filmlist_li {
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

	<h3>해외 영화</h3>

	<ul class="abr_filmlist_ul">
		<c:forEach items="${abr_filmlist}" var="afl">
		<li class="dms_filmlist_li">
			<form name="form1" method="post" action="/favorite/addfav">
				<input type="hidden" name="pCode" value="${afl.pCode}">
					<div class="pImg"><a href=""><img src="/resources/ProductImg/${afl.pImg}" style="width:250px; height:250px;"></a></div>
					<div class="pName"><a href="">${afl.pName}</a></div>
				<input type="submit" value="찜추가">
			</form>
		</li>
		</c:forEach>
	</ul>				
	
</main>
<%@include file="./template/bottom.jsp"%>

</body>
</html>