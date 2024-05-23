<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/header.jsp" %>
<section>
	<%@ include file="sub_image_menu.jsp" %>
	<article>
		<form name="orderFrm" >
			<h2>주문자 정보</h2>
		
			<div class="tb" style="margin-bottom:100px">
				<div class="row">
					<div class="coltitle">주문일자</div>
					<div class="coltitle">주문 번호</div>
					<div class="coltitle">주문자 성명</div>
					<div class="coltitle">주문총액</div>
				</div>
				<div class="row">
					<div class="coltitle"><fmt:formatDate value="${orderFirstDetail.indate}" type="date" /></div>
					<div class="coltitle">${orderFirstDetail.oseq}</div>
					<div class="coltitle">${orderFirstDetail.mname}</div>
					<div class="coltitle"><fmt:formatNumber value="${totalPrice}" type="currency" /></div>
				</div>
				<div class="row">
					<div class="coltitle" style="flex:1">배송주문</div>
					<div class="col" style="flex:4">${orderFirstDetail.zip_num} ${orderFirstDetail.address1} ${orderFirstDetail.address2}</div>
				</div>
				
			</div>
			
			<h2>주문 상품정보</h2>
		
			<div class="tb">
				<div class="row">
					<div class="coltitle">상품명</div>
					<div class="coltitle">상품별 주문번호</div>
					<div class="coltitle">수량</div>
					<div class="coltitle">가격</div>
				</div>
			</div>
			<c:forEach items="${orderList}" var="orderVO">
				<div class="row">
					<div class="col">${orderVO.pname}</div>
					<div class="col">${orderVO.odseq}</div>
					<div class="col">${orderVO.quantity}</div>
					<div class="col">
						<fmt:formatNumber value="${orderVO.price2*orderVO.quantity}" type="currency" />
					</div>
				</div>
			</c:forEach>
			<div class="btn">
				<input type="button" value="뒤로" onclick = "history.go(-1)"/>
				<input type="button" value="메인으로"
							onclick = "location.href='shop.do?command=index'"/>
			</div>
		</form>
	</article>
	</div>
</section>

<%@ include file ="/footer.jsp" %>