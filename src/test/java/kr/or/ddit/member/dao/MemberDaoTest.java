package kr.or.ddit.member.dao;



import kr.or.ddit.member.model.MemberVo;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * kr.or.ddit.member.dao
 * null.java
 * Desc : Member Dao Test
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 7:06
 * @Version :
 */
public class MemberDaoTest {

	private MemberDao dao = null;


	@Before
	public void before() {
		dao = MemberDao.getInstance();
	}

	@After
	public void after() {

	}

	/**
	 * 회원정보 전체 검색
	 */
	@Test
	public void selectAllMemberTest() {
		/*** Given ***/
		// 위에 선언된 dao를 사용한다.
		/*** When ***/
		List<MemberVo> memberList = dao.selectAllMember();
		/*** Then ***/
		Assert.assertEquals(105, memberList.size());
	}

	/**
	 * 회원 검색
	 */
	@Test
	public void selectMemberTest() {
		/*** Given ***/
		String mem_id = "sally";
		/*** When ***/
		MemberVo memVo = dao.selectMember(mem_id);
		/*** Then ***/
		Assert.assertEquals("셀리",memVo.getMem_name());
	}

}
