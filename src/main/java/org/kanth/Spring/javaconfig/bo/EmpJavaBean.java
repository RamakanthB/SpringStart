package org.kanth.Spring.javaconfig.bo;

public class EmpJavaBean {

	private String empName;
	private String empid;
	public EmpJavaBean() {
		super();
		System.out.println("EmpJavaBean new instance");
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
}
