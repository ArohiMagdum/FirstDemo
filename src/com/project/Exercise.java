package com.project;

import java.util.Scanner;

public class Exercise {
public static void main(String[] args) {
	add();
	
}

static void add () {
Scanner ref=new Scanner (System.in);
	System.out.println("enter any number");
	int choice=ref.nextInt();
	if(choice==1) {
		System.out.println("first number");
		int num1=ref.nextInt();
	
	System.out.println("second number");
	int num2=ref.nextInt();
	int result= num1-num2;
	System.out.println("substract="+result);
}
	else if(choice==2) {
		System.out.println("enter year ");
		int year=ref.nextInt();
		if(year %4==0) {
			System.out.println("This year is leap year");
		}
		else {
			System.out.println("This year is not leap year");
		}
	}
	else if (choice==3) {
		System.out.println("enter number");
		int num=ref.nextInt();
		if(num%2==0 && num>=2  ) {
			System.out.println("This number is not  prime number");
		}
		else {
			System.out.println("This number is  prime number");
		}
	
		
	}
	else {
		System.out.println("Invalid Number");
	}
                  







}
}
