package com.nestjavatraining.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.nestjavatraining.comparater.AgeComparator;
import com.nestjavatraining.comparater.NameComparator;
import com.nestjavatraining.entity.Customer;

public class SortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sortingParameter = "";
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("Midhun", 10));
		customerList.add(new Customer("Rahul", 12));
		customerList.add(new Customer("Sandeep", 8));
		customerList.add(new Customer("Abhiram", 11));
		customerList.add(new Customer("Bibin", 13));
		char ch;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("");
			System.out.println("1. Sort Based On Name, 2. Sort Based On Age");
			int choice = scanner.nextInt();
			// String sortingParameter="";
			switch (choice) {
			case 1:
				Collections.sort(customerList, new NameComparator());
				sortingParameter = "custemer list after sort by name ";
				break;
			case 2:
				Collections.sort(customerList, new AgeComparator());
				sortingParameter = "custemer list after sort by age ";
				break;
			}
			System.out.println(sortingParameter);
			System.out.println("Customer Name" + "      " + "Customer Age");
			for (Customer customer : customerList)
				System.out.println(customer.getCustomerName() + "                   " + customer.getCustomerAge());
			System.out.println("");
			System.out.println("Do you want to continue (y/n)");
			ch = scanner.next().charAt(0);

		} while (ch == 'y');

	}

}
