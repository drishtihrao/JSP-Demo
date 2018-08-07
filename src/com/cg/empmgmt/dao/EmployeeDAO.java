package com.cg.empmgmt.dao;

import java.util.Set;
import java.util.TreeSet;

import com.cg.empmgmt.pojo.Employee;

public class EmployeeDAO {
	Set<Employee> empSet = new TreeSet<>();

	public void addEmployee(Employee e) {
		empSet.add(e);
	}

	public TreeSet<Employee> viewAllEmployee() {
		return (TreeSet<Employee>) empSet;
	}

	public Employee getEmpById(int id) {
		Employee emp = null;
		for (Employee employee : empSet) {
			if (employee.getEmpId() == id)
				 emp = employee;
		}
		return emp;
	}

	public void removeEmpById(int id) {
		Employee emp = null;
		for (Employee employee : empSet) {
			if (employee.getEmpId() == id)
				empSet.remove(employee);
		}
	}

}
