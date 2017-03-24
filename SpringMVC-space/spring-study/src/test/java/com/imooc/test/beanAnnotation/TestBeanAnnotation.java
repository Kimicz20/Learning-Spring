package com.imooc.test.beanAnnotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanAnnotation.BeanAnnotation;
import com.imooc.beanAnnotation.Configuration.MyDriverManager;
import com.imooc.beanAnnotation.JSR.JsrService;
import com.imooc.beanAnnotation.fanxing.IntegerStore;
import com.imooc.beanAnnotation.fanxing.Store;
import com.imooc.beanAnnotation.fanxing.StringStore;
import com.imooc.beanAnnotation.mutlibean.TestInvoker;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
	
	public TestBeanAnnotation(){
		super("classpath*:spring-beanAnnotation.xml");
	}
	
	@Test
	public void testHello(){
		BeanAnnotation annotation = super.getBean("beanAnnotation");
		annotation.sayHashCode();
	}
	
	@Test
	public void testScope(){
		BeanAnnotation annotation = super.getBean("beanAnnotation");
		annotation.sayHashCode();
		
		BeanAnnotation annotation2 = super.getBean("beanAnnotation");
		annotation2.sayHashCode();
	}
	
	@Test
	public void testAutowired(){
		TestInvoker invoker = super.getBean("testInvoker");
		invoker.testSay();
	}
	
	@Test
	public void testBeanConfig(){
		MyDriverManager myDriverManager = super.getBean("driver");
		System.out.println(myDriverManager.getClass().getName());
	}
	
	@Test
	public void testG(){
		StringStore store = super.getBean("stringStoreTest");
	}
	
	@Test
	public void testResource(){
		JsrService store = super.getBean("jsrService");
		store.say();
	}
	
}
