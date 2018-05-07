package org.kanth.Spring.bo;

public class CompanyBean {

	private EmployeeBean empbean;
	public CompanyBean() {
		super();
		System.out.println("Company Bean instance");
	}
	private String compid;
	public EmployeeBean getEmpbean() {
		return empbean;
	}
	public void setEmpbean(EmployeeBean empbean) {
		this.empbean = empbean;
	}
	public String getCompid() {
		return compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
	}
	@Override
	public String toString() {
		return "CompanyBean [empbean=" + empbean + ", compid=" + compid + "]";
	}
	
}
