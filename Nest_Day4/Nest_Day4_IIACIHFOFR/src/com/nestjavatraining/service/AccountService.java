package com.nestjavatraining.service;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.SavingsAccount;

public interface AccountService {

	public Account createAccount(int choice);

	public Customer createCustomer(SavingsAccount savingsAccount);

	public void depositAmount();

	public void withdrawAmount();

}
