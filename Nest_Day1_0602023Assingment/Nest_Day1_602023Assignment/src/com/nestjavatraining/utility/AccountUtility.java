package com.nestjavatraining.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.nestjavatraning.service.AccountService;
import com.nestjavatraining.entity.Account;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();

		do {
			System.out.println("1. Create Account 2. Display Account 3.Banking");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				do {
					accountList.add(AccountService.createAccount());
					System.out.println("continue (y/n)");
					ch = scanner.next().charAt(0);
				} while (ch == 'y');
				break;
			case 2:
				AccountService.displayAccount(accountList);
				break;
			case 3:
				Account selectAccount = null;
				System.out.println("Enter the choice (1.Deposit 2.withdrawal)");
				int bank = scanner.nextInt();
				System.out.println("**********Account Details*********");
				AccountService.displayAccount(accountList);
				scanner.nextLine();
				System.out.println("**********Account Details*********");
				System.out.println("");
				System.out.println("Enter the account number : ");
				int accountNumber = scanner.nextInt();

				for (Account account : accountList) {
					if (account.getAccountNo() == accountNumber) {
						selectAccount = account;

					}
				}
				switch (bank) {
				case 1:
					AccountService.deposit(selectAccount);
					break;

				case 2:
					AccountService.withdrawal(selectAccount);
					break;
				}
				break;

			}

			System.out.println("Go to Main Menu y/n");
			ch = scanner.next().charAt(0);
		} while (ch == 'y');

	}

}
