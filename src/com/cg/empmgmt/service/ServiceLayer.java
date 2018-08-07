package com.cg.empmgmt.service;

import java.util.Set;
import java.util.TreeSet;

import com.cg.empmgmt.dao.EmployeeDAO;
import com.cg.empmgmt.pojo.Employee;

public class ServiceLayer implements ServiceInterface {
	EmployeeDAO dao;
		
	public void addEmployee(Employee e) {
		dao.addEmployee(e);
	}

	public TreeSet<Employee> viewAllEmployee() {
		return (TreeSet<Employee>)dao.viewAllEmployee();
	}

	public Employee getEmpById(int id) {
		return dao.getEmpById(id);
	}

	public void removeEmpById(int id) {
		dao.removeEmpById(id);
	}

	@Override
	public void setEmployeeDAO(EmployeeDAO dao) {
		this.dao = dao;
		
	}


	
}
