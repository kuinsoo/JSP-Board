package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.db.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

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
	private SqlSessionFactory factory = SqlSessionFactoryBean.sessionFactory;

	public static BoardDao getInstance() {
		if(boardDao==null){
			boardDao = new BoardDao();
		}
		return boardDao;
	}

	/**
	 * 게시판 전체 조회
	 * @return
	 */
	@Override
	public List<BoardVo> selectAllBoard() {
		SqlSession session = factory.openSession();
		List<BoardVo> boardList = session.selectList("board.selectAllBoard");
		session.close();
		return boardList;
	}

	/**
	 * 게시판 한개 조회
	 * @param boardId
	 * @return
	 */
	@Override
	public BoardVo selectBoard(String boardId) {
		SqlSession session = factory.openSession();
		BoardVo boardVo = session.selectOne("board.selectBoard",boardId);
		session.close();
		return boardVo;
	}

	/**
	 * 게시판 생성
	 * @param boardVo
	 * @return
	 */
	@Override
	public int createBoard(BoardVo boardVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("board.createBoard",boardVo);
		session.commit();
		session.close();
		return resultCnt;
	}

	/**
	 * 게시판 수정
	 * @param boardVo
	 * @return
	 */
	@Override
	public int editBoard(BoardVo boardVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.update("board.editBoard",boardVo);
		session.commit();
		session.close();
		return resultCnt;
	}

	/**
	 * 게시판 삭제 ( Create Board 후 삭제 작업을 위해 만들어진 메서드 )
	 * @param boardId
	 * @return
	 */
	@Override
	public int deleteBoard(String boardId) {
		SqlSession session = factory.openSession();
		int resultCnt = session.delete("board.deleteBoard",boardId);
		session.commit();
		session.close();
		return resultCnt;
	}
}
