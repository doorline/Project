<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
	.tc{
		text-align:left;
		padding:10px;
		}
	.board{width:950px;}
	.w70{width:70px;}
	.w500{width:500px;}
	.w200{width:200px;}
	.w120{width:120px;}
	.w100{width:100px;}	
</style>
</head>
<body>

		<h1>작품 수정</h1>
	
	<hr>
	<form action="/admin/modify" method="post" enctype="multipart/form-data"> <fieldset>
	<div class ="board">
		<div class="row">
			<span class="menu w100">관리자Id</span>
 			<span class="content w500">
 				<input type="text" name="aId" size="50" value="${view.aId}" class="form-control">
				<input type="hidden" name="pCode" value="${view.pCode}">
 			</span>
		</div>
		<div class="row">
			<span class="menu w100">제목</span>
 			<span class="content w500">
 				<input type="text" name="pName" required="required" value="${view.pName}">
 			</span>
		</div>
		<div class="row">
			<span class="menu w100">분류</span>
 			<span class="content w500">
 				<select name="kCode" id="kCode" class="form-control">
					<option value="국내드라마" ${view.kCode == '국내드라마' ? "selected='selected'" : ' '}>국내드라마</option>
					<option value="해외드라마" ${view.kCode == '해외드라마' ? "selected='selected'" : ' '}>해외드라마</option>
					<option value="국내영화" ${view.kCode == '국내영화' ? "selected='selected'" : ' '}>국내영화</option>
					<option value="해외영화" ${view.kCode == '해외영화' ? "selected='selected'" : ' '}>해외영화</option>
				</select>
 			</span>
		</div>
		<div class="row">
			<span class="menu w100">상세장르</span>
 			<span class="content w500">
 				<select name="tCode" id="tCode" class="form-control">
					<option value="로맨스/멜로" ${view.tCode == '로맨스/멜로' ? "selected='selected'" : ' '}>로맨스/멜로</option>
					<option value="코미디" ${view.tCode == '코미디' ? "selected='selected'" : ' '}>코미디</option>
					<option value="SF/판타지" ${view.tCode == 'SF/판타지' ? "selected='selected'" : ' '}>SF/판타지</option>
					<option value="어드벤쳐" ${view.tCode == '어드벤쳐' ? "selected='selected'" : ' '}>어드벤쳐</option>
					<option value="공포/스릴러" ${view.tCode == '공포/스릴러' ? "selected='selected'" : ' '}>공포/스릴러</option>
					<option value="미스터리" ${view.tCode == '미스터리' ? "selected='selected'" : ' '}>미스터리</option>
					<option value="드라마" ${view.tCode == '드라마' ? "selected='selected'" : ' '}>드라마</option>
					<option value="다큐멘터리" ${view.tCode == '다큐멘터리' ? "selected='selected'" : ' '}>다큐멘터리</option>
				</select>
 			</span>
		</div>
		<div class="row">
			<span class="menu w100">내용</span>
 			<span class="content w500">
 				<textarea rows="10" name="pContent" required="required">${view.pContent}</textarea>
 			</span>
		</div>
		<div class="row">
			<span class="menu w100">썸네일</span>
 			<span class="content w500">
 				<input type="file" name="imgFile" id="imgInput" onchange="readURL(this);" />
 			</span>
		</div>
		<div class="row">
			<span class="menu w100">썸네일보기</span>
 			<span class="content w500">
 				<img id="selectImg" src="/resources/productImg/${view.pImg}"/>
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
				<p/>
				<%=request.getRealPath("/") %>
 			</span>
		</div>
		<div class="row">
			<span class="menu w100">Vod</span>
 			<span class="content w500">
 				<input type="file" name="vodFile" id="vodInput" onchange="readVodURL(this);"/> 	
 			</span>
		</div>
		<div class="row">
			<span class="menu w100">&nbsp;</span>
 			<span class="content w500">
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
		<div class="row">
			<span class="menu w100"><input type="submit" value="수정"></span>
 			<span class="menu w100"><input type="button" onclick="location.href='list'" value="목록보기"></span>
		</div>
	</div>
	</fieldset>
	</form>
</body>
</html>