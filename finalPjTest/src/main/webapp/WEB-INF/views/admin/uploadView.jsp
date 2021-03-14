<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadView</title>
</head>
<body>
	<form action="/admin/upload" method="post" enctype="multipart/form-data">
		<input type='hidden' name='aId' id='aId' value='admin'>
		<div>
			<label for='pName'>제목</label>
			<input type='text' name='pName' id='pName'>
		</div>
		<div>
			<label>장르(kind)</label>
			<input type='text' name='kCode' id='kCode'>
		</div>
		<div>
			<label>타입</label>
			<input type='text' name='tCode' id='tCode'>
		</div>
		<div>
			<label>작품 이미지</label>
			<input type='file' name='file' id='file'>
		</div>
		<div>
			<label>data type</label>
			<input type='text' name='dType' id='dType'>
		</div>
		<input type='submit' value='업로드'>
	</form>
</body>
</html>