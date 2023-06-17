package com.project;

public class LoopingStatement {
public static void main(String[] args) {
	forloop();
	forloop1();
	whileloop();
	whileloop1();
	dowhile();
	dowhile1();
}
    static void forloop() {
    	System.out.println("Forward");
    	for(int a=1;a<=20;a++) {
    		System.out.println(" "+a);
    	}
    }
    static void forloop1() {
    	System.out.println("backward");
         for(int a=20; a>=1;a--) {
		System.out.println(" "+a);
	    }
    }
    static void whileloop() {
    	System.out.println("Forward");
        int a=1;
    	while(a<=20) {
    		System.out.println(" "+a);
    		a++;
    	}
    }
    static void whileloop1() {
    	System.out.println("backword");
         int a=20;
    	while(a>=1) {
    		System.out.println(" "+a);
    		a--;
    	}
    }
    static void dowhile() {
    	System.out.println("Forward");
    	int a=1;
    	do {
    		System.out.println(" "+a);
    		a++;
    	}
    	while(a<=20);
    }
    static void dowhile1() {
    	System.out.println("backward");
    	int a=20;
    	do {
    		System.out.println(" "+a);
    		a--;
    	}
    	while(a>=1);
    }
}
