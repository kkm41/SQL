<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
   <%@ include file="sub_image_menu.jsp" %>
   <article>
      <form action="shop.do?command=join" method="post" name="joinForm">
         <h2>Join Us</h2>
         
         <h3>Basic Info</h3>
         <div class="field">
         	<label>
         		user Id
         	</label>
    		<div>
         	<input type="text" name="userid" size="12">
    		     	<input type="hidden" name="reid">
         	<input type="button" value="중복체크" onclick ="idecheck()">
    		</div>
         </div>
         
         <div class="field">
         	<label>Password</label> <input type="password" name="pwd">
         </div>
         <div class="field"><label>Retype Password</label> <input type="password" name="pwdCheck"></div>
         <div class="field"><label>Name</label> <input type="text" name="name1"></div>
         <div class="field"><label>phone</label> <input type="text" name="phone"></div>
         <div class="field"><label>E-mail</label> <input type="text" name="email"></div>
         <h3>Optional Info</h3>
         <div class="field">
       	  <label>Zip Code</label>
	         <div>
		         <input type="text" name="zip_num" readonly>
		         <input type="button" onclick="post_zip()" value="우편번호 찾기">
         	</div> 
         </div>
          <div class="field">
	       	  <label>Address</label>
	         <input type="text" size="50" name="address1" readonly>
         </div>
          <div class="field">
	       	  <label>detail Address</label>
	         <input type="text" size="50" name="address2">
         </div>
         
         <div class="btn">
         	<input type="button" value="회원가입" onclick = "go_save()">
         	<input type="button" value="메인으로" onclick="loaction.herf='shop.do?command=index'">
         </div>
         
      </form>
   </article>
   </div>
</section>

<%@ include file="../footer.jsp" %>