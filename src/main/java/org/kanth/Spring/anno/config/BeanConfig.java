package org.kanth.Spring.anno.config;

import org.kanth.Spring.javaconfig.bo.CompJavaBean;
import org.kanth.Spring.javaconfig.bo.EmpJavaBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public CompJavaBean compJavaBean() {
		return new CompJavaBean();

	}

//	@Bean
//	public EmpJavaBean empJavaBean() {
//		return new EmpJavaBean();
//
//	}

	@Bean
//	@Qualifier("empparbean")
	EmpJavaBean empJavBeab() {
		return new EmpJavaBean("kanth");
	}
}
