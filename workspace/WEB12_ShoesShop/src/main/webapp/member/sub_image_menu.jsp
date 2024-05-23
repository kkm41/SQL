<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="sub_img">
	<img src="images/member/sub_img.jpg" />
</div>

<div class="sub_page"> <!-- nav와 article의 부모시작 -->
	<nav class="sub_menu">
		<c:choose>
			<c:when test="${empty loginUser}">
				<div><a href="">LOGIN</a></div>
				<div><a href="">JOIN</a></div>
			<div><a href="" onclick="">Find ID/PW</a></div>
			</c:when>
			<c:otherwise>
				<div><a href="">update MEMBER</a></div>
				<div><a href="">LOGOUT</a></div>
			</c:otherwise>
		</c:choose>
		
	</nav>
	
