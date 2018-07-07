package org.kanth.Spring.javaconfig.bo;

public class EmpJavaBean {

	private String empName;
	private String empid;
	private String val;
	public EmpJavaBean() {
		super();
		System.out.println("EmpJavaBean new instance");
	}
	public EmpJavaBean(String val) {
		System.out.println("val is --"+val);
		this.val=val;
	}
	public String getEmpName() {
		return empName;
	}
	@Override
	public String toString() {
		return "EmpJavaBean [empName=" + empName + ", empid=" + empid + "]"+val;
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
