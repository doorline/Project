<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.finalPj.testpj.dto.*"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<title>작품 업로드</title>
<style>
	body{
		background-color:black;
		line-height:2em;
		color:#fff;
		margin:30px;
		}
	.tc{
		text-align:left;
		padding:10px;
		}
	.board{
		width:800px;
		position: relative;
		display:table;
	}
	.row{
		display:table-row;
		margin:5px;
	}
	.menu{
		width:100px;
		margin:10px;
		display:table-cell;
		vertical-align:middle;
	}
	.content{
		margin:10px;
		display:table-cell;
		vertical-align:middle;
	}
	.form-control{
		width:300px;
	}
	.form-control-select{
		width:150px;
	}
	.btn{
		float:left;
		margin:10px 10px 5px 5px;
		border:0;
		height:25px;
		background-color:#DC143C;
		border-radius:1px;
		font-weight:bold;
	}
	.w70{width:70px;}
	.w500{width:500px;}
	.w200{width:200px;}
	.w120{width:120px;}
	.w100{width:100px;}	
</style>
</head>
<body>

		<h1>작품 업로드</h1>
	
	<hr>
	<form action="/admin/upload" method="post" enctype="multipart/form-data"> <fieldset>
	<div class="board">
		<div class="row">
			<span class="menu">관리자Id</span>
 			<span class="content">
 				<input type="text" name="aId" size="50" value="admin" class="form-control">
 			</span>
		</div>
		<div class="row">
			<span class="menu">제목Id</span>
 			<span class="content">
 				<input type="text" name="pName" required="required" placeholder="제목" class="form-control">
 			</span>
		</div>
		<div class="row">
			<span class="menu">분류</span>
 			<span class="content">
 				<select name="kCode" id="kCode" class="form-control-select">
					<option value="국내드라마">국내드라마</option>
					<option value="해외드라마">해외드라마</option>
					<option value="국내영화">국내영화</option>
					<option value="해외영화">해외영화</option>
				</select>
 			</span>
		</div>
		<div class="row">
			<span class="menu">상세장르</span>
 			<span class="content">
 				<select name="tCode" id="tCode" class="form-control-select">
					<option value="로맨스/멜로">로맨스/멜로</option>
					<option value="코미디">코미디</option>
					<option value="SF/판타지">SF/판타지</option>
					<option value="어드벤쳐">어드벤쳐</option>
					<option value="공포/스릴러">공포/스릴러</option>
					<option value="미스터리">미스터리</option>
					<option value="드라마">드라마</option>
					<option value="다큐멘터리">다큐멘터리</option>
				</select>
 			</span>
		</div>
		<div class="row">
			<span class="menu">내용</span>
 			<span class="content">
 				<textarea rows="5" maxlength="40" name="pContent" required="required" class="form-control"></textarea>
 			</span>
		</div>
		<div class="row">
			<span class="menu">썸네일</span>
 			<span class="content">
 				<input type="file" name="imgFile" id="imgInput" onchange="readURL(this);" />
 			</span>
		</div>
		<div class="row">
			<span class="menu">썸네일보기</span>
 			<span class="content">
 				<img id="selectImg" src="#"/>
				<script type="text/javascript">
					function readURL(input){
						if(input.files && input.files[0]){
							var reader = new FileReader();
							reader.onload = function(e){
								$('#selectImg').attr('src', e.target.result).width(200);
							}
							reader.readAsDataURL(input.files[0]);
						}
					}
				</script>
 			</span>
		</div>
		<div class="row">
			<span class="menu">Vod</span>
 			<span class="content">
 				<input type="file" name="vodFile" id="vodInput" onchange="readVodURL(this);"/> 				
 			</span>
		</div>
		<div class="row">
			<span class="menu">&nbsp;</span>
 			<span class="content">
 				<video id="selectVod" src="#"/>
				<script type="text/javascript">
					function readVodURL(input){
						if(input.files && input.files[0]){
							var reader = new FileReader();
							reader.onload = function(e){
								$('#selectVod').attr('src', e.target.result).width(200);
							}
							reader.readAsDataURL(input.files[0]);
						}
					}
				</script>
 			</span>
		</div>
	</div>
	</fieldset>
		<div>
			<input type="submit" value="완료" class="btn">		
 			<input type="button" onclick="location.href='list'" value="목록보기" class="btn">
		</div>
	</form>
</body>
</html>