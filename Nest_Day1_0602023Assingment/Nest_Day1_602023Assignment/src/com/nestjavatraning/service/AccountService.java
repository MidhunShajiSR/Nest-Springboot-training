package com.nestjavatraning.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.KidsSavingsAccount;
import com.nestjavatraining.entity.SavingsAccount;

public class AccountService {

	public static Account createAccount() {
		Account account = null;
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Which account you want to open (1.Kids Savings Account 2. Savings Account 2.Farmers Account");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:

			account = new KidsSavingsAccount(100, "Kids Savings Account", 1000);
			System.out.println("Successfull opend kids savings account with opening balance 1000");
			break;
		case 2:
			account = new SavingsAccount(101, "Savings Account", 1000);
			System.out.println("Successfull opend Kids savings account with opening balance 1000");
			break;
		case 3:
			account = new SavingsAccount(102, "Farmers Account", 1000);
			System.out.println("Successfull opend Farmers savings account with opening balance 1000");
			break;
		}
		return account;

	}

	public static void displayAccount(ArrayList<Account> accountList) {
		System.out.println();
		System.out.println("Account Number            Account Name          Account Balance");
		for (Account account : accountList) {
			System.out.println(account.getAccountNo() + "           " + account.getAccountName() + "          "
					+ account.getBalance());
		}
		System.out.println();
	}

	public static void deposit(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to Deposit : ");
		double amount = scanner.nextDouble();
		account.setBalance(account.getBalance() + amount);
		System.out.println(
				"deposit amount" + "     " + amount + "     " + "account balance" + "     " + account.getBalance());

	}

	public static void withdrawal(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to Withdraw : ");
		double amount = scanner.nextDouble();
		account.setBalance(account.getBalance() - amount);
		System.out.println(
				"withdrawl amount" + "    " + amount + "    " + "account balance" + "     " + account.getBalance());
	}
}
