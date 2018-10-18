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

	private String  NO;
	private String  POSTNO;
	private String  CONTENT;
	private String  WRITER;
	private Date	RDATE;

	public CommentsVo() {
	}

	public String getNO() {
		return NO;
	}

	public void setNO(String NO) {
		this.NO = NO;
	}

	public String getPOSTNO() {
		return POSTNO;
	}

	public void setPOSTNO(String POSTNO) {
		this.POSTNO = POSTNO;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
	}

	public String getWRITER() {
		return WRITER;
	}

	public void setWRITER(String WRITER) {
		this.WRITER = WRITER;
	}

	public Date getRDATE() {
		return RDATE;
	}

	public void setRDATE(Date RDATE) {
		this.RDATE = RDATE;
	}
}
