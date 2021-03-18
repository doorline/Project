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
</head>
<body>

		<h1>작품 업로드</h1>
	
	<hr>
	<form action="/admin/modify" method="post" enctype="multipart/form-data"> <fieldset>
	
	<table> 
		<tr>
			<th>관리자Id</th>
			<td>
				<input type="text" name="aId" size="50" value="${view.aId}" class="form-control">
				<input type="hidden" name="pCode" value="${view.pCode}">
			</td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="pName" required="required" value="${view.pName}"></td>
		</tr>
		
		<tr>
			<th>분류</th>
			<td><select name="kCode" id="kCode" class="form-control">
				<option value="국내드라마">국내드라마</option>
				<option value="해외드라마">해외드라마</option>
				<option value="국내영화">국내영화</option>
				<option value="해외영화">해외영화</option>
				</select></td>
		</tr>
		
		<tr>				
			<th>상세장르</th>
			<td><select name="tCode" id="tCode" class="form-control">
				<option value="로맨스/멜로">로맨스/멜로</option>
				<option value="코미디">코미디</option>
				<option value="SF/판타지">SF/판타지</option>
				<option value="어드벤쳐">어드벤쳐</option>
				<option value="공포/스릴러">공포/스릴러</option>
				<option value="미스터리">미스터리</option>
				<option value="드라마">드라마</option>
				<option value="다큐멘터리">다큐멘터리</option>
				</select></td>
		</tr>

		<tr>
			<th>썸네일</th>
			<td>
				<input type="file" name="file" id="imgInput" onchange="readURL(this);" />
			</td>
		</tr>
 
		<tr>
			<th>썸네일보기</th>
			<td>				
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
			</td>
		</tr>
		<tr>
			<td colspan="2"> <input type="submit" value="완료">
			<input type="button" onclick="location.href='list'" value="목록보기"></td>
		</tr>
		</table>
		</fieldset>
		</form>
</body>
</html>