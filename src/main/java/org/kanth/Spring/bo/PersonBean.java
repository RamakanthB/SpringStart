package org.kanth.Spring.bo;

/**
 * 
 * @author ramak
 *
 */
public class PersonBean {

	private String name;
	private String emailId;
//	@Override
//	public String toString() {
//		return "PersonBean [name=" + name + ", emailId=" + emailId + ", empid=" + empid + ", age=" + age + "]";
//	}

	private String empid;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
