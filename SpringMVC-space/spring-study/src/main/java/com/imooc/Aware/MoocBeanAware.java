package com.imooc.Aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocBeanAware implements ApplicationContextAware,BeanNameAware {

	private String beanName;
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(applicationContext.getBean(beanName));
	}
	
}
