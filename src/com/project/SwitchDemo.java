//Switch Statement
package com.project;

import java.util.Scanner;

public class SwitchDemo {
public static void main(String[] args) {
	add();
}
static void add() {
	Scanner sc=new Scanner(System.in);
	System.err.println("enter any choice number");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter Year");
		int year=sc.nextInt();
		if(year%4==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
		break;
	case 2:
		System.out.println("enter number");
		int num=sc.nextInt();
		if(num%2==0 && num>=2) {
			System.out.println("Not prime number");
		}
		else {
			System.out.println("Prime number");
		}
		break;
	case 3:
		System.out.println("Enter Number");
		int num1=sc.nextInt();
		if(num1<0) {
			System.out.println("Negtive Number");
		}
		else {
			System.out.println("Positive Number");
		}
		break;
	case 4:
		System.out.println("Enter Number");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		break;
		default:
			System.out.println("Invalide ");
	}
}
}
