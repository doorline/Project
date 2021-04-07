<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	int msg = Integer.parseInt(request.getParameter("msg"));
	if(msg == 1){
%>
		<script type="text/javascript">	
			alert('답글이 있어 삭제가 불가능합니다');
			document.location.href="/board/list";
		</script>
<%
	}else{
%>
		<script type="text/javascript">	
			alert('삭제완료');
			document.location.href="/board/list";
		</script>
<%
	}
%>

</head>
<body>

</body>
</html>