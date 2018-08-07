package com.moneymoney.app.console.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moneymoney.app.console.controller.MMBankAccountController;

public class MMBankView {
	
	BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(System.in));
	Map<String, Object> accountDetails = new HashMap<>();
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	MMBankAccountController bankController = (MMBankAccountController) context.getBean("controller");
	
	public void start() throws IOException {
		do {
			showMenu();
		}while(true);
		
	}

	private void showMenu() throws IOException {
		System.out.println("Make Choice : ");
		System.out.println("1. Add New Savings Account");
		System.out.println("2. Add New Current Account");
		System.out.println("3. Show All Accounts");
		System.out.println("4. Get Next Accountb Number");
		System.out.println("5. Search Account By Account Number");
		System.out.println("6. Exit");
		
		acceptChoice();
	}

	private void acceptChoice() throws IOException {
		
		int choice = bufferedReader.read();
		switch (choice) {
		case 1:
			addNewSavingsAccount();
			break;
		case 2:
			addNewCurrentAccount();
			break;
		
		default:
			break;
		}
	}

	private void addNewSavingsAccount() throws IOException {
		addCustomerBasicDetails();
		System.out.println("Enter Salary?(n/y): ");
		String salary = bufferedReader.readLine();
		accountDetails.put("salary", salary.equalsIgnoreCase("n")?false:true);
		acceptCustomerDetails();
	}
	
	private void addCustomerBasicDetails() throws IOException {
		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = bufferedReader.readLine();
		accountDetails.put("accountHolderName", accountHolderName);
		
		System.out.println("Enter Account Balance: ");
		double accountBalance = Double.parseDouble(bufferedReader.readLine());
		accountDetails.put("accountBalance", accountBalance);	
	}

	private void acceptCustomerDetails() throws NumberFormatException, IOException {
		System.out.println("Enter Contact Number: ");
		Long contact = Long.parseLong(bufferedReader.readLine());
		accountDetails.put("contact", contact);
		
		System.out.println("Enter Date of Birth(dd/mm/yyyy): ");
		String dobStr = bufferedReader.readLine();
		LocalDate dateOfBirth = getDate(dobStr);
		accountDetails.put("dateOfBirth", dateOfBirth);
		
		System.out.println("Enter the gender of Account Holder: ");
		String gender = bufferedReader.readLine();
		accountDetails.put("Gender", gender);
		
		System.out.println("Enter the nationality of Account Holder: ");
		String nationality = bufferedReader.readLine();
		accountDetails.put("Nationality", nationality);
		acceptCustomerPermanentAddress();
	}

	private LocalDate getDate(String dobStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		LocalDate date = LocalDate.parse(dobStr, formatter);
		return date;
	}
	
	private void acceptCustomerPermanentAddress() throws IOException{
		
		System.out.println("Enter Flat Number: ");
		String flatNum = bufferedReader.readLine();
		accountDetails.put("flatNum", flatNum);
		
		System.out.println("Enter street name: ");
		String street = bufferedReader.readLine();
		accountDetails.put("street", street);
		
		System.out.println("Enter city name: ");
		String city = bufferedReader.readLine();
		accountDetails.put("city", city);
		
		System.out.println("Enter state name: ");
		String state = bufferedReader.readLine();
		accountDetails.put("state", state);
		
		System.out.println("Enter pincode: ");
		int pincode = bufferedReader.read();
		accountDetails.put("pincode", pincode);
	}
	
	private void addNewCurrentAccount() throws IOException {
		addCustomerBasicDetails();
		
		System.out.println("Enter Over Draft Limit: ");
		double odLimit = Double.parseDouble(bufferedReader.readLine());
		accountDetails.put("odLimit", odLimit);	
		
		acceptCustomerDetails();
		acceptCustomerPermanentAddress();
	}
}
