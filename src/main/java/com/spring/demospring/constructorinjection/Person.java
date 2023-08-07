package com.spring.demospring.constructorinjection;

public class Person {
	
	private String name;
	private int pId;
	private Certificate c;
	//constructor
	
	public Person(String name,int pId, Certificate c) {
		
		this.name=name;
		this.pId=pId;
		this.c=c;
	}
	@Override
	public String toString() {
		return this.name +" : " +this.pId + "{" +this.c.name +"}";
	}
}
