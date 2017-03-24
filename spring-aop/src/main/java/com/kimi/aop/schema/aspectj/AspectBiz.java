package com.kimi.aop.schema.aspectj;

import org.springframework.stereotype.Service;

@Service
public class AspectBiz {
	@MoocMethod("AspectBiz save with MoocMethod")
	public String save(String args){
		System.out.println("AspectBiz save");
//		throw new RuntimeException("save failed");
		return "save success";
	}
}
