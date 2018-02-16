package trng.spring.mvc.controller;

import java.io.Serializable;

public class Account implements Serializable {
	int accountNumber;
	float balance;
	String accountType;
	String total;
	
	public Account() {
		super();
	}

	public Account(int accountNumber, float balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}
	
	public String total() {
		return "total is total";	
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType
				+ "]";
	}

}
