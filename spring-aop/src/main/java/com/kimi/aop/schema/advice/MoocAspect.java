package com.kimi.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

public class MoocAspect
{
	public void before(){
		System.out.println("MoocAspect before");
	}
	
	public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times){
		System.out.println(bizName+"  "+times);
		Object obj =null;
		try {
			System.out.println("MoocAspect around 1");
			obj = pjp.proceed();
			System.out.println("MoocAspect around 2");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}
