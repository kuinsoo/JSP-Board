package kr.or.ddit.member.web;

import kr.or.ddit.member.encrypt.Sha256;
import kr.or.ddit.member.model.MemberVo;
import kr.or.ddit.member.service.MemberService;
import kr.or.ddit.member.service.MemberServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Member;

/**
 * ${PACKAGE_NAME}
 * ${FILE_NAME}
 * Desc : 로그인 서블릿
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-19 / 오전 11:37
 * @Version :
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberServiceInf service = MemberService.getInstance();

		String memId = request.getParameter("memId");
		String memPass = request.getParameter("memPass");
		String encryptPass = Sha256.encrypt(memPass);
		MemberVo memVo = service.selectMember(memId);
		System.out.println(encryptPass);
		if(memVo != null && memVo.getMem_pass().equals(encryptPass)) {
			HttpSession session = request.getSession();
			session.setAttribute("memVo", memVo);
			// 아이디와 패스워드가 일치하면 메인 페이지로 응답한다.
			request.getRequestDispatcher("main.jsp").forward(request, response);
		} else {
			doGet(request,response);
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		// 일치하지 않는 경우 다시 로그인 페이지로 보낸다.
		response.sendRedirect("index.jsp?result=fail");
	}
}