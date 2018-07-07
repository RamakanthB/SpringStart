package org.kanth.Spring.javaconfig.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CompJavaBean {

	private String compid;

	@Autowired
//	@Qualifier("empparbean")
	private EmpJavaBean emp;

	public CompJavaBean() {
		super();
		System.out.println("CompJavaBean new instance");
	}

	public void getEmpBean() {
		System.out.println(emp);
	}

}
