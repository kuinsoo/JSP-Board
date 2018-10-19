package kr.or.ddit.member.encrypt;

import org.junit.Assert;
import org.junit.Test;

/**
 * kr.or.ddit.member.encrypt
 * null.java
 * Desc : 암호화 테스트
 *
 * @Author : kku
 * @Date : 2018-10-19 / 오후 11:40
 * @Version :
 */
public class Sha256Test {

	@Test
	public void encryptTest() {
		String encrypt = Sha256.encrypt("1");

		Assert.assertEquals("6B86B273FF34FCE19D6B804EFF5A3F5747ADA4EAA22F1D49C01E52DDB7875B4B",
				encrypt.toUpperCase());
	}

}
