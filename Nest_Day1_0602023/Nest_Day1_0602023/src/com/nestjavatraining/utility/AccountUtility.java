package com.nestjavatraining.utility;

import java.util.Scanner;

import com.nestjavatraining.entity.Account;
import com.nestjavatraning.service.AccountService;

public class AccountUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountService accountService = new AccountService();

		System.out.println("1. Create Account 2. Display Account");

		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();

		if (choice == 1) {
			Account account = accountService.createAccount();

		} else if (choice == 2) {
			accountService.displayAccount();
		}
	}

}
