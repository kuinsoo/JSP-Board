package kr.or.ddit.board.dao;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 게시판 다오
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 6:25
 * @Version :
 */
public class BoardDao implements BoardDaoInf {
	private static BoardDao boardDao = null;

	public static BoardDao getInstance() {
		if(boardDao==null){
			boardDao = new BoardDao();
		}
		return boardDao;
	}



}
