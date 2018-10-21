package kr.or.ddit.board.web;

import kr.or.ddit.board.model.PostVo;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceInf;
import kr.or.ddit.board.service.PostService;
import kr.or.ddit.board.service.PostServiceInf;
import kr.or.ddit.util.BoardUtil;

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
@WebServlet(urlPatterns = {"/postList", "/post", "/postCreate", "/postEdit", "/postDelete"})
public class PostServlet extends HttpServlet {
	private PostServiceInf service = PostService.getInstance();
	private BoardServiceInf boardService = BoardService.getInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String uri = request.getRequestURI();

		if (uri.equals("/post")) {
			locationPost(request, response);
		} else if (uri.equals("/postList")) {
			locationPostList(request, response);
		} else if (uri.equals("/postCreate")) {
			locationPostCreate(request, response);
		}else if (uri.equals("/postEdit")) {
			locationPostEdit(request, response);
		} else if (uri.equals("/postDelete")) {
			locationPostDelete(request, response);
		}
	}

	//전역 resultMap
	private Map<String, String> resultMap =new HashMap<>();
	private void locationPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bd_no = request.getParameter("no");
		String page = request.getParameter("page");
		String pageSize = request.getParameter("pageSize");
		resultMap.put("post_groupno", bd_no);
		resultMap.put("page",page);
		resultMap.put("pageSize", pageSize);
		response.sendRedirect("/postList");
	}

	private void locationPostList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<PostVo> postList =  service.selectBoardInPost(resultMap);
		request.setAttribute("postList", postList);
		List<PostVo> postAllList = service.selectAllPost();
		request.setAttribute("postAllList",postAllList);
		request.setAttribute("boardList", boardService.selectAllBoard());
		request.getRequestDispatcher("/board/post.jsp").forward(request,response);
	}

	private  void locationPostCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("boardList", boardService.selectAllBoard());
		request.getRequestDispatcher("/board/postCreate.jsp").forward(request,response);
	}
	private void locationPostEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	private void  locationPostDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
