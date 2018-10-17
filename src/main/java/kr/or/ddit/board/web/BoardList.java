package kr.or.ddit.board.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ${PACKAGE_NAME}
 * ${FILE_NAME}
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-17 / 오전 11:43
 * @Version :
 */
@WebServlet("/boardList")
public class BoardList extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("/board/board.jsp");
	}
}
