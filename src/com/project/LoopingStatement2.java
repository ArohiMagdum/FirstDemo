package com.project;

public class LoopingStatement2 {
    public static void main(String[] args) {
			forloop();
			whileloop();
			dowhile();
	    	foreachloop();
		}
	    static void forloop() {
	    	System.out.println("Sum of odd Number :");
	    	int sum=0;
	    	for(int a=0; a<=20;a++) {
	    		if(a%2!=0) {
	    			sum=sum+a;
	    		}
	    	}
	    	System.out.println(+sum);
	    }
	    static void whileloop() {
	    	System.out.println(" sum of odd numbers :");
	    	int sum=0;
	    	int a=1;
	    	while(a<=20) {
	    		if(a%2!=0) {
	    			sum=sum+a;
	    		}
	    		 a++;
	            }
	    	System.out.println(+sum);

	    	}
	    static void dowhile(){
	    	System.out.println("Sum of odd numbers :");
	    	int sum=0;
	    	int a=1;
	    	do {
	    		if(a%2!=0) {
	    			sum=sum+a;
	    		}
	    		a++;
	    	}
	    	while(a<=20);
	    	System.out.println(+sum);
	    	 }
	    static void foreachloop() {
	    	System.out.println("Sum of odd numbers");
	    	int sum=0;
	    	int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	    	for(int b:a) {
	    		if(b%2!=0) {
	    			sum=sum+b;
	    		}
	    	}
	    	System.out.println(+sum);
	    }
	}




		
	    	    
	



