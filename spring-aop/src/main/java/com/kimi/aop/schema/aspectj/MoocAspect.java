package com.kimi.aop.schema.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MoocAspect {
	
	@Pointcut("execution(* com.kimi.aop.schema.aspectj.*Biz.*(..))")
	public void pointcut(){}
	
	@Before("pointcut()")
	public void before(){
		System.out.println("before");
	}
	
	//传递参数
	@Before("pointcut() && args(arg)")
	public void beforeWithParam(String arg){
		System.out.println("beforeWithParam :"+arg);
	}
	
	//传递参数 按照自定义注解的方式
	@Before("pointcut() && @annotation(arg)")
	public void beforeWithAnnotation(MoocMethod arg){
		System.out.println("beforeWithAnnotation :"+arg.value());
	}
	
	@AfterReturning(pointcut="pointcut()",returning="returnVal")
	public void afterReturning(Object returnVal){
		System.out.println("afterReturning :"+returnVal);
	}
	
	@AfterThrowing(pointcut="pointcut()",throwing="ex")
	public void afterThrowing(RuntimeException ex){
		System.out.println("afterThrowing :"+ex.getMessage());
	}
	
	@After("pointcut()")
	public void after(){
		System.out.println("after");
	}
	
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp){
		Object retVal = null;
		try {
			System.out.println("AROUND 1");
			retVal = pjp.proceed();
			System.out.println("AROUND 2");
			System.out.println("AROUND :"+retVal);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return retVal;
	}
}
