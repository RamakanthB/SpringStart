package org.kanth.SpringAOP.start;

import org.kanth.SpringAOP.bo.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest1 {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("classpath:aspectBeanConfig.xml");
			Customer cus = ctx.getBean("customer", Customer.class);
			cus.myFunString();
			cus.myFun1();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (null != ctx) {
				((ClassPathXmlApplicationContext) ctx).close();
			}
		}

	}

}
