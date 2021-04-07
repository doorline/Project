<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
login result
<c:if test="${login_result != null}">
	<script type="text/javascript">	
			alert('${login_result.id}님 환영합니다.');
			document.location.href="/home";
	</script>
</c:if>
<c:if test="${login_result == null}">
	<script type="text/javascript">	
			alert('로그인실패');
			document.location.href="/member/login_view";
	</script>
</c:if>

</body>
</html>