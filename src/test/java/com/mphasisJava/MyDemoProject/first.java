package com.mphasisJava.MyDemoProject;


class BankAccount{
	public int balance=0;
	public void deposit(int value) {
		if(value>0) {
			balance+=value;
		}else {
			System.out.println("Deposit cannot be less than 0");
		}
	}
	public void withdraw(int value) {
		 if(balance-value<0) {
			 System.out.println("Sorry! Sincere apologies! We are extremely sorry to inform you that your account has less balance ");
		 }else {
			 balance-=value;
		 }
	 }
}

public  class first{
	
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.deposit(10000);
		b1.withdraw(24689);
		System.out.println(b1.balance);
		
	}
}