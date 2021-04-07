<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Content View</title>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/top.jsp" %>
	<div class="container" style="padding-top:20px;">
	<div class="form-group" style="padding-top:20px;">
		<table class="table">
			<form action="modify" method="post">
				<input type="hidden" name="bId" value="${content_view.bId}">
				<input type="hidden" name="bGroup" value="${content_view.bGroup}">
				<tr>
					<td scope="col" class="text-center">번호</td>
					<td><span style="padding-left:10px;"></span> ${content_view.bId} </td>
				</tr>
				<tr>
					<td scope="col" class="text-center"> 조회수 </td>
					<td><span style="padding-left:10px;"></span> ${content_view.bHit} </td>
				</tr>
				<tr>
					<td scope="col" class="text-center"> 이름 </td>
					<td><span style="padding-left:10px;"></span>
						<input type="hidden" name="bName" value="${content_view.bName}">${content_view.bName}
					</td>
				</tr>
				<tr>
					<td scope="col" class="text-center"> 제목 </td>
					<td>
						<input type="text" name="bTitle" value="${content_view.bTitle}" class="form-control">						
					</td>
				</tr>
				<tr>
					<td scope="col" class="text-center"> 내용 </td>
					<td>
						<textarea rows="10" name="bContent" class="form-control">${content_view.bContent}</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2"  align="right">
						<input class="btn btn-primary" type="submit" value="수정">
							&nbsp;&nbsp; <a href="list" class="btn btn-primary">목록</a> 
							&nbsp;&nbsp; <a href="delete?bId=${content_view.bId}" class="btn btn-primary">삭제</a> 
							&nbsp;&nbsp; <a href="reply_view?bId=${content_view.bId}" class="btn btn-primary">답변</a>
					</td>
				</tr>
			</form>
	</table>
	</div>
	</div>
	<div style="padding-top:20px;"></div>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	
</body>
</html>