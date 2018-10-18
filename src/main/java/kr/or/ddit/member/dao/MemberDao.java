package kr.or.ddit.member.dao;

import kr.or.ddit.db.SqlSessionFactoryBean;
import kr.or.ddit.member.model.MemberVo;
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
public class MemberDao implements MemberDaoInf {
	static MemberDao boardDao;
	private SqlSessionFactory factory = SqlSessionFactoryBean.sessionFactory;

	// Singleton 적용
	public static MemberDao getInstance() {
		if( boardDao == null ) {
			boardDao = new MemberDao();
		}
		return boardDao;
	}



	/**
	 * 전체 회원 리스트 검색
	 * @return
	 */
	@Override
	public List<MemberVo> selectAllMember() {
		SqlSession session = factory.openSession();
		List<MemberVo> memList = session.selectList("member.selectAllMember");
		//오픈한 세션을 닫아 준다.
		session.close();
		return memList;
	}

	/**
	 * 회원 하나 검색
	 * @return
	 */
	@Override
	public MemberVo selectMember(String mem_id) {
		SqlSession session = factory.openSession();
		MemberVo memVo = session.selectOne("member.selectMember",mem_id);
		session.close();
		return memVo;
	}
}
