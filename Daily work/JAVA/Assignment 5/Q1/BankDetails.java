package org.Assignment5;

public class BankDetails{
	private String holderName;
	private double balance;
	
	public BankDetails(String holderName, double balance) {
		this.holderName = holderName;
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount > 0 ) {
		balance += amount;
		System.out.println("New Balance: " +balance);
		}else {
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("Invalid");
		}
	}
	public double getBalance() {
		return balance;
	}
	public String getAccountDetails() {
		return "Account Holder: " + holderName + "Balance: " + balance;
	}

}
