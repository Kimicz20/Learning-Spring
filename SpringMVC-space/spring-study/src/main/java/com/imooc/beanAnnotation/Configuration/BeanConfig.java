package com.imooc.beanAnnotation.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring-beanAnnotation.xml")
public class BeanConfig {

	@Value(value = "${jdbc.url}")
	private String url;

	@Value(value = "${jdbc.username}")
	private String username;

	@Value(value = "${jdbc.password}")
	private String password;

	@Bean(name = "driver")
	public MyDriverManager myDriverManager() {
		return new MyDriverManager(url, username, password);
	}
}
