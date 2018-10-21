package kr.or.ddit.board.web;

import kr.or.ddit.board.model.PostVo;
import kr.or.ddit.board.service.PostService;
import kr.or.ddit.board.service.PostServiceInf;
import kr.or.ddit.util.PageOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("post_groupno", bd_no);
		resultMap.put("page", PageOption.pageController().get("page"));
		resultMap.put("pageSize", PageOption.pageController().get("pageSize"));
		List<PostVo> postList =  service.selectBoardInPost(resultMap);
		request.setAttribute("postList", postList);
		request.getRequestDispatcher("/board/post.jsp").forward(request,response);
	}
}
