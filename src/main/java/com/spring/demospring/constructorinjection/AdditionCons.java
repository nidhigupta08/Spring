package com.spring.demospring.constructorinjection;

public class AdditionCons {
	private int a;
	private int b;
	
	public AdditionCons(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int , int");
	}
	
	public AdditionCons(double a, double b) {
		 this.a=(int)a;
		 this.b=(int)b;
		 System.out.println("Constructor : double, double");
	}
	
	public AdditionCons(String a, String b) {
		
		this.a= Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		 System.out.println("Constructor : String  ,String ");
	}
	
	public void Sum() {
		
		System.out.println("Value of a is :" +a);
		System.out.println("Value og b is :" +b);
         int  Result=a+b;
         System.out.println("Sum of a+b=" +Result);
	}
}
