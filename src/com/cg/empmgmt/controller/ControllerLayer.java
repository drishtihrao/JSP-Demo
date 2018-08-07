package com.cg.empmgmt.controller;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.cg.empmgmt.pojo.Employee;
import com.cg.empmgmt.service.ServiceLayer;

public class ControllerLayer implements ControllerInterface {
	ServiceLayer service;

	public void addEmployee(Map map) {
		Employee employee = new Employee((String)map.get("empName"), ((Double)map.get("empSal")));
		service.addEmployee(employee);
	}

	public TreeSet<Employee> viewAllEmployee() {
		return (TreeSet<Employee>)service.viewAllEmployee();
	}

	public Employee getEmpById(int id) {
		return service.getEmpById(id);
	}

	public void removeEmpById(int id) {
		service.removeEmpById(id);
	}

	@Override
	public void setEmployeeService(ServiceLayer service) {
		this.service = service;
		
	}



}
