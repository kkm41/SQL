package com.himedia.shop.controller.action.member;

import java.io.IOException;
import java.sql.Timestamp;

import com.himedia.shop.controller.action.Action;
import com.himedia.shop.controller.dto.MemberVO;
import com.himedia.shop.dao.MemberDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao mdao = MemberDao.getInstance();
	
		MemberVO mvo = new MemberVO(
					request.getParameter("userid"),
					request.getParameter("pwd"),
					request.getParameter("name1"),
					request.getParameter("email"),
					request.getParameter("zip_num"),
					request.getParameter("addredd1"),
					request.getParameter("addredd2"),
					request.getParameter("phone")
				);
		int result = mdao.insertMember(mvo);
		HttpSession session = request.getSession();
		if(result == 1) {
			session.setAttribute("message", "회원가입이 완료되었습니다. 로그인하세요.");
		}else session.setAttribute("message", "회원가입이 실패했습니다. 관리자에게 문희하세요.");
		
		response.sendRedirect("shop.do?command=loginForm");
	
		
	}

}
