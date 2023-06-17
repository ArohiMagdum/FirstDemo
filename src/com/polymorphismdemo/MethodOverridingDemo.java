package com.polymorphismdemo;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		
		
	}
}

class Demo{
	void method() {     // same method name + same parameter in parent child class 
		System.out.println("inside parent add");
	}
	 protected double method1() {      // access modifier 
		System.out.println("inside parent int");
		return 0.0;
		}
	  int metho2() {
		System.out.println("inside parent int");
		return 0;
	}
	Demo method3() {  // object (same aste kiva child astat)
		return null;
		}
	Number method4() {
		return null;
		
	}
}
class Demo1 extends Demo{
	
	void method() {           // same method name + same parameter in parent child class
		System.out.println("inside child add");
	}
	 public double method1() {            // access modifier 
		System.out.println("inside child int");
		return 0.0;
		}
	int method2() {
		System.out.println("inside child int");
		return 0;
	}
	Demo1 method3() {      // object (same aste kiva child astat)
		return null;
		}
	Float method4() {
		return null;
		
	}
}
