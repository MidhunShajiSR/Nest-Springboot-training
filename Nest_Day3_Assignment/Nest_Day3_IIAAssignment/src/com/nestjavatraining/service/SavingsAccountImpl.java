package com.nestjavatraining.service;

import java.util.Scanner;

import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.SavingsMaxAccount;
import com.nestjavatraining.entity.WomenSavingsAccount;

public class SavingsAccountImpl implements AccountService {

	public void depositAmount(SavingsAccount selectAccount) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to Deposit : ");
		double amount = scanner.nextDouble();
		selectAccount.setAccountBalance(selectAccount.getAccountBalance() + amount);
		System.out.println("deposit amount" + "     " + amount + "     " + "account balance" + "     "
				+ selectAccount.getAccountBalance());
	}

	public void withdrawAmount(SavingsAccount selectAccount) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to Deposit : ");
		double amount = scanner.nextDouble();
		selectAccount.setAccountBalance(selectAccount.getAccountBalance() - amount);
		System.out.println("deposit amount" + "     " + amount + "     " + "account balance" + "     "
				+ selectAccount.getAccountBalance());

	}

	public void displayAccount(SavingsMaxAccount sm) {
		// TODO Auto-generated method stub
		System.out.println(sm.getAccountCode() + "" + sm.getAccountName() + "  " + sm.getOpeningDate() + "  "
				+ sm.getExpiryDate() + "   " + sm.getAccountBalance());

	}

	public void displayAccount(WomenSavingsAccount savingsAccount) {
		// TODO Auto-generated method stub
		System.out.println(savingsAccount.getAccountCode() + "" + savingsAccount.getAccountName() + "  "
				+ savingsAccount.getOpeningDate() + "  " + savingsAccount.getExpiryDate() + "   "
				+ savingsAccount.getAccountBalance() + "  " + savingsAccount.getFreeLimit());
	}

	@Override
	public WomenSavingsAccount createAccount1() {
		// TODO Auto-generated method stub
		WomenSavingsAccount savingsAccount = null;
		savingsAccount = new WomenSavingsAccount("WSA001", "Women Savings Account", "Feb 10 2023", " ", 2000, 3);
		return savingsAccount;
	}

	@Override
	public SavingsMaxAccount createAccount2() {
		// TODO Auto-generated method stub
		SavingsMaxAccount savingsAccount = null;
		savingsAccount = new SavingsMaxAccount("SMA001", "Savings Max Account", "Jan 10 2023", " ", 2000);
		return savingsAccount;
	}

}
