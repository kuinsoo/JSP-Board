package kr.or.ddit.member.web;

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
 * @Date : 2018-10-19 / 오후 3:33
 * @Version :
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		/*response.sendRedirect("/index.jsp");*/
		request.getRequestDispatcher("index.jsp").forward(request,response);
	}
}
