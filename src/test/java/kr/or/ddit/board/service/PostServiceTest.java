package kr.or.ddit.board.service;

import kr.or.ddit.board.dao.PostDao;
import kr.or.ddit.board.dao.PostDaoInf;
import kr.or.ddit.board.model.PostVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * kr.or.ddit.board.service
 * null.java
 * Desc : 게시글 서비스 테스트
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-21 / 오후 12:18
 * @Version :
 */
public class PostServiceTest {

	private PostServiceInf postService;

	@Before
	public void before() {
		postService = new PostService();
	}

	/**
	 * 게시글 출력 테스트
	 */
	@Test
	public void selectPostTest() {
		/*** Given ***/
		String post_no = "PT13";
		/*** When ***/
		PostVo postVo = postService.selectPost("PT13");
		/*** Then ***/
		Assert.assertEquals("BD1", postVo.getPost_boardno());
	}

	/**
	 * 전체 게시글 출력 테스트
	 */
	@Test
	public void selectAllPostTest() {
		/*** Given ***/

		/*** When ***/
		List<PostVo> postVoList = postService.selectAllPost();
		/*** Then ***/
		Assert.assertEquals(1, postVoList.size());
	}

	/**
	 * 게시글 생성 테스트
	 */
	@Test
	public void createPostTest() {
		/*** Given ***/
		PostVo postVo = new PostVo();
		postVo.setPost_no		("test1");
		postVo.setPost_title	("testService");
		postVo.setPost_content	("test1");
		postVo.setPost_rdate	(new Date());
		postVo.setPost_writer	("1");
		postVo.setPost_boardno	("BD1");
		postVo.setPost_recursion("");
		postVo.setPost_groupno	("test1");
		postVo.setPost_sub		("test1");
		/*** When ***/
		int resultCnt = postService.createPost(postVo);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 게시글 수정 테스트
	 */
	@Test
	public void editPostTest() {
		/*** Given ***/
		PostVo postVo = new PostVo();
		postVo.setPost_title	("test EditPost");
		postVo.setPost_content	("testService");
		postVo.setPost_rdate	(new Date());
		postVo.setPost_writer	("1");
		postVo.setPost_boardno	("BD1");
		postVo.setPost_recursion("");
		postVo.setPost_groupno	("test1");
		postVo.setPost_sub		("test1");
		/*** When ***/
		int resultCnt = postService.createPost(postVo);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 게시글 삭제 테스트
	 */
	@Test
	public void deletePostTest() {
		/*** Given ***/
		String post_no = "test1";
		/*** When ***/
		int resultCnt = postService.deletePost(post_no);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}
}
