package com.cg.empmgmt.service;

import java.util.Map;
import java.util.Set;

import com.cg.empmgmt.dao.EmployeeDAO;
import com.cg.empmgmt.pojo.Employee;

public interface ServiceInterface {
	
	public void addEmployee(Employee e);
	public Set<Employee> viewAllEmployee();
	public Employee getEmpById(int id);
	public void removeEmpById(int id);
	
	public void setEmployeeDAO(EmployeeDAO dao);
}