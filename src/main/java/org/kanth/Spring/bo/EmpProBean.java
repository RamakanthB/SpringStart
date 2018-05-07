package org.kanth.Spring.bo;

public class EmpProBean {

	private String empid;
	private String name;
	public EmpProBean(String empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
		System.out.println("EmpProBean new instance");
	}
//	@Override
//	public String toString() {
//		return "EmpProBean [empid=" + empid + ", name=" + name + "]";
//	}
	
}
