package com.ver1;

public class Bank {
	private long accNo;
	private double balance;

	public Bank(long accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Withdrawn(double amount) {
		if (amount <= balance) {
			
			balance = balance - amount;
			System.out.println(amount+"Amount successfully Withdrawn");
			System.out.println("Balance: "+balance);
		} else {
			System.out.println("Insufficient Balance");
		}
		
	}
	public void Deposit(int amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(amount+" Amount deposited successfully");
			System.out.println("Balance: "+balance);

		
		}
	}

}
