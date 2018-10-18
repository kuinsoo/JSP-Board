package kr.or.ddit.board.model;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Date;

/**
 * kr.or.ddit.board.model
 * null.java
 * Desc : 회원 정보
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 3:54
 * @Version :
 */
public class MemberVo {

	private String ID;
	private String NAME;
	private String PASS;
	private String TEL;
	private Date   BIRTH;
	private String EMAIL;
	private String ZIPCODE;
	private String ADDR1;
	private String ADDR2;
	private String PROFILE;


	public MemberVo() {
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getPASS() {
		return PASS;
	}

	public void setPASS(String PASS) {
		this.PASS = PASS;
	}

	public String getTEL() {
		return TEL;
	}

	public void setTEL(String TEL) {
		this.TEL = TEL;
	}

	public Date getBIRTH() {
		return BIRTH;
	}

	public void setBIRTH(Date BIRTH) {
		this.BIRTH = BIRTH;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	public String getZIPCODE() {
		return ZIPCODE;
	}

	public void setZIPCODE(String ZIPCODE) {
		this.ZIPCODE = ZIPCODE;
	}

	public String getADDR1() {
		return ADDR1;
	}

	public void setADDR1(String ADDR1) {
		this.ADDR1 = ADDR1;
	}

	public String getADDR2() {
		return ADDR2;
	}

	public void setADDR2(String ADDR2) {
		this.ADDR2 = ADDR2;
	}

	public String getPROFILE() {
		return PROFILE;
	}

	public void setPROFILE(String PROFILE) {
		this.PROFILE = PROFILE;
	}
}
