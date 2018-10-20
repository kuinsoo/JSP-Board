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

	@Test
	public void createBoard() {
		/*** Given ***/

		/*** When ***/
		BoardVo boardVo = new BoardVo();
		boardVo.setBd_name("자유게시판");
		boardVo.setBd_use("Y");
		boardVo.setBd_creator("brown");

		int resultCnt = dao.createBoard(boardVo);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);


	}

	@Test
	public void editBoard() {

	}

	@Test
	public void deleteBoard() {
		/*** Given ***/

		/*** When ***/
		String boardName = "자유게시판"; // PK ID 는 시퀀스를 이용해 변하기 때문에 TEST시에는 이름이용
		int resultCnt = dao.deleteBoard(boardName);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}


}
