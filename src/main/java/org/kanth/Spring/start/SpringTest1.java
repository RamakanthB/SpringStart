package org.kanth.Spring.start;

import org.kanth.Spring.bo.CompanyBean;
import org.kanth.Spring.bo.EmployeeBean;
import org.kanth.Spring.bo.PersonBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author ramakanth
 *
 */
public class SpringTest1 {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		try {

			ctx = new ClassPathXmlApplicationContext("classpath:app-context.xml");
			PersonBean pb = ctx.getBean("personBean", PersonBean.class);
			EmployeeBean empbeam = ctx.getBean("emp", EmployeeBean.class);
			CompanyBean compbean=ctx.getBean("comp",CompanyBean.class);
			System.out.println(pb);
			System.out.println(empbeam);
			System.out.println(compbean);
			

		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (null != ctx) {
				((ClassPathXmlApplicationContext)ctx).close();
			}
		}

	}

}
