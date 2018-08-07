package com.cg.empmgmt.pojo;

public class Employee implements Comparable<Employee>{
	private String empName;
	private static int id = 1;
	private int empId;
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
		this.empId=id++;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}
	
	

	@Override
	public String toString() {
		return "Employee with empName = " + empName + ", empId = " + empId + ", salary = " + salary + ".";
	}

	@Override
	public int compareTo(Employee e) {
		return this.empId - e.empId;
	}
}
