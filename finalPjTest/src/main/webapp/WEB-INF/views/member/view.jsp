<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
$(function(){
    $("#btnUpdate").click(function(){
        document.form1.action="${path}/member/update.do"; //update.do로 이동
        document.form1.submit();
    });
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>