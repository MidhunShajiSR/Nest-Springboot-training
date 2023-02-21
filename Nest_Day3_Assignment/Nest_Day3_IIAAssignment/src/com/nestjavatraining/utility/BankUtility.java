package com.nestjavatraining.utility;

import java.util.Scanner;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.SavingsMaxAccount;
import com.nestjavatraining.entity.WomenSavingsAccount;
import com.nestjavatraining.service.SavingsAccountImpl;

public class BankUtility {

	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		WomenSavingsAccount ws = new WomenSavingsAccount();
		SavingsMaxAccount sm = new SavingsMaxAccount();
		SavingsAccount savingsAccount = null;
		SavingsAccountImpl savingsAccountImpl = new SavingsAccountImpl();
		do {
			System.out.println("Main Menu (1. Create Account   2.Banking)");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1.Women Savings Account 2. Savings Max Account");
				int choice1 = scanner.nextInt();
				switch (choice1) {
				case 1:
					ws = savingsAccountImpl.createAccount1();
					savingsAccount = ws;
					savingsAccountImpl.displayAccount(ws);
					System.out.println();
					System.out.println();
					break;
				case 2:
					sm = savingsAccountImpl.createAccount2();
					savingsAccount = sm;
					savingsAccountImpl.displayAccount(sm);
					break;
				}
			case 2:
				System.out.println("Enter your choice (1.Deposit 2.withdrawal)");
				int choice2 = scanner.nextInt();
				switch (choice2) {
				case 1:
					savingsAccountImpl.depositAmount(savingsAccount);
					break;
				case 2:
					savingsAccountImpl.withdrawAmount(savingsAccount);
					break;
				}
			}
			System.out.println("go to main menu(y/n)");
			ch = scanner.next().charAt(0);
		} while (ch == 'y');
	}

}
