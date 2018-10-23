package kr.or.ddit.board.web;

import kr.or.ddit.board.model.CommentsVo;
import kr.or.ddit.board.service.CommentsService;
import kr.or.ddit.board.service.CommentsServiceInf;
import kr.or.ddit.board.service.PostService;
import kr.or.ddit.board.service.PostServiceInf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ${PACKAGE_NAME}
 * ${FILE_NAME}
 * Desc : 댓글 서블릿
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-23 / 오전 11:16
 * @Version :
 */
@WebServlet(urlPatterns = {"/insertCmt", "/updateCmt", "/deleteCmt"})
public class CommentsServlet extends HttpServlet {

	CommentsServiceInf cmtService = CommentsService.getInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String uri = request.getRequestURI();

			if(uri.equals("/insertCmt")) {
				insertCmt(request,response);
			}else if(uri.equals("/updateCmt")) {
				updateCmt(request,response);
			}else if(uri.equals("/deleteCmt")) {
				deleteCmt(request,response);
			}
	}

	private void insertCmt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String postNo 		= request.getParameter("postno");
		String postContent 	= request.getParameter("content");
		String postWriter 	= request.getParameter("writer");
		CommentsVo commentsVo = new CommentsVo();
		commentsVo.setCmt_postno(postNo);
		commentsVo.setCmt_content(postContent);
		commentsVo.setCmt_writer(postWriter);
		cmtService.insertCmt(commentsVo);
		response.sendRedirect("/postDetail?postNo="+postNo);
	}

	private void updateCmt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String postNo 		= request.getParameter("postno");
		String content 		= request.getParameter("content");
		String cmtNo 		= request.getParameter("cmtNo");
		CommentsVo cmtVo = cmtService.selectCmt(cmtNo);
		cmtVo.setCmt_content(content);
		cmtService.updateCmt(cmtVo);
		response.sendRedirect("/postDetail?postNo="+postNo);
	}

	private void deleteCmt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String postNo = request.getParameter("postno");
		String cmtNo = request.getParameter("cmtNo");
		int resultCnt = cmtService.deleteCmt(cmtNo);
		response.sendRedirect("/postDetail?postNo="+postNo);
	}
}
