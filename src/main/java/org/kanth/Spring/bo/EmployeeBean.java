package org.kanth.Spring.bo;

public class EmployeeBean {
	private String empid;
	private int exp;
	public EmployeeBean(String empid, int exp) {
		super();
		this.empid = empid;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", exp=" + exp + "]";
	}

}
