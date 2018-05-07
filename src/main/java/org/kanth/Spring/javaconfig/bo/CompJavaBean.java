package org.kanth.Spring.javaconfig.bo;

import org.springframework.beans.factory.annotation.Autowired;

public class CompJavaBean {

	private String compid;
	
	@Autowired
	private EmpJavaBean emp;

	public CompJavaBean() {
		super();
		System.out.println("CompJavaBean new instance");
	}
	
}
