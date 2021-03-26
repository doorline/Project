<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>작품 업로드</title>
</head>
<body>

		<h1>작품 업로드</h1>
	
	<hr>
	<form action="file" method="post" enctype="multipart/form-data"> <fieldset>
	
	<table> 
		<tr>
			<th>관리자Id</th>
			<td></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="pName" required="required" placeholder="제목"></td>
		</tr>
		<tr>
			<th>썸네일보기</th>
			<td><textarea rows="20" cols="40" name="content" required="required" placeholder="내용"></textarea></td>
		</tr>
		<tr>
			<th>썸네일</th>
			<td><input type="file" name="uploadfile" required="required"></td>
		</tr>
		<tr>
			<th>영상</th>
			<td><input type="file" name="uploadfile" required="required"></td>
		</tr>
		<tr>
			<td colspan="2"> <input type="submit" value="완료">
			<input type="button" onclick="location.href='list'" value="목록보기"></td>
		</tr>
		</table>
		</fieldset>
		</form>

				
	<h2>File Upload</h2>
		<form action="upload" method="post" enctype="multipart/form-data">
			<input type="file" name="uploadfile"/><br/>
			<input type="submit" value="완료">
		</form>
				
				<tr>
					<td colspan="2"><input type="submit" class="btn btn-primary"
						value="입력"> &nbsp;&nbsp; <a href="list"
						class="btn btn-primary">목록보기</a></td>
				</tr>
	


</body>
</html>