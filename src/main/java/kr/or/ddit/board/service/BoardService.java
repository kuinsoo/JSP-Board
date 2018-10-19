package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;

import java.util.List;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc : 게시판 서비스
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-19 / 오후 7:04
 * @Version :
 */
public class BoardService implements  BoardServiceInf{
	private static BoardService boardService = null;
	private BoardDaoInf dao = BoardDao.getInstance();

	public static BoardService getInstance() {
		if(boardService == null) {
			boardService = new BoardService();
		}
		return boardService;
	}


	/**
	 * 전체 게시판 조회
	 * @return
	 */
	@Override
	public List<BoardVo> selectAllBoard() {
		return dao.selectAllBoard();
	}

	/**
	 * 게시판 생성
	 * @param boardVo
	 * @return
	 */
	@Override
	public int createBoard(BoardVo boardVo) {
		return dao.createBoard(boardVo);
	}

	/**
	 * 게시판 수정
	 * @param boardVo
	 * @return
	 */
	@Override
	public int editBoard(BoardVo boardVo) {
		return dao.editBoard(boardVo);
	}
}
