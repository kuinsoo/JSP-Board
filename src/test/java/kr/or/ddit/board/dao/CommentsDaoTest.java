package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.CommentsVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 댓글 다오 테스
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-23 / 오전 9:24
 * @Version :
 */
public class CommentsDaoTest {
	CommentsDaoInf dao;

	@Before
	public void before() {
		dao = new CommentsDao();
	}

	/**
	 * 댓글 검색
	 */
	@Test
	public void selectCmtTest() {
		/*** Given ***/

		/*** When ***/
		String postNo = "60";
		List<CommentsVo> cmtList = dao.selectCmt(postNo);
		/*** Then ***/
		Assert.assertEquals(1, 4);
	}


	/**
	 * 댓글 삽입
	 */
	@Test
	public void insertCmtTest() {
		/*** Given ***/
		CommentsVo cmtVo = new CommentsVo();
		/*** When ***/
		cmtVo.setCmt_postno("62");
		cmtVo.setCmt_content("무플방지 위!원");
		cmtVo.setCmt_writer("1");
		int resultCnt = dao.insertCmt(cmtVo);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 댓글 수정
	 */
	@Test
	public void updateCmtTest() {
		/*** Given ***/
		CommentsVo cmtVo = new CommentsVo();
		/*** When ***/
		cmtVo.setCmt_postno("62");
		cmtVo.setCmt_content("무플방지 위원회!");
		cmtVo.setCmt_writer("brown");
		int resultCnt = dao.insertCmt(cmtVo);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 댓글 삭제
	 */
	@Test
	public void deleteCmtTest() {
		/*** Given ***/

		/*** When ***/
		String no = "3";
		int resultCnt = dao.deleteCmt(no);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}
}
