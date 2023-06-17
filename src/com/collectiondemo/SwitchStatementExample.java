package com.collectiondemo;


import java.util.ArrayList;
import java.util.Scanner;

public class SwitchStatementExample {
public static void main(String[] args) {
	CollectionSwitchDemo();
}
 static void CollectionSwitchDemo() {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size");
  int size=sc.nextInt();
 ArrayList list =new ArrayList();
 boolean flag =false;
 do{
	 System.out.println("1. add element 2. check element");
	 System.out.println("select ur choice");
	 int choice =sc.nextInt();
	 switch(choice) {
	 case 1: 
		 int asize=list.size();
		 if(asize<size) {
			 System.out.println("enter your element");
			 int element =sc.nextInt();
			 list.add(element);
		 }else {
			 System.out.println("collection is full now");		 }
	break;
	 case 2:
		 System.out.println("enter your elemen for check");
		 int element=sc.nextInt();
		 if(list.contains(element)) {
			 System.out.println("element is  present");
		 }else {
			 System.out.println("element is not present");
		 }
		 break;
		 default:
			 break;
	 }
	 System.out.println("do u want continue");
	 String msg=sc.next();
	 if(msg.equalsIgnoreCase("yes")) {
		 flag=true;
	 }else {
		 flag=false;
	 }
 }while(flag);
 System.out.println("========End of Program=======");
  
	   	  
  
 }
}
  
 

	        




