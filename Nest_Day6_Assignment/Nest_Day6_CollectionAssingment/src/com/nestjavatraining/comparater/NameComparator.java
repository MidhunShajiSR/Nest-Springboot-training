package com.nestjavatraining.comparater;

import java.util.Comparator;

import com.nestjavatraining.entity.Customer;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getCustomerName().compareTo(o2.getCustomerName());
	}

}
