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

	private String att_no;
	private String att_postno;
	private String att_att;

	public AttachmentVo() {
	}

	public String getAtt_no() {
		return att_no;
	}

	public void setAtt_no(String att_no) {
		this.att_no = att_no;
	}

	public String getAtt_postno() {
		return att_postno;
	}

	public void setAtt_postno(String att_postno) {
		this.att_postno = att_postno;
	}

	public String getAtt_att() {
		return att_att;
	}

	public void setAtt_att(String att_att) {
		this.att_att = att_att;
	}
}
