package com.ver1;

public class ATM {

	public static void main(String[] args) {
		
		Bank sbi = new Bank(412744765,100000);
		System.out.println("Your Acc no: "+sbi.getAccNo());
		System.out.println("Your Balance: "+sbi.getBalance());
		sbi.Deposit(1000);
		sbi.Withdrawn(12062);
	}

}
