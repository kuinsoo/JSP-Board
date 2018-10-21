package kr.or.ddit.util;

import java.util.HashMap;
import java.util.Map;

/**
 * kr.or.ddit.util
 * null.java
 * Desc : Page Size Option Controller
 *
 * @Author : "Mr.KKu"
 * @Date : 2018-10-21 / 오후 6:50
 * @Version :
 */
public class BoardUtil {
	private static int page 		= 1;
	private static int pageSize 	= 10;

	public static Map<String, String> pageController() {
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("page", page+"");
		resultMap.put("pageSize", pageSize+"");
		return resultMap;
	}
}
