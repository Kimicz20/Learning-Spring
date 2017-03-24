package com.kimi.test.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import com.imooc.test.base.UnitTestBase;
import com.kimi.aop.schema.aspectj.AspectBiz;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase{
	
	public TestAOPSchemaAdvice(){
		super("classpath:spring-aop-schema-aspectj.xml");
	}
	
	@Test
	public void testSave(){
		AspectBiz aspectBiz = super.getBean("aspectBiz");
		aspectBiz.save("hello!");
	}

}