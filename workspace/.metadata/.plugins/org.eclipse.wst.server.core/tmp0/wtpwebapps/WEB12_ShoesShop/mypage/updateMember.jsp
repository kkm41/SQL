<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../header.jsp"%>




<section>
   
   <%@include file="sub_image_menu.jsp" %>
   <article>
         <form action="shop.do?command=updateMember" method="post" name="joinForm">
            <h2> Update Member </h2>
            
            <h3> Basic Info </h3>
            <div class="field">
               <label>User ID</label>
               <div>
                  <input type="text" name="userid" value="${loginUser.userid}" readonly="readonly">
               </div>
            </div>
            <div class="field">
               <label>Password</label>
               <div>
                  <input type="password" name="pwd">
               </div>               
            </div>
            <div class="field">
               <label>Confirm Password</label>
               <div>
                  <input type="password" name="pwdCheck" >
               </div>            
            </div>
            <div class="field">
               <label>Name</label>
               <div>
                  <input type="text" name="name1" value="${loginUser.name}">
               </div>            
            </div>
            <div class="field">
               <label>Phone</label>
               <div>
                  <input type="text" name="phone" value="${loginUser.phone}">
               </div>               
            </div>
            <div class="field">
               <label>Email</label>
               <div>
                  <input type="text" name="email" value="${loginUser.email}">
               </div>               
            </div>
            
            
            <h3> Optinal Info</h3>      
            <div class="field">
               <label> Zip Code </label>
               <div>
                  <input type="text" name="zip_num" readonly="readonly" value="${loginUser.zip_num}">
                  <input type="button" onclick="post_zip()" value="우편번호 찾기">
               </div>
            </div>   
            <div class="field">
               <label> Address </label>
               <div>
               
                  <input type="text" name="address1" readonly="readonly" value="${loginUser.address1}">
               </div>            
            </div>   
            <div class="field">
               <label> detailed Address </label>
               <div>
                  <input type="text" name="address2" value="${loginUser.address2}">
               </div>            
            </div>
            
            <div class="btn">
               <input type="button" value="회원정보수정" onclick="go_updateMember()">
            </div>
         </form>
   </article>
   </div>
</section>




<%@include file="../footer.jsp"%>
