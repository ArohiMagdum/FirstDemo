package com.project;

public class firstDemo {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.err.println("Welcome");
		
		System.out.println("inside static block");
		System.out.println("inside intance block");
		
		Student obje=new Student();
		obje.setId(1);
		obje.setName("Arohi");
		obje.setMark(100);
		System.err.println("obje="+obje);
		
		
	
	}

}

class Student{
	int id;
	String name;
	int mark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}

	
	
	
	
	
	
	}
	
	
	 
	
