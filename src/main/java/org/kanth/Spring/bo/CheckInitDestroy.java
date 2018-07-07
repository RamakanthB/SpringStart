package org.kanth.Spring.bo;

public class CheckInitDestroy {

	public CheckInitDestroy() {
		super();
		System.out.println("CheckInitDestroy new instance");
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void start(){
		 System.out.println("start method after properties are set : " + name);
	}

	public void stop(){
		System.out.println("Spring Container is destroy! CheckInitDestroy clean up");
	}
}
