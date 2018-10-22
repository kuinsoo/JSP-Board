package kr.or.ddit.board.dao;

import kr.or.ddit.board.model.PostVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * kr.or.ddit.board.dao
 * null.java
 * Desc : 게시글 다오 테스트
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-21 / 오후 12:18
 * @Version :
 */
public class PostDaoTest {

	private PostDaoInf postDao;

	@Before
	public void before() {
		postDao = new PostDao();
	}

	/**
	 * 게시글 출력 테스트
	 */
	@Test
	public void selectPostTest() {
		/*** Given ***/
		String post_no = "PT13";
		/*** When ***/
		PostVo postVo = postDao.selectPost("PT13");
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
		List<PostVo> postVoList = postDao.selectAllPost();
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
		postVo.setPost_title	("test1");
		postVo.setPost_content	("<p> test</p>");
		postVo.setPost_writer	("1");
		postVo.setPost_boardno	("BD1");
		postVo.setPost_recursion("");
		/*** When ***/
		int resultCnt = postDao.createPost(postVo);
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
		postVo.setPost_content	("test1");
		postVo.setPost_rdate	(new Date());
		postVo.setPost_writer	("1");
		postVo.setPost_boardno	("BD1");
		postVo.setPost_recursion("");
		postVo.setPost_groupno	("test1");
		postVo.setPost_sub		("test1");
		/*** When ***/
		int resultCnt = postDao.createPost(postVo);
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
		int resultCnt = postDao.deletePost(post_no);
		/*** Then ***/
		Assert.assertEquals(1, resultCnt);
	}

	/**
	 * 게시판 안에 전체 게시글  검색
	 */
	@Test
	public void selectBoardInPostTest() {
		/*** Given ***/

		/*** When ***/
		Map<String, String> postMap = new HashMap<>();
		postMap.put("post_groupno", "BD1");
		postMap.put("page", "1");
		postMap.put("pageSize", "11");

		List<PostVo> postList = postDao.selectBoardInPost(postMap);
		/*** Then ***/
		Assert.assertEquals(15, postList.size());
	}

}
