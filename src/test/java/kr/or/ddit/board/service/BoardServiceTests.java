package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-19 / 오후 7:37
 * @Version :
 */
public class BoardServiceTests {

	private BoardServiceInf service;

	@Before
	public void before() {
		service = new BoardService();
	}

	@Test
	public void selectAllBoardTest() {

		List<BoardVo> boardList = service.selectAllBoard();

		Assert.assertEquals(1,boardList.size());
	}
}
