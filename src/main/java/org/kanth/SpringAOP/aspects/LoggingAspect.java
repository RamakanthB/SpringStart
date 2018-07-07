package org.kanth.SpringAOP.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.kanth.SpringAOP.bo.MyAnnotation;

@Aspect
public class LoggingAspect {

	@Before("execution( public String org.kanth.SpringAOP.bo.Customer.myFunString())")
	public void before() {
		System.out.println("This is before advise");
	}

	@After("@annotation(org.kanth.SpringAOP.bo.MyAnnotation)")
	public void after() {
		System.out.println("This is after advise");
	}

}
