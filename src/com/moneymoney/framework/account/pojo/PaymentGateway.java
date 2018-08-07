package com.moneymoney.framework.account.pojo;
//method to transfer the given amount from the source to target account.
public class PaymentGateway {
	
		public static boolean fundTransfer(BankAccount sender, BankAccount reciever, double amount) 
		{
			//If the sender account balance = the given amount then the amount is
			//transferred from the sender to the receiver account and true is returned
			//otherwise false is returned.
			boolean status;
			if(sender.getAccountBalance() == amount) {
				sender.withdraw(amount);
				reciever.deposit(amount);
				status = true;
			}
			else {
				status = false;
			}
			return status;
		}
}