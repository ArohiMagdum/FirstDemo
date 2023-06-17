package com.polymorphismdemo;

public class CallSquenceOverridingDemo {
        public static void main(String[] args) {
		S s1=new S();       //parent cha reference ani parent cha object 
			s1.m1();
			s1.m2();
			
		Q q1=new Q();     // child cha reference ani child cha object
			q1.m1();
			q1.m2();
			q1.m3();
			
			S s2=new Q();    // parent cha reference ani child cha object
			s2.m1();
			s2.m2();
		}
}


class S{
	void m1() {
		System.out.println("inside S m1");
	}
	void m2() {
		System.out.println("inside S m2");
	}
}

class Q extends S{
	void m1() {
		System.out.println("inside Q m1");
	}
	void m3() {
		System.out.println("inside Q m3");
	}
	
}