package com.nestjavatraining.utility;

import java.util.Scanner;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.SavingsMaxAccount;
import com.nestjavatraining.entity.WomenSavingsAccount;
import com.nestjavatraining.service.SavingsAccountImpl;

public class BankUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		SavingsAccount savingsAccount = null;
		Account account = null;
		SavingsAccountImpl savingsAccountImpl = new SavingsAccountImpl();
		System.out.println("1. Women Savings Account" + "        " + "1. Savings Max Account");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			savingsAccount = savingsAccountImpl.createAccount(choice);
			customer = savingsAccountImpl.createCustomer(savingsAccount);
			System.out.println("Customer Name" + "     " + "Account Balance");
			System.out
					.println(customer.getCustomerName() + "             " + customer.getAccount().getAccountBalance());
			break;
		case 2:
			savingsAccount = savingsAccountImpl.createAccount(choice);
			customer = savingsAccountImpl.createCustomer(savingsAccount);
			System.out.println("Customer Name" + "     " + "Account Balance");
			System.out
					.println(customer.getCustomerName() + "             " + customer.getAccount().getAccountBalance());
			break;

		default:
			System.out.println("Invalid choice");
		}
	}

}
