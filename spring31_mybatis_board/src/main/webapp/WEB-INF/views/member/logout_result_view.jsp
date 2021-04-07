<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<%
	int rs = Integer.parseInt(request.getParameter("rs"));
	if(rs == 1){
%>
		<script type="text/javascript">	
			alert('로그아웃 되었습니다.');
			document.location.href="/home";
		</script>
<%
	}else{
%>
		<script type="text/javascript">	
			alert('다시 시도하세요');
			document.location.href="/home";
		</script>
<%
	}
%>
</body>
</html>