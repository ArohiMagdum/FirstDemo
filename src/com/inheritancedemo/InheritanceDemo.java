package com.inheritancedemo;

public class InheritanceDemo {
	
}		
	class Emp{   //parent class
		int empid;
		String empname;
		String gender;
		double salary;
		public int getEmpid() {        // using setter getter method
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override         //using to string method
		public String toString() {
			return "Emp [empid=" + empid + ", empname=" + empname + ", gender=" + gender + ", salary=" + salary + "]";
		}
		/**
		 * @param empid
		 * @param empname
		 * @param gender
		 * @param salary
		 */
		public Emp(int empid, String empname, String gender, double salary) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.gender = gender;
			this.salary = salary;
		}
                        		
		
		
	}	
	
	class PEmp extends Emp{
		String payRollCompany;

		/**
		 * @param empid
		 * @param empname
		 * @param gender
		 * @param salary
		 * @param payRollCompany
		 */
		public PEmp(int empid, String empname, String gender, double salary, String payRollCompany) {
			super(empid, empname, gender, salary);
			this.payRollCompany = payRollCompany;    //using generate constructor using fields
		}
		
		
	}
	
	
	class CEmp extends Emp{
		int durationContract;

		/**
		 * @param empid
		 * @param empname
		 * @param gender
		 * @param salary
		 * @param durationContract
		 */
		public CEmp(int empid, String empname, String gender, double salary, int durationContract) {
			super(empid, empname, gender, salary);
			this.durationContract = durationContract;    //using generate constructor using fields
		}
		
		
	}
	
	
		
	
		
	
	
	
	
	


