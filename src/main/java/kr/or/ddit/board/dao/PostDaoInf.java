package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.PostVo;

import java.util.List;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 게시글 다오
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-21 / 오전 11:54
 * @Version :
 */
public interface PostDaoInf {

	/**
	 * 게시글 검색
	 * @return
	 */
	PostVo selectPost();

	/**
	 * 전체 게시글 검색
	 * @return
	 */
	List<PostVo> selectAllPost();

	/**
	 * 게시글 생성
	 * @param postVo
	 * @return
	 */
	int createPost(PostVo postVo);

	/**
	 * 게시글 수정
	 * @param postVo
	 * @return
	 */
	int editPost(PostVo postVo);

	/**
	 * 게시글 삭제
	 * @param post_no
	 * @return
	 */
	int deletePost(String post_no);
}
