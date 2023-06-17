package com.example;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		EvenOddNumber();
		FactorialNumber();
		FibonnanciNumber();
		PrimeNumber();
	}

	static void EvenOddNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd Number");
		}
	}
	
	static void FactorialNumber() {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
          for(int i=1;i<=num;i++) {
        	  fact*=i;
          }
          System.out.println("Factorial :"+fact);
	}
	
	static void FibonnanciNumber() {
		int a=0,b=1 ,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
            for(int i=1; i<=num;i++) {
            	System.out.println(a);
            	c=a+b;
            	a=b;
            	b=c;
            }
          }
	
	static void PrimeNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
         if(num%2==0 && num>=2) 
         {
        	 System.out.println("Not Prime Number");
         }
         else 
         {
        	 System.out.println("Prime Number");
         }
	}
	
	
	
	
	
}
