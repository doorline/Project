<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.finalPj.testpj.dto.ProductDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<%
	ProductDTO dtos = (ProductDTO)session.getAttribute("dtos");
%>
</head>
<body>
 <div id="list">
 	<ul class="topbar">
 		<li>pCode</li>
 		<li>제목</li>
 		<li>업로드 날짜</li>
 		<li>게시자</li>
 	</ul>
 	<c:forEach items="<%=dtos %>" var="dtos">
	 	<ul class="dtos">
	 		<li>${dtos.pCode}</li>
	 		<li>${dtos.pName}</li>
	 		<li>${dtos.dUploadDate}</li>
	 		<li>${dtos.aId}</li>
	 	</ul>
	 </c:forEach>
 </div>
</body>
</html>