package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.BoardDaoInf;
import kr.or.ddit.board.model.BoardVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
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

	private BoardServiceInf boardService;

	@Before
	public void before() {
		boardService = new BoardService();
	}

	/**
	 * 게시판 전체 검색
	 */
	@Test
	public void selectAllBoardTest() {

		List<BoardVo> boardList = boardService.selectAllBoard();

		Assert.assertEquals(1,boardList.size());
	}

	/**
	 * 게시판 생성
	 */
	@Test
	public void createBoardTest() {
		/*** Given ***/

		/*** When ***/
		BoardVo boardVo = new BoardVo();
		boardVo.setBd_name("자유게시판Service");
		boardVo.setBd_use("Y");
		boardVo.setBd_creator("brown");

		int resultCnt = boardService.createBoard(boardVo);
		/*** Then ***/
		Assert.assertEquals(2, resultCnt);

		deleteBoardTest();

	}

	/**
	 * 게시판 수정 테스트
	 */
	@Test
	public void editBoardTest() {
		/*** Given ***/

		/*** When ***/
		BoardVo boardVo = new BoardVo();
		boardVo.setBd_no("BD8");
		boardVo.setBd_name("자유게시판Service");
		boardVo.setBd_use("Y");
		boardVo.setBd_creator("1");
		boardVo.setBd_rdate(new Date());
		int resultCnt = boardService.editBoard(boardVo);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 게시판 삭제
	 */
	@Test
	public void deleteBoardTest() {
		/*** Given ***/

		/*** When ***/
		String boardName = "자유게시판"; // PK ID 는 시퀀스를 이용해 변하기 때문에 TEST시에는 이름이용
		int resultCnt = boardService.deleteBoard(boardName);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 게시판 검색
	 */
	@Test
	public void selectBoardTest() {
		/*** Given ***/

		/*** When ***/
		String bdNo = "BD8";
		BoardVo boardVo = boardService.selectBoard(bdNo);
		/*** Then ***/
		Assert.assertEquals("자유게시판service", boardVo.getBd_name());
	}
}
