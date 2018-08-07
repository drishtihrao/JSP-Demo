package com.cg.empmgmt.controller;

import java.util.Map;
import java.util.Set;

import com.cg.empmgmt.pojo.Employee;
import com.cg.empmgmt.service.ServiceLayer;

public interface ControllerInterface {
	
	public void addEmployee(Map map);
	public Set<Employee> viewAllEmployee();
	public Employee getEmpById(int id);
	public void removeEmpById(int id);
	
	public void setEmployeeService(ServiceLayer service);
}
