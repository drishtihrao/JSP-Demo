package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Drishti Rao
 *
 */
public abstract class BankAccount {
	private final int accountNumber;
	private Customer accountHolder;
	private double accountBalance;
	
	//maintains the next accountNumber
	private static int accountId;
	
	//gets invoked whenever a class is loaded
	static {
		accountId = 100;
	}

	//gets invoked whenever a new object is created
	{
		this.accountNumber = ++accountId;
	}
	
	public BankAccount(Customer accountHolder, double accountBalance) {
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	//For Zero Balance account holders
	public BankAccount(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void deposit(double amount) {
		if(amount>0)
			this.accountBalance += amount;
	}
	
	public abstract void withdraw (double amount);
	
	
	//getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}
	public Customer getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public String fundTransfer(BankAccount sender, BankAccount reciever, double amount) 
	{
		String result;
		if(sender.getAccountBalance() >= amount) {
			sender.withdraw(amount);
			reciever.deposit(amount);
			result = "Transaction successful";
		}
		else {
			result = "Transaction failed";
		}
		return result;
	}
	
	//It will give the next account number that will assigned to next account object
	public static int getNextAccountNumber() {
		return accountId+1;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
}
