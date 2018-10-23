package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.CommentsVo;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 댓글 다오 인터페이스
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-23 / 오전 12:43
 * @Version :
 */
public interface CommentsDaoInf {

	/**
	 * 댓글 리스트 검색
	 * @param postNo
	 * @return
	 */
	List<CommentsVo> selectCmtList(String postNo);

	/**
	 * 댓글 검색
	 * @param postNo
	 * @return
	 */
	CommentsVo selectCmt(String postNo);

	/**
	 * 댓글 삽입
	 * @param cmtVo
	 * @return
	 */
	int insertCmt(CommentsVo cmtVo);

	/**
	 * 댓글 수정
	 * @param cmtVo
	 * @return
	 */
	int updateCmt(CommentsVo cmtVo);

	/**
	 * 댓글 삭제
	 * @param postNo
	 * @return
	 */
	int deleteCmt(String postNo);
}
