package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.PostDao;
import kr.or.ddit.board.dao.PostDaoInf;
import kr.or.ddit.board.model.BoardVo;
import kr.or.ddit.board.model.PostVo;

import java.util.List;
import java.util.Map;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc : 게시글 서비스
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-21 / 오전 11:55
 * @Version :
 */
public class PostService implements PostServiceInf {
	private static PostService postService;
	private PostDaoInf dao = PostDao.getInstance();

	public static PostService getInstance() {
		if(postService == null)
			postService = new PostService();
		return postService;
	}

	@Override
	public PostVo selectPost(String post_no) {
		return dao.selectPost(post_no);
	}

	@Override
	public List<PostVo> selectAllPost(String bd_no) {
		return dao.selectAllPost(bd_no);
	}

	@Override
	public int createPost(PostVo postVo) {
		return dao.createPost(postVo);
	}

	@Override
	public int editPost(PostVo postVo) {
		return dao.editPost(postVo);
	}

	@Override
	public int deletePost(String post_no) {
		return dao.deletePost(post_no);
	}

	@Override
	public List<PostVo> selectBoardInPost(Map<String,String> postMap) {
		return dao.selectBoardInPost(postMap);
	}

	@Override
	public int createRePost(PostVo postVo) {
		return dao.createRePost(postVo);
	}
}
