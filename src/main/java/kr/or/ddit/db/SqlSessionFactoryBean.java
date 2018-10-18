package kr.or.ddit.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * kr.or.ddit.board.kr.or.ddit.boar.db
 * null.java
 * Desc : 맵퍼 연결
 *
 * @Author : Mr.KKu
 * @Date : 2018-10-18 / 오후 6:43
 * @Version :
 */
public class SqlSessionFactoryBean {
	public static SqlSessionFactory sessionFactory;
	static {
		try{
			String resource = "kr/or/ddit/config/mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}catch (IOException e) {
			System.out.println("SqlSessionFactory ==> " + e );
		}
	}
}
