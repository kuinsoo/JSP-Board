package kr.or.ddit.board.model;

import java.util.Date;

/**
 * kr.or.ddit.board.model
 * null.java
 * Desc :
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 4:02
 * @Version :
 */
public class CommentsVo {

	private String  cmd_no;
	private String  cmd_postno;
	private String  cmd_content;
	private String  cmd_writer;
	private Date	cmd_rdate;

	public CommentsVo() {
	}

	public String getCmd_no() {
		return cmd_no;
	}

	public void setCmd_no(String cmd_no) {
		this.cmd_no = cmd_no;
	}

	public String getCmd_postno() {
		return cmd_postno;
	}

	public void setCmd_postno(String cmd_postno) {
		this.cmd_postno = cmd_postno;
	}

	public String getCmd_content() {
		return cmd_content;
	}

	public void setCmd_content(String cmd_content) {
		this.cmd_content = cmd_content;
	}

	public String getCmd_writer() {
		return cmd_writer;
	}

	public void setCmd_writer(String cmd_writer) {
		this.cmd_writer = cmd_writer;
	}

	public Date getCmd_rdate() {
		return cmd_rdate;
	}

	public void setCmd_rdate(Date cmd_rdate) {
		this.cmd_rdate = cmd_rdate;
	}
}
