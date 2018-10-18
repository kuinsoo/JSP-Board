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

	private String NO;
	private String TITLE;
	private String CONTENT;
	private Date   RDATE;
	private String WRITER;
	private String BOARDNO;
	private String RECURSION;
	private String GROUPNO;

	public PostVo() {
	}

	public String getNO() {
		return NO;
	}

	public void setNO(String NO) {
		this.NO = NO;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
	}

	public Date getRDATE() {
		return RDATE;
	}

	public void setRDATE(Date RDATE) {
		this.RDATE = RDATE;
	}

	public String getWRITER() {
		return WRITER;
	}

	public void setWRITER(String WRITER) {
		this.WRITER = WRITER;
	}

	public String getBOARDNO() {
		return BOARDNO;
	}

	public void setBOARDNO(String BOARDNO) {
		this.BOARDNO = BOARDNO;
	}

	public String getRECURSION() {
		return RECURSION;
	}

	public void setRECURSION(String RECURSION) {
		this.RECURSION = RECURSION;
	}

	public String getGROUPNO() {
		return GROUPNO;
	}

	public void setGROUPNO(String GROUPNO) {
		this.GROUPNO = GROUPNO;
	}
}
