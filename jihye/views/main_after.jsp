<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.watching.dto.ProductDTO" %>
<%@ page import="com.watching.dto.MemberDTO" %>
<%@ page import="com.watching.service.CategoryService" %>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.apache.ibatis.session.SqlSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="bodyStyle.css" rel="stylesheet" type="text/css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>메인 (로그인 후)</title>
<style>
html, body {
  margin: 0; padding: 0;
  width: 100%; height: 100%;
  font-family: Verdana, sans-serif;
}
main.container-fluid {
  min-height: 100%;
}
ul li {
display:inline-block; 
margin:5px;
}
li:nth-of-type(n+7) {
  display: none;
}
h4 {
margin:10px;
}
a, a:link, a:visited {
  color: white;
  text-decoration: none;
  algin: center;
}

* {box-sizing: border-box;}
.mySlides {display: none;}
img {vertical-align: middle;}

.slideshow-container {
  max-width: 1000px;
  position:relative;
  margin: 10px 50px 10px 50px;
}

/* The dots/bullets/indicators */
.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@media (max-width: 1300px) {
  li:nth-of-type(n+4) {
 	display: none;
	}
}
@media (max-width: 720px) {
  li:nth-of-type(n+3) {
 	display: none;
	}
}
</style>
</head>
<body>

<main class="container-fluid">
<%@include file="./template/top.jsp"%>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

<c:set var="ddl" value="${dms_dramalist}"/>
<c:set var="adl" value="${abr_dramalist}"/>
<c:set var="dfl" value="${dms_filmlist}"/>
<c:set var="afl" value="${abr_filmlist}"/>

	<div id="container">
	<h4>신작</h4>
	
	<div class="slideshow-container">

		<div class="mySlides fade">
		  <img src="/resources/ProductImg/국내드라마_빈센조_메인_포스터.JPG" style="width:1800px; height:400px;">
		</div>
		
		<div class="mySlides fade">
		  <img src="/resources/ProductImg/국내드라마_나빌레라_메인_포스터2.JPG" style="width:1800px; height:400px;">
		</div>
		
		<div class="mySlides fade">
		  <img src="/resources/ProductImg/국내드라마_펜트하우스2_메인_포스터2.JPG" style="width:1800px; height:400px;">
		</div>
		
		</div>
		<br>
		
		<div style="text-align:center">
		  <span class="dot"></span> 
		  <span class="dot"></span> 
		  <span class="dot"></span> 
		</div>
		
		<script>
		var slideIndex = 0;
		showSlides();

		function showSlides() {
		    var i;
		    var slides = document.getElementsByClassName("mySlides");
		    var dots = document.getElementsByClassName("dot");
		    for (i = 0; i < slides.length; i++) {
		       slides[i].style.display = "none";  
		    }
		    slideIndex++;
		    if (slideIndex > slides.length) {slideIndex = 1}    
		    for (i = 0; i < dots.length; i++) {
		        dots[i].className = dots[i].className.replace(" active", "");
		    }
		    slides[slideIndex-1].style.display = "block";  
		    dots[slideIndex-1].className += " active";
		    setTimeout(showSlides, 2000); // Change image every 2 seconds
		}
		</script>
	
	<div id="contents_list">
	<h4>국내 드라마</h4>
		<ul>
		<c:forEach items="${dms_dramalist}" var="ddl" varStatus="status">
		<li>
			<div class="pImg"><a href="/vodplay"><img src="/resources/ProductImg/${ddl.pImg}" style="width:290px; height:200px;"></a></div>
			<div class="pName"><a href="/vodplay">${ddl.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				
				
	<h4>해외 드라마</h4>
		<ul>
		<c:forEach items="${abr_dramalist}" var="adl" varStatus="status">
		<li>
			<div class="pImg"><a href="/vodplay"><img src="/resources/ProductImg/${adl.pImg}" style="width:290px; height:200px;"></a></div>
			<div class="pName"><a href="/vodplay">${adl.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				
		
	<h4>국내 영화</h4>
		<ul>
		<c:forEach items="${dms_filmlist}" var="dfl" varStatus="status">
		<li>
			<div class="pImg"><a href="/vodplay"><img src="/resources/ProductImg/${dfl.pImg}" style="width:290px; height:200px;"></a></div>
			<div class="pName"><a href="/vodplay">${dfl.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				
			
			
	<h4>해외 영화</h4>
		<ul>
		<c:forEach items="${abr_filmlist}" var="afl" varStatus="status">
		<li>
			<div class="pImg"><a href="/vodplay"><img src="/resources/ProductImg/${afl.pImg}" style="width:290px; height:200px;"></a></div>
			<div class="pName"><a href="/vodplay">${afl.pName}</a></div>
		</li>
		</c:forEach>
	</ul>				
	</div>
	
	</div>


</main>>
<%@include file="./template/bottom.jsp"%>

</body>
</html>