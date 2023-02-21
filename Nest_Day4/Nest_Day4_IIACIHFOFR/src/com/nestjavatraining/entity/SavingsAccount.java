package com.nestjavatraining.entity;

public abstract class SavingsAccount extends Account {

	private double accountBalance;

	public SavingsAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance) {
		super(accountCode, accountName, openingDate, expiryDate);
		this.accountBalance = accountBalance;
		// TODO Auto-generated constructor stub
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountBalance=" + accountBalance + "]";
	}

}
