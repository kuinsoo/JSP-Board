package kr.or.ddit.board.web;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceInf;
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
import java.util.Date;
import java.util.List;

/**
 * ${PACKAGE_NAME}
 * ${FILE_NAME}
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-19 / 오후 3:46
 * @Version :
 */
@WebServlet(urlPatterns = {"/main", "/boardList" , "/boardInsert", "/boardEdit" })
public class BoardServlet extends HttpServlet {
	private BoardServiceInf boardService = BoardService.getInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String uri = request.getRequestURI();

		if (uri.equals("/main")) {
			locationMain(request, response);
		} else if (uri.equals("/boardList")) {
			locationBoardList(request, response);
		} else if (uri.equals("/boardInsert")) {
			locationBoardInsert(request,response);
		} else if (uri.equals("/boardEdit")) {
			locationBoardEdit(request,response);
		}
	}

	private void locationMain(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		List<BoardVo> boardList = boardService.selectAllBoard();
		request.setAttribute("boardList", boardList);
		request.getRequestDispatcher("/main.jsp").forward(request,response);
	}

	private void locationBoardList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		List<BoardVo> boardList = boardService.selectAllBoard();
		request.setAttribute("boardList", boardList);
		request.getRequestDispatcher("/board/board.jsp").forward(request,response);
	}

	/**
	 * 게시판 생성
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void locationBoardInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String bd_name 	= request.getParameter("bd_name");
		String bd_use 	= request.getParameter("bd_use");
		BoardVo boardVo = new BoardVo();
		boardVo.setBd_name(bd_name);
		boardVo.setBd_use(bd_use);
		HttpSession session =  request.getSession();
		MemberVo memVo = (MemberVo)session.getAttribute("memVo");
		boardVo.setBd_creator(memVo.getMem_id());
		int resultCnt = boardService.createBoard(boardVo);
		response.sendRedirect("/main");
	}

	/**
	 * 게시판 이름 / 사용여부 수정
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void locationBoardEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String bdNo		= request.getParameter("bdNo");
		String bdName 	= request.getParameter("bdName");
		String stUse 	= request.getParameter("stUse");
		BoardVo boardVo = boardService.selectBoard(bdNo);
		boardVo.setBd_name(bdName);
		boardVo.setBd_use(stUse);
		HttpSession session =  request.getSession();
		MemberVo memVo = (MemberVo)session.getAttribute("memVo");
		boardVo.setBd_creator(memVo.getMem_id());
		int resultCnt = boardService.editBoard(boardVo);
		response.sendRedirect("/main");
	}
}
