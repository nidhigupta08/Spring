package com.spring.demospring.lifecycle;

public class Samosa {

	private Double price;
	
	public double getPrice() {
		return price;
	}
	//initializing through setter method
	public void setPrice(double price) {
		System.out.println("Property setting to know after setting it goes to init method");
		this.price=price;
	}
	
	public Samosa() {
		super();
	}
	
	@Override
	public String toString() {
		return  "Samosa [price=" +price +"]";
	}
	public void init() {
		
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
