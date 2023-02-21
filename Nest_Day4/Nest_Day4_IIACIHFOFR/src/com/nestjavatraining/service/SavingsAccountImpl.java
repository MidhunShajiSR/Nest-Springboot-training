package com.nestjavatraining.service;

import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.SavingsMaxAccount;
import com.nestjavatraining.entity.WomenSavingsAccount;

public class SavingsAccountImpl implements AccountService {

	@Override
	public void depositAmount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawAmount() {
		// TODO Auto-generated method stub

	}

	public SavingsAccount createAccount(int choice) {

		SavingsAccount savingsAccount = null;
		if (choice == 1) {
			savingsAccount = new WomenSavingsAccount("WSA001", "Women Savings Account", "Feb 10 2023", "", 1000, 2);
		} else if (choice == 2) {

			savingsAccount = new SavingsMaxAccount("SMA001", "Savings Max Account", "Jan 10 2023", "", 2000);

		}
		return savingsAccount;

	}

	public Customer createCustomer(SavingsAccount savingsAccount) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("CU101", "midhun", savingsAccount);
		return customer;
	}

}
