package org.kanth.Spring.start;

import org.kanth.Spring.anno.config.BeanConfig;
import org.kanth.Spring.javaconfig.bo.CompJavaBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest3 {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		try {
			ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
			CompJavaBean comp = ctx.getBean(CompJavaBean.class);
			System.out.println(comp);

		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (null != ctx) {
				((AnnotationConfigApplicationContext) ctx).close();
			}
		}

	}

}
