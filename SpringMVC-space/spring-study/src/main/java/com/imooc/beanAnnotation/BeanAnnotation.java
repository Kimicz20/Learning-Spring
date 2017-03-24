package com.imooc.beanAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class BeanAnnotation {

	public void sayHashCode(){
		System.out.println("sayHashCode :"+this.hashCode());
	}
}
