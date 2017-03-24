package com.imooc.beanAnnotation.mutlibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestInvoker {
	
	@Autowired
	private List<TestInterface> list;
	
	@Autowired
	private Map<String,TestInterface> map;
	
	@Autowired
	@Qualifier("testInterfaceImplOne")
	private TestInterface inter;
	
	public void testSay(){
		if(null != list && 0 != list.size() ){
			for(TestInterface i : list){
				System.out.println(i.getClass().getName());
			}
		}else{
			System.out.println("null !!!");
		}
		
		if(null != map && 0 != map.size()){
			for(Map.Entry<String, TestInterface> entry : map.entrySet()){
				System.out.println(entry.getKey()+" : "+entry.getValue().getClass().getName());
			}
		}
		
		if(null != inter){
			System.out.println(inter.getClass().getName());
		}
	}
}
