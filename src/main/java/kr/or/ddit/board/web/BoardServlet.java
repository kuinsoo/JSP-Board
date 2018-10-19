package kr.or.ddit.board.web;

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

/**
 * ${PACKAGE_NAME}
 * ${FILE_NAME}
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-19 / 오후 3:46
 * @Version :
 */
@WebServlet(urlPatterns = {"/main", "/boardList"})
public class BoardServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;  charset=UTF-8");

		String uri = request.getRequestURI();

		if(uri.equals("/main")){
			locationMain(request, response);
		}else if(uri.equals("/boardList")) {
			locationBoardList(request,response);
		}
	}

	private void locationMain(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/main.jsp").forward(request,response);
	}

	private void locationBoardList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/board/board.jsp").forward(request,response);
	}
}
