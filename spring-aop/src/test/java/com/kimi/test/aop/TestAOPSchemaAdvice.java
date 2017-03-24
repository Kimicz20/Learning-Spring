package com.kimi.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.test.base.UnitTestBase;
import com.kimi.aop.schema.advice.MoocAspect;
import com.kimi.aop.schema.advice.biz.AspectBiz;
import com.kimi.aop.schema.advice.biz.Fit;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase{
	
	public TestAOPSchemaAdvice(){
		super("classpath:spring-aop-schema-advice.xml");
	}
	
	@Test
	public void testAOPadvice(){
		AspectBiz aspectBiz = super.getBean("aspectBiz");
		aspectBiz.biz();
		aspectBiz.init("1", 1);
	}
	
	@Test
	public void testInit(){
		AspectBiz aspectBiz = super.getBean("aspectBiz");
		aspectBiz.init("MoocService", 3);
	}
	
	@Test
	public void testImpl(){
		Fit fit = (Fit)super.getBean("aspectBiz");
		fit.fitler();
	}
}