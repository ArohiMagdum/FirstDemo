package com.project;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	//add();
	add1();
	//add2();
}

     static void add() {
    	 Scanner ref=new Scanner (System.in);
    	 System.out.println("enter year");
    	 int year=ref.nextInt();
    	 if(year%4==0) {
    		 System.out.println("This year is leap year");
    	 }
    	 else {
    		 System.out.println("This year is not leap year");
    	 }
    }
     
     static void add1() {
    	 Scanner ref1=new Scanner (System.in);
    	 System.out.println("enter number");
    	 int num=ref1.nextInt();
    	 if(num%2==0 && num>=2 ) {
    		 System.out.println("This is prime not number");
    	 }
    	 else {
    		 System.out.println("this is  prime number");
    	 }
     }
     
     static void add2() {
    	 Scanner ref2=new Scanner(System.in);
    	 System.out.println("enter number");
    	 int num=ref2.nextInt();
    	 
     }
     
     
     
     
     
     
     
}
