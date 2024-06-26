package com.himedia.shop.controller.action.admin;

import java.io.IOException;

import com.himedia.shop.controller.action.Action;
import com.himedia.shop.dao.ProductDao;
import com.himedia.shop.dto.ProductVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminProductDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pseq = Integer.parseInt(request.getParameter("pseq"));
		ProductDao pdao = ProductDao.getInstane();
		ProductVO pvo = pdao.getProduct(pseq);
		String[] kindList = {"Heels","Boots","Sandals","Snicakers","Slipers"};
		int index=Integer.parseInt(pvo.getKind());
			
			request.setAttribute("kind", kindList[index-1]);
			request.setAttribute("productVO", pvo);
			request.getRequestDispatcher("admin/product/productDetail.jsp").forward(request, response);
		}
}


