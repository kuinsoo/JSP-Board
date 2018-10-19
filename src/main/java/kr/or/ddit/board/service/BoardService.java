package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.BoardDaoInf;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc : 게시판 서비스
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-19 / 오후 7:04
 * @Version :
 */
public class BoardService {
	private static BoardService boardService = null;
	private BoardDaoInf dao = BoardDao.getInstance();

	public static BoardService getInstance() {
		if(boardService == null) {
			boardService = new BoardService();
		}
		return boardService;
	}



}
