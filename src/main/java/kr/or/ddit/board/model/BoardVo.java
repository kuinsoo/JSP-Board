package kr.or.ddit.board.model;

import java.util.Date;

/**
 * kr.or.ddit.board.model
 * null.java
 * Desc : 게시판
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 4:00
 * @Version :
 */
public class BoardVo {

	private String bd_no;
	private String bd_name;
	private String bd_use;
	private String bd_creator;
	private Date   bd_rdate;

	public BoardVo() {
	}

	public String getBd_no() {
		return bd_no;
	}

	public void setBd_no(String bd_no) {
		this.bd_no = bd_no;
	}

	public String getBd_name() {
		return bd_name;
	}

	public void setBd_name(String bd_name) {
		this.bd_name = bd_name;
	}

	public String getBd_use() {
		return bd_use;
	}

	public void setBd_use(String bd_use) {
		this.bd_use = bd_use;
	}

	public String getBd_creator() {
		return bd_creator;
	}

	public void setBd_creator(String bd_creator) {
		this.bd_creator = bd_creator;
	}

	public Date getBd_rdate() {
		return bd_rdate;
	}

	public void setBd_rdate(Date bd_rdate) {
		this.bd_rdate = bd_rdate;
	}
}
