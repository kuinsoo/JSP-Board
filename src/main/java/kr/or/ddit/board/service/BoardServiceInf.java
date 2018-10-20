package kr.or.ddit.board.service;

import kr.or.ddit.board.model.BoardVo;

import java.util.List;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc : 게시판 서비스 인터페이스
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-19 / 오후 7:05
 * @Version :
 */
public interface BoardServiceInf {


	/**
	 * 전체 게시판 조회
	 * @return
	 */
	List<BoardVo> selectAllBoard();

	/**
	 * 게시판 생성
	 * @param boardVo
	 * @return
	 */
	int createBoard(BoardVo boardVo);

	/**
	 * 게시판 수정
	 * @param boardVo
	 * @return
	 */
	int editBoard(BoardVo boardVo);

	/**
	 * 게시판 삭제 ( Create Board 후 삭제 작업을 위해 만들어진 메서드 )
	 * @param boardId
	 * @return
	 */
	int deleteBoard(String boardId);
}
