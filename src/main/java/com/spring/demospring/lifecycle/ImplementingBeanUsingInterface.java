package com.spring.demospring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ImplementingBeanUsingInterface implements InitializingBean,DisposableBean {

	private double price;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}

	public ImplementingBeanUsingInterface() {
		super();
  
	}

	@Override
	public String toString() {
		return "ImplementingBeanUsingInterface [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init method 
		System.out.println("I m inside init  method 2nd bean ");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		System.out.println("After work is done it will call this method to destroy");
		 
	}
	
	
}
