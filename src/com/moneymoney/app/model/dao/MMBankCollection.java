package com.moneymoney.app.model.dao;

import java.util.Set;

import com.moneymoney.framework.account.dao.BankAccountCollection;
import com.moneymoney.framework.account.pojo.BankAccount;

public class MMBankCollection extends BankAccountCollection {	
	
	public Set<BankAccount> showAll() {
		return super.viewAll();
	}
}
