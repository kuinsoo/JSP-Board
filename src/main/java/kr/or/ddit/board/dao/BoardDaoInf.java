package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.member.model.MemberVo;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 게시판 다오 인터페이스
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 6:25
 * @Version :
 */
public interface BoardDaoInf {

	/**
	 * 전체 게시판 조회
	 * @return
	 */
	public List<BoardVo> selectAllBoard();

}
