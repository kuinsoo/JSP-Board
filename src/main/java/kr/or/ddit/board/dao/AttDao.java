package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.AttachmentVo;
import kr.or.ddit.db.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc :
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-23 / 오전 12:42
 * @Version :
 */
public class AttDao implements AttDaoInf {
	private static AttDao attDao;
	private SqlSessionFactory factory = SqlSessionFactoryBean.sessionFactory;

	public static AttDao getInstance() {
		if ( attDao == null )
			attDao = new AttDao();
		return  attDao;
	}

	/**
	 * 첨부파일 리스트 출력
	 * @param attNo
	 * @return
	 */
	@Override
	public List<AttachmentVo> selectAttachment(String attNo) {
		SqlSession session = factory.openSession();
		List<AttachmentVo> attList = session.selectList("att.selectAttachment",attNo);
		session.close();
		return attList;
	}

	/**
	 * 첨부파일 삽입
	 * @param attVo
	 * @return
	 */
	@Override
	public int insertAttachment(AttachmentVo attVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("att.insertAttachment", attVo);
		session.commit();
		session.close();
		return resultCnt;
	}

	/**
	 * 첨부파일 수정
	 * @param attVo
	 * @return
	 */
	@Override
	public int updateAttachment(AttachmentVo attVo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("att.updateAttachment", attVo);
		session.commit();
		session.close();
		return resultCnt;
	}

	/**
	 * 첨부파일 삭제
	 * @param attNo
	 * @return
	 */
	@Override
	public int deleteAttachment(String attNo) {
		SqlSession session = factory.openSession();
		int resultCnt = session.insert("att.deleteAttachment", attNo);
		session.commit();
		session.close();
		return resultCnt;
	}
}
