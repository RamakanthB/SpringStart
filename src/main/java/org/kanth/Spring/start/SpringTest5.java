package org.kanth.Spring.start;

import org.kanth.Spring.bo.Interface1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest5 {

	public static void main(String[] args) {


		ApplicationContext ctx = null;
		try {

			ctx = new ClassPathXmlApplicationContext("classpath:app-context.xml");
			System.out.println("*********Application Context loaded***********"); // All beans are instantiated as soon
																					// as the spring configuration is
																					// loaded by a container.
			Interface1 pb = (Interface1) ctx.getBean("inter1");
			pb.fun();
			System.out.println(pb);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (null != ctx) {
				((ClassPathXmlApplicationContext) ctx).close();
			}
		}

	

	}

}
