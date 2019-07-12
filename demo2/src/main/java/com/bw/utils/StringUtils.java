/**
 * 
 */
package com.bw.utils;

import java.util.Random;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月12日
 */
public class StringUtils {
	
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 
	public static boolean hasValue(String src){
		return src != null && src.length()>0;
	}
	
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public static boolean hasContent(String src){
		return src != null && src.trim().length()>0; 
	} 
	
	//方法3：判断是否为手机号码 
	public static boolean isPhone(String phone) {
		String reg = "^[1][3,5,7,8]\\d{9}$";
		return phone.matches(reg);
	}
	
	//方法4：判断是否为邮箱 
	public static boolean isEmail(String email) {
		String reg = "^\\w+@{1}\\w+\\.{1}\\w+$";
		return email.matches(reg);
		
	}
	
	//方法5：判断是否全部为字母
	public static boolean isLetter(String letter) {
		String reg = "^[a-zA-Z]+$";
		return letter.matches(reg.trim());
	}
	
	//方法6：获取n位随机英文字符串
	public static String getRandom(Integer n) {
		
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		String src = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		for(int i=0;i<n;i++){
			sb.append(src.charAt(random.nextInt(src.length())));
		}
		return sb.toString();
	}
	
	//方法7：获取n位随机英文字符串和数字字符串
	public static String getNumRandom(Integer n) {
		
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		String src = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		
		for(int i=0;i<n;i++){
			sb.append(src.charAt(random.nextInt(src.length())));
		}
		
		return sb.toString();
	}
	
	//方法8：获取n位随机中文字符串
	public static String getChinese(Integer n) {
		
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		String[] src = {"赵","钱","孙","丽","州","武","征","王","风","陈","初","为","将","神","含","杨"};
		
		for(int i=0;i<n;i++){
			sb.append(src[r.nextInt(src.length)]);
		}
		
		return sb.toString();
	}
	
	//方法9：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba”
	public static String letterReverse(String src) {
		StringBuffer sb = new StringBuffer(src);
		return sb.reverse().toString();
	}
	
	//大写字母转化成小写字母，并且空格换成“-” ，例如："SpRIng MvC"  转换成  "spring-mvc"
	public static String changeLetter(String src) {
		src = src.toLowerCase();
		src = src.replaceAll(" ", "-");
		return src;
	}
}
