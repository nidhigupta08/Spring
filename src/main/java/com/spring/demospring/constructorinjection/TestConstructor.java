package com.spring.demospring.constructorinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestConstructor {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/demospring/constructorinjection/constructorconfig.xml");
		Person person1= (Person)context.getBean("person");	
	    System.out.println(person1);
	
	    AdditionCons add=(AdditionCons) context.getBean("addit");
	    add.Sum();
	    
	}

}
