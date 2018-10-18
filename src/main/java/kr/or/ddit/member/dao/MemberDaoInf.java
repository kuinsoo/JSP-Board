package kr.or.ddit.member.dao;

import kr.or.ddit.member.model.MemberVo;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 게시판 다오 인터페이스
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 6:25
 * @Version :
 */
public interface MemberDaoInf {

	/**
	 * 전체 회원 리스트 검색
	 * @return
	 */
	public List<MemberVo> selectAllMember();


	/**
	 * 회원 한명 검색
	 * @return
	 */
	public MemberVo selectMember(String mem_id);

}
