package kr.or.ddit.member.service;

import kr.or.ddit.member.dao.MemberDao;
import kr.or.ddit.member.dao.MemberDaoInf;
import kr.or.ddit.member.model.MemberVo;

import java.util.List;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc : 게시판 서비스
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 6:24
 * @Version :
 */
public class MemberService implements MemberServiceInf {
	public static MemberService memberService;
	// Singleton 적용
	public static MemberService getInstance() {
		if( memberService == null ) {
			memberService = new MemberService();
		}
		return memberService;
	}


	MemberDaoInf dao = MemberDao.getInstance();

	/**
	 * 전체 회원 리스트 검색
	 * @return
	 */
	@Override
	public List<MemberVo> selectAllMember() {
		return dao.selectAllMember();
	}

	/**
	 * 회원 하나 검색
	 * @return
	 */
	@Override
	public MemberVo selectMember(String mem_id) {
		return dao.selectMember(mem_id);
	}
}
