package org.kanth.Spring.start;

import org.kanth.Spring.bo.CompBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Getting a prototype bean from a singleton bean
 * 
 * 
 * @author ramak
 *
 */
public class SpringTest2 {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		try {

			ctx = new ClassPathXmlApplicationContext("classpath:app-context.xml");
			System.out.println("*********Application Context loaded***********"); // All beans are instantiated as soon
																					// as the spring configuration is
																					// loaded by a container.
			CompBean pb = ctx.getBean("compbean", CompBean.class);
			CompBean pb1 = ctx.getBean("compbean", CompBean.class);
			System.out.println(pb);
			System.out.println(pb1);
			System.out.println("ApplicationContextAware Test");
			ApplicationContext apc=pb.getContext();
			System.out.println(apc.getBean("empproto"));
			ApplicationContext apc0=pb.getContext();
			System.out.println(apc0.getBean("empproto"));

			ApplicationContext apc1=pb1.getContext();
			System.out.println(apc1.getBean("empproto"));
			
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (null != ctx) {
				((ClassPathXmlApplicationContext) ctx).close();
			}
		}

	}

}
