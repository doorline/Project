<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
		var csrfParameter = $("meta[name='_csrf_parameter']").attr("content");
		var csrfHeader = $("meta[name='_csrf_header']").attr("content");
		var csrfToken = $("meta[name='_csrf']").attr('content');
		
		$(function(){
			var chkObj = document.getElementsByName("pIdChk");
			var rowCnt = chkObj.length;
			
			$("input[name='allChk']").click(function(){
				var chk_listArr = $("input[name='pIdChk']");
				for(var i=0;i<chk_listArr.length;i++){
					chk_listArr[i].checked = this.checked;
				}
			});
			$("input[name='pIdChk']").click(function(){
				if($("input[name='pIdChk']:checked").length == rowCnt){
					$("input[name='allChk']")[0].checked = true;
				}else{
					$("input[name='allChk']")[0].checked = false;
				}
			});
		});
	</script>
<meta charset="UTF-8">
<title>관리자화면-list</title>
</head>
<style>
	body{
		background-color:black;
		line-height:2em;
		color:#fff;
		margin:30px;
		}
	.board{		
		display:table;
		width:1800px;
		margin:auto;
		position: relative;
		}
	.boardDiv{
		width:100%;
	}
	.list{
		display:table-row;
    	position:relative;
    	padding: 0 auto;
	}
	.b_menu{
		display:table-cell;
		border-bottom:2px solid silver;
		font-size:20pt;
		font-weight:bold;
		vertical-align:baseline;
		color: #fff;	
		text-align:center;
	}
	.line{
		display:table-cell;
		font-size:18pt;
    	border-bottom:1px solid silver;
    	vertical-align:baseline;
    	color: #fff;
    	text-align:center;
	}
	.paging{
		clear:both;
		position:relative;
	}
	<!--버튼 -->
	.line_footer{
		display: table-caption;
  		caption-side: bottom;
    	text-align:center;
	}
	.d_btn{
			border:0;
			height:30px;
			font-size:15pt;
			background-color:#DC143C;
			border-radius:1px;
			font-weight:bold;
	}
	.btnLine{
		margin:5px;
		display:table-caption;
		caption-side:bottom;
	}
</style>
<body>
	<h1>관리자화면</h1>
	<form action="${pageContext.request.contextPath}/admin/delete">
	<div class="board">
		<div class="list">
			<span class="b_menu" style='width:50px;'><input id="allChk" name="allChk" type="checkbox"></span>
			<span class="b_menu">pId</span>
			<span class="b_menu">제목</span>
			<span class="b_menu">업로드 일자</span>
		</div>
		<c:forEach items="${dtos}" var="dtos">
			<div class="list">
			 	<span class="line" style='width:50px;'><input id="pIdChk" name="pIdChk" type="checkbox" value ="${dtos.pId}"></span>
				<span class="line">${dtos.pId}</span>
				<span class="line"><a href="${pageContext.request.contextPath}/admin/view?pId=${dtos.pId}">${dtos.pName}</a></span>
				<span class="line"><fmt:formatDate value='${dtos.pUDate}' pattern="yyyy/MM/dd"/></span>
			</div>
		</c:forEach>
		<div class="btnLine">
			<span style='margin:2px;'><button type="button" onclick="location.href='/admin/uploadView'" class="d_btn">업로드</button></span>
			<span style='margin:2px;'><button type="submit" class="d_btn">삭제</button></span>
			<span style='margin:2px;'><button type="reset" class="d_btn">초기화</button></span>
		</div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</div>
	</form>
</body>
</html>