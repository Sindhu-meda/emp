package com.cg1;

public class Employee
{
	 private int Id;
	 private String Name;
	 private double salary;
	 private String bUnit;
	 private int age;
	 private SBU sbu;
		
	 
	 public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getbUnit() {
		return bUnit;
	}
	public void setbUnit(String bUnit) {
		this.bUnit = bUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBU getSbu() {
		return sbu;
	}
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	public void getEmployeeDetails()
	 {
	  System.out.println("Employee Id:"+Id);
	  System.out.println("Employee Name:"+Name);
	  System.out.println("Employee Salary:"+salary);
	  System.out.println("Employee BusinessUnit:"+bUnit);
	  System.out.println("Employee Age:"+age);
		
	 }
	 public void getSbuDetails()
	 {
	  System.out.println("Sbu Id :"+sbu.getSbuId());
	  System.out.println("Sbu Head :"+sbu.getSbuHead());
	  System.out.println("Sbu Name :"+sbu.getSbuName());
	  sbu.toString();
	 }

}
