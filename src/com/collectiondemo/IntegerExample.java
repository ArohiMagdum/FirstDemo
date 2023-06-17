package com.collectiondemo;

import java.util.ArrayList;

public class IntegerExample {
	public static void main(String[] args) {
		addition();
		SumofEvenNumbers();
		SumofoddNumbers();
		SumofDivisibleby4();
	}

	static void addition() {
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(11);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(90);
		numbers.add(100);

		int sum = 0;
		for (int number : numbers) {
		    sum += number;
		}

		System.out.println("Sum: " + sum);

	}
	
	static void SumofEvenNumbers() {
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		int sum=0;
		   for(int num:numbers) {
			   if(num%2==0) {
				   sum+=num;
			   }
		   }
		   System.out.println("Sum of Even Numbers :"+sum);
	}
	
	static void SumofoddNumbers() {
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		int sum=0;
		for(int num :numbers) {
			if(num%2!=0) {
				sum+=num;
			}
		}
		System.out.println("Sum of Odd Numbers :"+sum);
	}
	
	static void SumofDivisibleby4() {
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		int sum=0;
		for(int num :numbers) {
			if(num%4==0) {
				sum+=num;
			}
		}
		System.out.println("Sum of Divisible by 4  :"+sum);
	}
}
	
	
	

