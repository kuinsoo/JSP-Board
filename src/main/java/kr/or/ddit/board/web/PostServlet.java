package kr.or.ddit.board.web;

import kr.or.ddit.board.model.PostVo;
import kr.or.ddit.board.service.*;
import kr.or.ddit.member.model.MemberVo;
import kr.or.ddit.util.BoardUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
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

@MultipartConfig(maxFileSize =1024 * 1024 * 5, maxRequestSize=1024*1024*5*5)
@WebServlet(urlPatterns = {"/postList", "/post", "/postCreate", "/postEdit", "/postDelete", "/postWrite", "/postDetail"})
public class PostServlet extends HttpServlet {
	private PostServiceInf service = PostService.getInstance();
	private BoardServiceInf boardService = BoardService.getInstance();
	private CommentsServiceInf cmtService = CommentsService.getInstance();

	//전역 resultMap
	private Map<String, String> resultMap =new HashMap<>();
	private String bd_no = "";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String uri = request.getRequestURI();

		if (uri.equals("/postCreate")) {
			locationPostCreate(request, response);
		}else if (uri.equals("/postEdit")) {
			locationPostEdit(request, response);
		}
	}
	private void locationPostCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String recursion = request.getParameter("recursion");
		bd_no = request.getParameter("no");
		if(recursion.equals("")){
			String title =  request.getParameter("pc_title");
			String content =  request.getParameter("smarteditor");
			HttpSession session = request.getSession();
			MemberVo  memberVo = (MemberVo)session.getAttribute("memVo");
			PostVo postVo = new PostVo();
			postVo.setPost_title(title);
			postVo.setPost_content(content);
			postVo.setPost_writer(memberVo.getMem_id());
			postVo.setPost_boardno(bd_no);
			postVo.setPost_recursion("");
//		for (Part part:
//				request.getParts()) {
//			part.getHeader("Content-disposition");
//			String contentDisposition = part.getHeader("Content-disposition");
//			String fileName = BoardUtil.getFileNameFromHeader(contentDisposition);
//			System.out.println(fileName);
//			String path = "/upload";
//			part.write("D:\\T_Development\\d_Study\\JSP\\jsp_IntelliJ\\upload\\"+ fileName);
//			part.delete();
//		}
			Part part = request.getPart("attach");
			System.out.println("profile part : "+ part.getContentType());
			System.out.println("Content-disposition : " + part.getHeader("Content-disposition"));
			String contentDisposition = part.getHeader("Content-disposition");
			String fileName = BoardUtil.getFileNameFromHeader(contentDisposition);
			if(fileName.equals("")){
				int resultCnt = service.createPost(postVo);
				response.sendRedirect("/post?no="+bd_no+"&page="+1+"&pageSize="+10);
			}else {
				String path = "/upload";
				part.write("D:\\T_Development\\d_Study\\JSP\\upload\\" + fileName);
				part.delete();
				int resultCnt = service.createPost(postVo);
				response.sendRedirect("/post?no="+bd_no+"&page="+1+"&pageSize="+10);
			}


		}else {
			String title =  request.getParameter("pc_title");
			String content =  request.getParameter("smarteditor");

			HttpSession session = request.getSession();
			MemberVo  memberVo = (MemberVo)session.getAttribute("memVo");
			PostVo postVo = new PostVo();
			postVo.setPost_title(title);
			postVo.setPost_content(content);
			postVo.setPost_writer(memberVo.getMem_id());
			postVo.setPost_boardno(bd_no);
			postVo.setPost_recursion(recursion);
			postVo.setPost_groupno("");
			System.out.println(recursion);
			System.out.println("test" + bd_no);
			Part part = request.getPart("attach");
			System.out.println("profile part : "+ part.getContentType());
			System.out.println("Content-disposition : " + part.getHeader("Content-disposition"));
			String contentDisposition = part.getHeader("Content-disposition");
			String fileName = BoardUtil.getFileNameFromHeader(contentDisposition);
			if(fileName.equals("")){
				int resultCnt = service.createPost(postVo);
				response.sendRedirect("/post?no="+bd_no+"&page="+1+"&pageSize="+10);
			}else {
				part.write("D:\\T_Development\\d_Study\\JSP\\upload\\" + fileName);
				part.delete();
				int resultCnt = service.createPost(postVo);
				response.sendRedirect("/post?no="+bd_no+"&page="+1+"&pageSize="+10);
			}
		}
	}

	private void locationPostEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String postNo = request.getParameter("postNo");
		String title = request.getParameter("pc_title");
		String content = request.getParameter("smarteditor");
		String no = request.getParameter("no");
		PostVo postVo = service.selectPost(postNo);
		postVo.setPost_title(title);
		postVo.setPost_content(content);
		service.editPost(postVo);

		Part part = request.getPart("attach");
		System.out.println("profile part : "+ part.getContentType());
		System.out.println("Content-disposition : " + part.getHeader("Content-disposition"));
		String contentDisposition = part.getHeader("Content-disposition");
		String fileName = BoardUtil.getFileNameFromHeader(contentDisposition);
		if(fileName.equals("")){
			int resultCnt = service.createPost(postVo);
			response.sendRedirect("/post?no="+bd_no+"&page="+1+"&pageSize="+10);
		}else {
			String path = "/upload1";
			part.write("D:\\T_Development\\d_Study\\JSP\\upload\\" + fileName);
			part.delete();
			int resultCnt = service.createPost(postVo);
			response.sendRedirect("/post?no="+bd_no+"&page="+1+"&pageSize="+10);
		}

	}





	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String uri = request.getRequestURI();

		if (uri.equals("/post")) {
			locationPost(request, response);
		} else if (uri.equals("/postList")) {
			locationPostList(request, response);
		} else if (uri.equals("/postDelete")) {
			locationPostDelete(request, response);
		} else if (uri.equals("/postWrite")) {
			locationPostWrite(request,response);
		} else if (uri.equals("/postDetail")) {
			locationPostDetail(request,response);
		}
	}

	String pages="";
	private void locationPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		bd_no = request.getParameter("no");
		pages = request.getParameter("page");
		String pageSize = request.getParameter("pageSize");
		resultMap.put("post_groupno", bd_no);
		resultMap.put("page",pages);
		resultMap.put("pageSize", pageSize);

		response.sendRedirect("/postList");
	}

	private void locationPostList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<PostVo> postList =  service.selectBoardInPost(resultMap);
		request.setAttribute("postList", postList);
		List<PostVo> postAllList = service.selectAllPost(bd_no);
		request.setAttribute("postAllList",postAllList);
		request.setAttribute("boardList", boardService.selectAllBoard());
		request.setAttribute("boardPage", "postList");
		request.setAttribute("page", Integer.parseInt(pages));
		request.setAttribute("post_groupno", bd_no);
		request.getRequestDispatcher("/board/post.jsp").forward(request,response);
	}

	private  void locationPostWrite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bd_no = request.getParameter("no");
		request.setAttribute("recursion",request.getParameter("recursion"));
		request.setAttribute("boardList", boardService.selectAllBoard());
		request.setAttribute("boardPage", "postCreate");
		request.setAttribute("no" ,bd_no);
		request.getRequestDispatcher("/board/post.jsp").forward(request,response);
	}
	private void locationPostDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	private void locationPostDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String postNo = request.getParameter("postNo");
		PostVo postVo = service.selectPost(postNo);
		request.setAttribute("boardList", boardService.selectAllBoard());
		request.setAttribute("postVo", postVo);
		request.setAttribute("boardPage", "postDetail");
		request.setAttribute("no", bd_no);
		HttpSession session = request.getSession();
		MemberVo  memberVo = (MemberVo)session.getAttribute("memVo");
		request.setAttribute("memVo", memberVo);

		// 게시글 번호에 맞는 댓글 가져오기
		request.setAttribute("cmtList", cmtService.selectCmtList(postVo.getPost_no()));

		request.getRequestDispatcher("/board/post.jsp").forward(request,response);
	}


}
