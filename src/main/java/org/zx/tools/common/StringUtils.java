package org.zx.tools.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils extends org.apache.commons.lang3.StringUtils {
	//首字母转小写
	public static String toLowerCaseFirstOne(String s){
		if(Character.isLowerCase(s.charAt(0)))
			return s;
		else
			return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
	}


	//首字母转大写
	public static String toUpperCaseFirstOne(String s){
		if(Character.isUpperCase(s.charAt(0)))
			return s;
		else
			return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
	}
	//生成19随机单号 纯数字
	public static String getOrderNo(){
		String orderNo = "" ;
		String trandNo = String.valueOf((Math.random() * 9 + 1) * 1000000);
		String sdf = new SimpleDateFormat("yyyyMMddHHMMSS").format(new Date());
		orderNo = trandNo.toString().substring(0, 4); orderNo = orderNo + sdf ; return orderNo ;
	}

}
