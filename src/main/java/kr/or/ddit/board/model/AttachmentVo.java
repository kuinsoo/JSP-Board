package kr.or.ddit.board.model;

/**
 * kr.or.ddit.board.model
 * null.java
 * Desc : 첨부파일
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 3:58
 * @Version :
 */
public class AttachmentVo {

	private String NO;
	private String POSTNO;
	private String ATT;

	public AttachmentVo() {
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

	public String getATT() {
		return ATT;
	}

	public void setATT(String ATT) {
		this.ATT = ATT;
	}
}
