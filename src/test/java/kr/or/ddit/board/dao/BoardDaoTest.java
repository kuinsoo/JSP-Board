package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.BoardVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-19 / 오후 7:37
 * @Version :
 */
public class BoardDaoTest {
	private BoardDaoInf dao;

	@Before
	public void before() {
		dao = new BoardDao();
	}

	@Test
	public void selectAllBoardTest() {

		List<BoardVo> boardList = dao.selectAllBoard();

		Assert.assertEquals(1,boardList.size());
	}


}
