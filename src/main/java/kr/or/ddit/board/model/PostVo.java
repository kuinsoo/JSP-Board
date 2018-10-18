package kr.or.ddit.board.model;

import java.util.Date;

/**
 * kr.or.ddit.board.model
 * null.java
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 4:03
 * @Version :
 */
public class PostVo {

	private String post_no;
	private String post_title;
	private String post_content;
	private Date   post_rdate;
	private String post_writer;
	private String post_boardno;
	private String post_recursion;
	private String post_groupno;

	public PostVo() {
	}

	public String getPost_no() {
		return post_no;
	}

	public void setPost_no(String post_no) {
		this.post_no = post_no;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public Date getPost_rdate() {
		return post_rdate;
	}

	public void setPost_rdate(Date post_rdate) {
		this.post_rdate = post_rdate;
	}

	public String getPost_writer() {
		return post_writer;
	}

	public void setPost_writer(String post_writer) {
		this.post_writer = post_writer;
	}

	public String getPost_boardno() {
		return post_boardno;
	}

	public void setPost_boardno(String post_boardno) {
		this.post_boardno = post_boardno;
	}

	public String getPost_recursion() {
		return post_recursion;
	}

	public void setPost_recursion(String post_recursion) {
		this.post_recursion = post_recursion;
	}

	public String getPost_groupno() {
		return post_groupno;
	}

	public void setPost_groupno(String post_groupno) {
		this.post_groupno = post_groupno;
	}
}
