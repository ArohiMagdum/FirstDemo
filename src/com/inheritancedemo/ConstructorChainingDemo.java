package com.inheritancedemo;

public class ConstructorChainingDemo {
	public static void main(String[] args) {
         B b=new B();
	}
}
	
	
	class A{
		public A() {
			//this(10);
			System.out.println("Inside A No arg");
		}
		
		public A(int a) {
			this(10,20);
			System.out.println("Inside A Single arg");
		}
		
		public A(int a, int b) {
		//super();
			System.out.println("Inside A Double arg");
		}
	}
	
	
	class B extends A{
		public B() {
			//this(10 );
			System.out.println("Inside B NO arg");
		}
		
		public B(int a) {
			this(10,20);
			System.out.println("Inside B Single arg");
		}
		
		public B(int a,int b) {
			//super();
			System.out.println("Inside B Double arg");
		}
	}
	
	
	
	
	


