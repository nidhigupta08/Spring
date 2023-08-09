package com.spring.demospring.ref;
 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 //import org.springframework.context.ClassPathXmlApplicationContext;
public class RefTest {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/demospring/ref/refrenceconfig.xml");
		
		AClass ob1= (AClass) context.getBean("AClassref");
		System.out.println(ob1.getX()); //  20
		System.out.println(ob1.getObj()); //  B [y=50]
		System.out.println(ob1.getObj().getY());  //50
		
		BClass ob = (BClass) context.getBean("BClassref");
		System.out.println(ob.getY());  //  50
		
		
		
	}

}
  