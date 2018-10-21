package kr.or.ddit.board.web;

import kr.or.ddit.board.model.PostVo;
import kr.or.ddit.board.service.PostService;
import kr.or.ddit.board.service.PostServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
	private PostServiceInf service = PostService.getInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bd_no = request.getParameter("no");
		List<PostVo> postList =  service.selectBoardInPost(bd_no);
		request.setAttribute("boardNo", postList);
		request.getRequestDispatcher("/board/post.jsp").forward(request,response);
	}
}
