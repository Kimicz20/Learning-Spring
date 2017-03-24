package com.imooc.test.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class testMoocBeanAware extends UnitTestBase {
	
	public testMoocBeanAware(){
		super("classpath*:spring-ioc.xml");
	}
	
	@Test
	public void testMoocBeanName(){
		super.getBean("beanAware");
	}
}
