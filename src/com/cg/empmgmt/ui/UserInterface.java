package com.cg.empmgmt.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.empmgmt.controller.ControllerLayer;
import com.cg.empmgmt.pojo.Employee;

public class UserInterface {

	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	Scanner scanner = new Scanner(System.in);
	Map<String, Object> employeeDetails = new HashMap<>();
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	ControllerLayer appController = (ControllerLayer) context.getBean("controller");

	public void start() throws IOException {
		do {
			showMenu();
		} while (true);

	}

	private void showMenu() throws IOException {
		System.out.println("Make Choice : ");
		System.out.println("1. Accept Data");
		System.out.println("2. Display Data");

		acceptChoice();
	}

	private void acceptChoice() throws IOException {

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			acceptData();
			break;
		case 2:
			displayData();
			break;
		default:// System.out.println("Invalid Input");
			break;
		}
	}

	private void acceptData() throws IOException {
		System.out.println("Enter Employee name`: ");
		String empName = bufferedReader.readLine();
		employeeDetails.put("empName", empName);

		System.out.println("Enter Employee Salary: ");
		double empSal = Double.parseDouble(bufferedReader.readLine());
		employeeDetails.put("empSal", empSal);
		
		appController.addEmployee(employeeDetails);
		
	}

	private void displayData() {
		// Displaying instance members with their values
		TreeSet<Employee> set = (TreeSet<Employee>) appController.viewAllEmployee();
		set.stream().forEach(System.out::println);
		System.out.println("**********");

	}
}
