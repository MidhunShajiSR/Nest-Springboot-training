package com.nestjavatraning.service;

import com.nestjavatraining.entity.Account;

public class AccountService {

	public static Account createAccount() {
		Account account = new Account("ACC100","Saving Account");
		System.out.println("Account created successful");
		return account;
	}
	public void displayAccount() {
	
	}
}
