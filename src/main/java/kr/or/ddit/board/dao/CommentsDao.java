package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.CommentsVo;
import kr.or.ddit.db.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 댓글 다오
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-23 / 오전 12:43
 * @Version :
 */
public class CommentsDao implements CommentsDaoInf {
	private static CommentsDao commentsDao;
	private SqlSessionFactory factory = SqlSessionFactoryBean.sessionFactory;

	/**
	 * Get instance comments dao.
	 *
	 * @return the comments dao
	 */
	public static CommentsDao getInstance(){
		if( commentsDao == null )
			commentsDao = new CommentsDao();
		return commentsDao;
	}

	/**
	 * 댓글 리스트 검색
	 * @param postNo
	 * @return
	 */
	@Override
	public List<CommentsVo> selectCmt(String postNo) {
		SqlSession session = factory.openSession();
		List<CommentsVo> attList = session.selectList("cmt.selectCmt",postNo);
		session.close();
		return attList;
	}


	/**
	 * 댓글 생성
	 * @param cmtVo
	 * @return
	 */
	@Override
	public int insertCmt(CommentsVo cmtVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("cmt.insertCmt",cmtVo);
		session.commit();
		session.close();
		return resultCnt;
	}

	/**
	 * 댓글 수정
	 * @param cmtVo
	 * @return
	 */
	@Override
	public int updateCmt(CommentsVo cmtVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("cmt.updateCmt",cmtVo);
		session.commit();
		session.close();
		return resultCnt;
	}

	/**
	 * 댓글 삭제
	 * @param postNo
	 * @return
	 */
	@Override
	public int deleteCmt(String postNo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("cmt.deleteCmt",postNo);
		session.commit();
		session.close();
		return resultCnt;
	}
}
