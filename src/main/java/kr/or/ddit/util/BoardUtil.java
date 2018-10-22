package kr.or.ddit.util;

import javax.servlet.http.Part;
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

	public static String getFileNameFromHeader(String contentDisposition) {
		String fileName = "";
		String[] splits = contentDisposition.split("; ");
		for (String string : splits) {
			if (string.indexOf("filename=") >= 0) {
				fileName = string.substring(10, string.lastIndexOf("\""));
			}
		}//for
		return fileName;
	}


	public static String getCookie(String cookingString, String value) {
		String[] strValue = new String[2];
		String[] splits = cookingString.split("; ");
		for (String str : splits) {
			strValue = str.split("=");
			if (strValue[0].equals(value)) {
				return strValue[1];
			}
		}
		return "";
	}

}
