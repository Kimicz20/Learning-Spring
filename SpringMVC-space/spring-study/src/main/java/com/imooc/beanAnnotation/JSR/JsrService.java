package com.imooc.beanAnnotation.JSR;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

//@Service
@Named
public class JsrService {
	
//	@Resource
	@Inject
	private JsrDAO jsrDao;
	
//	@Resource
	public void setJsrDao(JsrDAO jsrDao) {
		this.jsrDao = jsrDao;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}
	
	public void say() {
		jsrDao.say();
	}
}
