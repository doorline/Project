<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>Watching 건설 중 (Test_Watching)</h1>
	
	<P>  지금은 ${serverTime}. </P>
	
	
	<p><a href="/admin/list">리스트</a></p>
	<p><a href="/admin/uploadView">작품 업로드</a></p>

	<h2>File Upload</h2>
		<form action="upload" method="post" enctype="multipart/form-data">
			<input type="file" name="uploadfile"/><br/>
			<input type="submit" value="완료">
		</form>
				
			<tr>
				<td colspan="2"><input type="submit" class="btn btn-primary" value="입력"> &nbsp;&nbsp; <a href="list" class="btn btn-primary">목록보기</a></td>
			</tr>
</body>
</html>