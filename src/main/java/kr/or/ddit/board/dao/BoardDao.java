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
	public SqlSessionFactory factory = SqlSessionFactoryBean.sessionFactory;

	public static BoardDao getInstance() {
		if(boardDao==null){
			boardDao = new BoardDao();
		}
		return boardDao;
	}

	@Override
	public List<BoardVo> selectAllBoard() {
		SqlSession session = factory.openSession();
		List<BoardVo> boardList = session.selectOne("board.selectAllBoard");
		session.close();
		return boardList;
	}
}
