package org.kanth.Spring.bo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CompBean implements ApplicationContextAware{

	public ApplicationContext getContext() {
		return context;
	}
	private String compid;
	private EmpProBean empbean;
	
	public String getCompid() {
		return compid;
	}


	public void setCompid(String compid) {
		this.compid = compid;
	}


	public EmpProBean getEmpbean() {
		return empbean;
	}


	public void setEmpbean(EmpProBean empbean) {
		this.empbean = empbean;
	}
	private ApplicationContext context = null;
	
	
	public CompBean() {
		super();
		System.out.println("CompBean new instance");
	}
	
	
//	@Override
//	public String toString() {
//		return "CompBean [compid=" + compid + ", empbean=" + empbean + ", context=" + context + "]";
//	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		
	}


}
