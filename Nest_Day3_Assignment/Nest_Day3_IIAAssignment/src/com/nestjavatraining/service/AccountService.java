package com.nestjavatraining.service;

import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.SavingsMaxAccount;
import com.nestjavatraining.entity.WomenSavingsAccount;

public interface AccountService {

	public WomenSavingsAccount createAccount1();
	
	public SavingsMaxAccount createAccount2();

	public void depositAmount(SavingsAccount savingsAccount);

	public void withdrawAmount(SavingsAccount savingsAccount);



}
