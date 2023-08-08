package com.spring.demospring.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SamosaTest {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/spring/demospring/lifecycle/Samosaconfig.xml");
	
		//abstractionapplicationcontext has method called register	
				context.registerShutdownHook();	
		
		Samosa obj= (Samosa) context.getBean("samosa");
		System.out.println(obj);
		
		
		System.out.println("==========*********************+++++++++++++============");
		
	ImplementingBeanUsingInterface  s1= (ImplementingBeanUsingInterface) context.getBean("Usinginterface");
	System.out.println(s1);
	
	
	}

}
