package com.himedia.shop.controller.action.mypage;

import java.io.IOException;

import com.himedia.shop.controller.action.Action;
import com.himedia.shop.controller.dto.MemberVO;
import com.himedia.shop.dao.MemberDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DeleteMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		
		if(mvo == null ) response.sendRedirect("shop.do?command=loginForm");
		else {
			MemberDao mdao = MemberDao.getInstance();
			
			//useyn을 n으로 변경
			mdao.delteMember(mvo.getUserid());
			
			session.setAttribute("message", "회원 탈퇴가 완료되었습니다.");
			session.removeAttribute("loginUser");
			response.sendRedirect("shop.do?command=loginForm");
			
		}

	}

}
