package com.spring.demospring.constructorinjection;

public class Certificate {

	 String name;
	
	
	public Certificate( String name) {
		 super();
		 this.name=name;
	}
	
	public String toString() {
		return this.name;
	}
}
