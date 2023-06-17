package com.polymorphismdemo;

public class MethodOverloadingDemo {

	public static void main(String[] args ){
TestMethodOverloading obj = new TestMethodOverloading();
		obj.method();
		  obj.method(3.14159);
		  obj.method((byte)127);
		  obj.method(1.23f);
		  obj.method(10);
		  obj.method(12.20, 14.2);
		  obj.method(2.34f, 40.55, 30);
		  obj.method(50, 4.44, 2.5f);
		
		
	}
}
	
class TestMethodOverloading {
		void method() {
			System.out.println("NO parameter");
		}
		
		void method(int a) {
			System.out.println("Single int");
		}
		
		void method(double a) {
			System.out.println("Single double");
		}
		
		void method(float a) {
			System.out.println("Single float");
		}
		
		void method(byte a) {
			System.out.println("Single byte");
		}
		
		void method(int a,double b, float c) {
			System.out.println("Three parameters");
		}
		
		void method(double a,double b) {
			System.out.println(" two parameters");
		}
		
		void method(float c,double b,int a) {
			System.out.println("three parameter");
		}
	}


