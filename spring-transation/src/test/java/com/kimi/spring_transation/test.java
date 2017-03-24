package com.kimi.spring_transation;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.kimi.spring_transation.Interfaces.AccountService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transation.xml")
public class test {
	
	@Resource(name="accountService")
//	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	@Test
	public void demo1(){
		accountService.transfer("aaa", "bbb",200d);
	}
}
