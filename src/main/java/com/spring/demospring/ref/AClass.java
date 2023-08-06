package com.spring.demospring.ref;

public class AClass {
		private int x;
		private BClass obj;

//		getter and setter method
		public int getX() {
			return x=x;
			
		}
		public void setX(int x) {
			this.x=x;
		}
		
		public BClass getObj() {
			return obj;
		}
		public void setObj(BClass obj) {
			this.obj=obj;
		}
		
//		constructor
		public AClass() {
			super();
		}
		
		@Override
		public String toString() {
			return "AClass [x=" + x + ", obj=" + obj + "]";
		}
		
		
}
