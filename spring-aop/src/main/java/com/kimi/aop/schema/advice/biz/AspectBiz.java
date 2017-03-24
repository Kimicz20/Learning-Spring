package com.kimi.aop.schema.advice.biz;

import org.springframework.stereotype.Service;

public class AspectBiz {
	public void biz(){
		System.out.println("AspectBiz biz");
	}
	public void init(String bizName,int times){
		System.out.println("AspectBiz :"+bizName+"  "+times);
	}
}
