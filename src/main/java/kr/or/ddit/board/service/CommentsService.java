package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.CommentsDao;
import kr.or.ddit.board.dao.CommentsDaoInf;
import kr.or.ddit.board.model.AttachmentVo;
import kr.or.ddit.board.model.CommentsVo;

import javax.xml.stream.events.Comment;
import java.util.List;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc :
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-23 / 오전 12:41
 * @Version :
 */
public class CommentsService implements CommentsServiceInf{
	static private CommentsService commentsService;
	private CommentsDaoInf  dao = new CommentsDao();

	static public CommentsService getInstance() {
		if(commentsService==null)
			commentsService= new CommentsService();
		return commentsService;
	}



	@Override
	public List<CommentsVo> selectCmt(String postNo) {
		return dao.selectCmt(postNo);
	}

	@Override
	public int insertCmt(CommentsVo cmtVo) {
		return dao.insertCmt(cmtVo);
	}

	@Override
	public int updateCmt(CommentsVo cmtVo) {
		return dao.updateCmt(cmtVo);
	}

	@Override
	public int deleteCmt(String postNo) {
		return dao.deleteCmt(postNo);
	}
}
