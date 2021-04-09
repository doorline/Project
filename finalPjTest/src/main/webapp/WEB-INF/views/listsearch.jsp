<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="bodyStyle.css" rel="stylesheet" type="text/css" />
<title>검색</title>
<style>
html, body {
  margin: 0; padding: 0;
  width: 100%; height: 100%;
  font-family: Verdana, sans-serif;
}
main.container-fluid {
  min-height: 100%;
}
.listsearch_ul {
  display:inline-block; margin:10px;
}
.listsearch_li {
  display:inline-block; margin:10px;
}
.searchform {
  display:flex;
  justify-content:center;
  align:center;
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

	<h1 align="center">보고싶은 작품을 검색해주세요</h1>
	
	<form action=/listsearch>
	 <div class="searchform">
	 	<input type="text" name="listkeyword" id="listkeyword" style="text-align:center; width:500px; height:50px;"/>&nbsp;&nbsp;&nbsp;
	 	<c:url var="targetURL" value="/listsearch"></c:url>
	 	<button name="search_btn" id="search_btn">검색</button>
	 </div>
	</form>
	<br/>
	
	<c:if test="${search ne null}"></c:if>
	<ul class="listsearch_ul">
		<c:forEach items="${search}" var="search">
		<li class="listsearch_li">
			<div class="pImg"><a href=""><img src="/resources/ProductImg/${search.pImg}" style="width:250px; height:250px;"></a></div>
			<div class="pName"><a href="">${search.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				
					
	<script>
		document.getElementById("search_btn").onclick = function () {
		  let listkeyword =  document.getElementsByName("listkeyword")[0].value;
		  console.log(listkeyword)
		 };
	</script>

	
</main>
<%@include file="./template/bottom.jsp"%>

</body>
</html>