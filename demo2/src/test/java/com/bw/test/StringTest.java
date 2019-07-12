/**
 * 
 */
package com.bw.test;

import org.junit.Test;

import com.bw.utils.StringUtils;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月12日
 */
public class StringTest {
	
	//空值校验
	@Test
	public void hasValueTest(){
		System.out.println(StringUtils.hasValue("张三   哈哈"));
		
	}
	
	//空值校验
	@Test
	public void hasContentTest(){
		System.out.println(StringUtils.hasContent(""));
		
	}
//	手机号校验
	@Test
	public void isPhoneTest(){
		System.out.println(StringUtils.isPhone("18360069810"));
		
	}
	
//	邮箱校验
	@Test
	public void isEmailTest(){
		System.out.println(StringUtils.isEmail("1686511765@qq.com"));
		
	}

	//字母校验
	@Test
	public void isLetterTest(){
		System.out.println(StringUtils.isLetter("dca2da"));
	}
	
	//随机字母
	@Test
	public void getRandomTest(){
		System.out.println(StringUtils.getRandom(4));
	}
	
	
	//随机字母数字
	@Test
	public void getNumRandomTest(){
		System.out.println(StringUtils.getNumRandom(4));
	}
	
	//随机汉字
	@Test
	public void getChineseTest(){
		System.out.println(StringUtils.getChinese(3));
	}
	
	//反转字符串
	@Test
	public void letterReverseTest(){
		System.out.println(StringUtils.letterReverse("fhjfcjb"));
	}
	
	//字符替换，全部小写
	@Test
	public void changeLetter(){
		System.out.println(StringUtils.changeLetter("string MVC"));
	}
}
