package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.model.PostVo;
import kr.or.ddit.db.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Map;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 게시글 다오
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-21 / 오전 11:54
 * @Version :
 */
public class PostDao implements PostDaoInf{
	private static PostDao postDao;
	private SqlSessionFactory factory = SqlSessionFactoryBean.sessionFactory;

	/**
	 * Gets instance.
	 *
	 * @return the instance
	 */
	public static PostDao getInstance() {
		if(postDao == null )
			postDao = new PostDao();
		return postDao;
	}

	/**
	 * 게시글 검색
	 * @return
	 */
	@Override
	public PostVo selectPost(String post_no) {
		SqlSession session = factory.openSession();
		PostVo postVo = session.selectOne("post.selectPost",post_no);
		session.close();
		return postVo;
	}

	/**
	 * 전체 게시글 검색
	 * @return
	 */
	@Override
	public List<PostVo> selectAllPost(String bd_no) {
		SqlSession session = factory.openSession();
		List<PostVo> postList = session.selectList("post.selectAllPost",bd_no);
		session.close();
		return  postList;
	}

	/**
	 * 게시판 안 전체 게시글 검색
	 * @return
	 */
	@Override
	public List<PostVo> selectBoardInPost(Map<String,String> postMap) {
		SqlSession session = factory.openSession();
		List<PostVo> postList = session.selectList("post.selectBoardInPost",postMap);
		session.close();
		return  postList;
	}

	/**
	 * 게시글 생성
	 * @param postVo
	 * @return
	 */
	@Override
	public int createPost(PostVo postVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("post.createPost",postVo);
		session.commit();
		session.close();
		return  resultCnt;
	}

	/**
	 * 게시글 수정
	 * @param postVo
	 * @return
	 */
	@Override
	public int editPost(PostVo postVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.update("post.editPost",postVo);
		session.commit();
		session.close();
		return  resultCnt;
	}

	/**
	 * 게시글 삭제
	 * @param post_no
	 * @return
	 */
	@Override
	public int deletePost(String post_no) {
		SqlSession session = factory.openSession();
		int resultCnt = session.delete("post.deletePost",post_no);
		session.commit();
		session.close();
		return  resultCnt;
	}

	/**
	 * 게시 답글 생성
	 * @param postVo
	 * @return
	 */
	@Override
	public int createRePost(PostVo postVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("post.createRePost",postVo);
		session.commit();
		session.close();
		return  resultCnt;
	}
}
