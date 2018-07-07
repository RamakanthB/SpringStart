package org.kanth.Spring.start;

import org.kanth.Spring.bo.CheckInitDestroy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest4 {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:app-context.xml")){
			CheckInitDestroy intde=ctx.getBean("initdestory", CheckInitDestroy.class);
		}
		catch(Exception e){
			
		}
	}

}
