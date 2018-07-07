package org.kanth.SpringAOP.bo;

public class Customer implements ICustomer {

	public Customer() {
		super();
		System.out.println("This is customer class");
	}

	@MyAnnotation
	public void myFun1() {
		System.out.println("This is fun1");
	}

	public String myFunString() {
		System.out.println(" String return");
		return "kanth";
	}

	public void myCustomThrowException() throws Exception {
		System.out.println("my custom exception");
		throw new Exception("Kanth Exception");
	}

	public void myAround() {
		System.out.println("My around fun");
	}
}
