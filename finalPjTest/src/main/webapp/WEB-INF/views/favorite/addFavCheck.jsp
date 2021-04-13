<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>찜추가</title>
</head>
<body>
	<script>
		if("${fRes}"==0){
			alert('${pdto.pName}이 찜목록에 추가되었습니다.');
			location.href='${referer}';
		}else{			
			alert("이미 찜목록에 있습니다.");
			location.href='${referer}';	
		}
	</script>
</body>
</html>