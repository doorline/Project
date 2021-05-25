<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<title>업로드화면</title>
</head>
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
		margin:auto;
	}
	.row{
		display:table-row;
		position:relative;
    	padding: 0 auto;
		margin:5px;
	}
	.b_menu{
		margin:10px;
		display:table-cell;
		vertical-align:middle;
	}
	.content{
		margin:10px;
		display:table-cell;
		vertical-align:middle;
	}
	fieldset{
		width:900px;
	}
	
</style>
<body>
<form action="${pageContext.request.contextPath}/admin/upload?${_csrf.parameterName}=${_csrf.token}" method="POST" enctype="multipart/form-data"> 
	<div class="board">
	<fieldset>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<div class="row">
			<span class="b_menu">제목</span>
 			<span class="content">
 				<input type="text" name="pName" id="pName" required="required" placeholder="제목" class="form-control"/>
 			</span>
		</div>
		<div class="row">
			<span class="b_menu">분류</span>
 			<span class="content">
 				<select name="cId" id="cId" class="form-control-select">
					<option value="국내드라마">국내드라마</option>
					<option value="해외드라마">해외드라마</option>
					<option value="국내영화">국내영화</option>
					<option value="해외영화">해외영화</option>
				</select>
 			</span>
		</div>
		<div class="row">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<span class="b_menu">상세장르</span>
 			<span class="content">
 				<select name="tId" id="tId" class="form-control-select">
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
			<span class="b_menu">썸네일</span>
 			<span class="content">
 				<input type="file" name="imgFile" id="imgInput" onchange="readURL(this);" />
 			</span>
		</div>
		<div class="row">
			<span class="b_menu">썸네일보기</span>
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
			<span class="b_menu">Vod</span>
 			<span class="content">
 				<input type="file" name="vodFile" id="vodInput" onchange="readVodURL(this);"/> 				
 			</span>
		</div>
		<div class="row">
			<span class="b_menu">영상 미리보기</span>
 			<span class="content">
 				<video id="selectVod" src="#"></video>
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
	</fieldset>
		<div>
			<input type="submit" value="업로드" class="btn">		
 			<input type="button" onclick="location.href='list'" value="목록보기" class="btn">
		</div>
	</div>
</form>
</body>
</html>