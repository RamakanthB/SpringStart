/**
 * 
 */
package org.kanth.Spring.start;

import org.kanth.Spring.bo.PersonBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author ramakanth.b
 *
 */
public class SpringTest6TwoContainers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		GenericApplicationContext  ctx1 = null;
		try{
			ctx = new ClassPathXmlApplicationContext("classpath:app-context.xml");
		    ctx1 = new GenericApplicationContext();
		    new XmlBeanDefinitionReader(ctx1).loadBeanDefinitions("classpath:app-context.xml");
			ctx1.refresh();
		    PersonBean pb = ctx.getBean("personBean", PersonBean.class);
			PersonBean pb1 = ctx1.getBean("personBean", PersonBean.class);
		    System.out.println(pb);
		    System.out.println(pb1);
		}
		catch(BeansException e){
			e.printStackTrace();
		}
		finally {
			if (null != ctx) {
				((ClassPathXmlApplicationContext)ctx).close();
			}
			if (null != ctx1) {
				ctx1.close();
			}
		}

	}

}
