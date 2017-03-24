package com.imooc.beanAnnotation.fanxing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {
	//当有多个相同类型的Bean时，自动装配需要执行类型
	@Autowired
	@Qualifier("stringStore")
	private Store<String> s1;
	
	@Autowired
	@Qualifier("integerStore")
	private Store<Integer> s2;
	
	@Bean
	public StringStore stringStore(){
		return new StringStore();
	}
	
	@Bean
	public IntegerStore integerStore(){
		return new IntegerStore();
	}
	
	@Bean(name="stringStoreTest")
	public Store stringStoreTest(){
		System.out.println("s1 :"+s1.getClass().getName());
		System.out.println("s2 :"+s2.getClass().getName());
		return new StringStore();
	}
}
