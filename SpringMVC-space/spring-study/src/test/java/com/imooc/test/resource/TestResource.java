package com.imooc.test.resource;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.Recource.MoocResource;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {

	public TestResource() {
		super("classpath*:spring-resource.xml");
	}
	
	@Test
	public void testResource(){
		MoocResource moocResource = super.getBean("resource");
		try {
			moocResource.getResource();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
