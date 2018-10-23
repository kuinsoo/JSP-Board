package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.AttDao;
import kr.or.ddit.board.dao.AttDaoInf;
import kr.or.ddit.board.model.AttachmentVo;

import java.util.List;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc : 첨부파일 서비스
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-23 / 오전 12:40
 * @Version :
 */
public class AttService implements AttServiceInf{
	private static AttService attService;
	private AttDaoInf dao = new AttDao();

	public static AttService getInstance() {
		if ( attService == null )
			attService = new AttService();
		return attService;
	}

	@Override
	public List<AttachmentVo> selectAttachment(String attNo) {
		return dao.selectAttachment(attNo);
	}

	@Override
	public int insertAttachment(AttachmentVo attVo) {
		return dao.insertAttachment(attVo);
	}

	@Override
	public int updateAttachment(AttachmentVo attVo) {
		return dao.updateAttachment(attVo);
	}

	@Override
	public int deleteAttachment(String attNo) {
		return dao.deleteAttachment(attNo);
	}
}
