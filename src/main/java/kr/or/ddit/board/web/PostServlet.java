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
 * Desc :  게시글 서블릿
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-21 / 오전 8:40
 * @Version :
 */
@WebServlet("/postList")
public class PostServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/board/post.jsp").forward(request,response);
	}
}
