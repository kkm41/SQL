package com.himedia.shop.controller.action.mypage;

import java.io.IOException;

import com.himedia.shop.controller.action.Action;
import com.himedia.shop.controller.dto.MemberVO;
import com.himedia.shop.dao.OrderDao;
import com.himedia.shop.dao.ProductDao;
import com.himedia.shop.dto.CartVO;
import com.himedia.shop.dto.ProductVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class OrderInsertOneAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		
		if(mvo == null) {
			 response.sendRedirect("shop.do?command=loginForm");
		}else {
			
			int pseq = Integer.parseInt( request.getParameter("pseq"));
			int quantity = Integer.parseInt( request.getParameter("quantity"));
			
			ProductDao pdao = ProductDao.getInstane();
			OrderDao odao = OrderDao.getInstance();

			
			ProductVO pvo = pdao.getProduct(pseq);
			odao.insertOrders(mvo.getUserid());
			
			int oseq = odao.loopupMaxoseq(mvo.getUserid()); 
			odao.insertOrdersDetailOne(pvo.getPseq(),quantity , oseq);
			
			response.sendRedirect("shop.do?command=orderList&oseq="+oseq);
			
		}

	}

}
