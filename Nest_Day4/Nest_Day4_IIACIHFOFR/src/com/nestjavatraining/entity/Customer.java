package com.nestjavatraining.entity;

public class Customer {

	private String accountCode;
	private String customerName;
	private SavingsAccount savingsAccount;

	public Customer(String accountCode, String customerName, SavingsAccount savingsAccount) {
		super();
		this.accountCode = accountCode;
		this.customerName = customerName;
		this.savingsAccount = savingsAccount;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public SavingsAccount getAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

}
