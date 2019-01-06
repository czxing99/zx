package com.test.lang;


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml","classpath*:/spring/spring-mybatis.xml"})
public class StringTest  extends AbstractTransactionalTestNGSpringContextTests {
	@Test
	private void left(){
		String temp = "abc";
		System.out.println(temp.substring(0,1));
	}

	@Test
	private void left1(){
		String temp = "babc";
		System.out.println(temp.substring(0,1));
	}
}
