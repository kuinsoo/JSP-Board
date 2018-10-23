package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.AttachmentVo;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 첨부파일 다오 인터페이스
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-23 / 오전 12:42
 * @Version :
 */
public interface AttDaoInf {

	/**
	 * 첨부파일 리스트 검색
	 * @param attNo
	 * @return
	 */
	List<AttachmentVo> selectAttachment(String attNo);

	/**
	 * 첨부파일 등록
	 * @param attVo
	 * @return
	 */
	int insertAttachment(AttachmentVo attVo);

	/**
	 * 첨부파일 수정
	 * @param attVo
	 * @return
	 */
	int updateAttachment(AttachmentVo attVo);

	/**
	 * 첨부파일 삭제
	 * @param attNo
	 * @return
	 */
	int deleteAttachment(String attNo);
}
