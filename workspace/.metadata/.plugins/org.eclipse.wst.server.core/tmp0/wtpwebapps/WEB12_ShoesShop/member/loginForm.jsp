<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<%@ include file="sub_image_menu.jsp" %>
	<article>
		<form method="post" action="shop.do?command=login" name="loginForm">
			<h2>Login</h2>
			<div class="field">
				<label>User ID</label><input name="userid" type="text">
			</div>
			<div class="field">
				<label>Password</label><input name="pwd" type="password">
			</div>
			<span style="font-size:80%; font-weight:bold;">${message}</span>
			<div class="btn">
				<input type="submit" value="LOGIN" onclick="return loginCheck()">
				<input type="button"  value="JOIN" onclick="">
				<input type="button"  value="FIND ID" onclick="">
			</div>
			
		</form>
		
	</article>
	</div>
</section>


<%@ include file ="../footer.jsp" %>