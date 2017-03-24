package com.imooc.test.autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.Autowiring.AutowiringService;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class testAutowiring extends UnitTestBase {
	
	public testAutowiring(){
		super("classpath*:spring-autowiring.xml");
	}
	
	@Test
	public void testSay(){
		AutowiringService autowiringService = super.getBean("autowiringService");
		autowiringService.say("hehe");
	}
}
