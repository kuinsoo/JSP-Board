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

	private String NO;
	private String NAME;
	private String USE;
	private String CREATOR;
	private Date   RDATE;

	public BoardVo() {
	}

	public String getNO() {
		return NO;
	}

	public void setNO(String NO) {
		this.NO = NO;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getUSE() {
		return USE;
	}

	public void setUSE(String USE) {
		this.USE = USE;
	}

	public String getCREATOR() {
		return CREATOR;
	}

	public void setCREATOR(String CREATOR) {
		this.CREATOR = CREATOR;
	}

	public Date getRDATE() {
		return RDATE;
	}

	public void setRDATE(Date RDATE) {
		this.RDATE = RDATE;
	}
}
