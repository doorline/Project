<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.sjw.homebook.dto.*"%>
<%@ page import="com.sjw.homebook.dao.*"%>
<%@ page import="com.sjw.homebook.service.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.sjw.mymember.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Homebook List</title>
<%
	MDto lgin_dto = (MDto)session.getAttribute("login_user");
	if(lgin_dto == null){
		%>
		<script type="text/javascript">
		alert('로그인 하세요');
		document.location.href="/member/login_view";
		</script>
<% 
	}else{
		String pageNumberStr = request.getParameter("xpage");
		HListService service = new HListService(lgin_dto.getId()); 
		//BDao dao = sqlSession.getMapper(BDao.class);
		//BDao dao = new BDao();
		int pageNumber = 1;
		if (pageNumberStr != null) {
			pageNumber = Integer.parseInt(pageNumberStr);
		}
		HMessageListView viewData = service.getMessageListView(pageNumber);
		int totalPages = viewData.getPageTotalCount();
		if(pageNumberStr==null) pageNumberStr="1";
		
		List<HDto> subList = viewData.getMessageList();
	
%>
<style type="text/css">
	ul.pagination{
		display:table;
		margin-left: auto;
  		margin-right: auto;
	}
	li.page-item{
		display:inline-block;
	}
</style>s


</head>
<body>
	<%@ include file="/WEB-INF/views/common/top.jsp" %>
	<div class="container" style="padding-top:20px;">
	<h1 align="center">Spring Mybatis Homebook</h1>
	<div style="padding-top:20px;"></div>
	<table class="table table-hover">
		<thead class="table-active">
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>날짜</th>
				<th>분류</th>
				<th>계정</th>
				<th>내역</th>
				<th>수입</th>
				<th>지출</th>
				<th colspan=2>수정/삭제</th>
			</tr>
		</thead>
		<!-- Model.setAttribute("list",dtos)로 서비스에서 등록한 내용을 읽어 뿌려준다. -->
		
		<c:forEach items="<%=subList %>" var="dto">
		<tbody>
			<tr>
				<td>${dto.serialNo}</td>
				<td>${dto.mId}</td>
				<td>${dto.day}</td>
				<td>${dto.section}</td>
				<td>${dto.accountTitle}</td>
				<td>${dto.remark}</td>
				<td>${dto.revenue}</td>
				<td>${dto.expense}</td>
				<td>
					<button type="button" onclick="location.href='/homebook/hmodify_view?no=${dto.getSerialNo()}'" class="btn btn-primary">
							수정${dto.getSerialNo()}</button>
					<button type="button" onclick="location.href='/homebook/delete?no=${dto.getSerialNo()}'" class="btn btn-primary">
							삭제${dto.getSerialNo()}</button>
				</td>
			</tr>
		</tbody>
		</c:forEach>
		<tfoot>
			<tr>
				<td colspan="9"><a href="/homebook/hwrite_view" class="btn btn-primary">가계부 작성</a> </td>
			</tr>
		</tfoot>
	</table>
	
	<div class='text-center'>
		<ul class="pagination">
			<li class="page-item">
				<a class="page-link" href="list?xpage=<%=Integer.parseInt(pageNumberStr)-1%>">&laquo;</a>
			</li>
	<%
		for (int i = 1; i <= viewData.getPageTotalCount(); i++) {
	 %>
			<li class="page-item"><a href="list?xpage=<%=i%>">[<%=i%>]</a></li>
	<%
		}
	%>
			<li class="page-item">
				<a class="page-link" href="list?xpage=<%=Integer.parseInt(pageNumberStr)+1%>">&raquo;</a>
			</li>
		</ul>
<%
		out.println("<p/>");
		out.println(pageNumberStr + "/" + totalPages);
		}
%>
	</div>
	</div>
	<div style="padding-top:20px;"></div>
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>
</html>