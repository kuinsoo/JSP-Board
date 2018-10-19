package kr.or.ddit.member.service;

import kr.or.ddit.member.dao.MemberDao;
import kr.or.ddit.member.model.MemberVo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * kr.or.ddit.member.service
 * null.java
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 7:06
 * @Version :
 */
public class MemberServiceTest {
	private MemberServiceInf service = null;


	@Before
	public void before() {
		service = MemberService.getInstance();
	}

	@After
	public void after() {

	}

	@Test
	public void selectAllMemberTest() {
		/*** Given ***/
		// 위에 선언된 dao를 사용한다.
		/*** When ***/
		List<MemberVo> memberList = service.selectAllMember();
		/*** Then ***/
		Assert.assertEquals(105, memberList.size());
	}

	@Test
	public void selectMemberTest() {
		/*** Given ***/
		String mem_id = "sally";
		/*** When ***/
		MemberVo memVo = service.selectMember(mem_id);
		/*** Then ***/
		Assert.assertEquals("셀리", memVo.getMem_name());
	}
}
