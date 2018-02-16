package trng.spring.mvc.controller;

import java.io.Serializable;

public class Account implements Serializable {
	int accountNumber;
	float balance;
	String accountType;
	float total;
	
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

	public float getTotal() {
		return 4.555f;
	}

	public String getAccountType() {
		return accountType;
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
