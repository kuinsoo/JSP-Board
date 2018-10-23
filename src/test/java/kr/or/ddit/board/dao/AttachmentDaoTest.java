package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.AttachmentVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 첨부파일 테스트
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-23 / 오전 9:24
 * @Version :
 */
public class AttachmentDaoTest {

	AttDaoInf attDao;

	@Before
	public void  before() {
		attDao = new AttDao();
	}

	/**
	 * 첨부파일 리스트 출력 테스트.
	 */
	@Test
	public void selectAttachmentTest() {
		/*** Given ***/

		/*** When ***/
		String attNo = "1";
		List<AttachmentVo> attList = attDao.selectAttachment(attNo);
		/*** Then ***/
		Assert.assertEquals(0, attList.size());
	}

	/**
	 * 첨부파일 삽입 테스트
	 */
	@Test
	public void insertAttachmentTest() {
		/*** Given ***/
		AttachmentVo attVo = new AttachmentVo();
		/*** When ***/
		attVo.setAtt_postno("62");
		attVo.setAtt_att("");
		int resultCnt = attDao.insertAttachment(attVo);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 첨부파일 수정 테스트
	 */
	@Test
	public void updateAttachmentTest() {
		/*** Given ***/
		AttachmentVo attVo = new AttachmentVo();
		/*** When ***/
		attVo.setAtt_no("8");
		attVo.setAtt_postno("60");
		attVo.setAtt_att("");
		int resultCnt = attDao.updateAttachment(attVo);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 첨부파일 삭제 테스트 .
	 */
	@Test
	public void deleteAttachmentTest() {
		/*** Given ***/

		/*** When ***/
		String attNo = "8";
		List<AttachmentVo> attList = attDao.selectAttachment(attNo);
		/*** Then ***/
		Assert.assertEquals(0, attList.size());
	}
}
