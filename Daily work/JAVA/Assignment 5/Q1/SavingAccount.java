package org.Assignment5;

public class SavingAccount extends BankDetails{
	private final double withdraw;
	//private Object withdraw;

	public SavingAccount(String holderName, double balance, double withdraw) {
		//this.withdrawLimit = 0;
		super(holderName, balance);
		this.withdraw = withdraw;
	}
	@Override
	public void withdraw(double amount) {
		if(amount > withdraw) {
			System.out.println("Withdrawal amount exceeds the limit of : " + withdraw);
		}
		else {
			super.withdraw(amount);
		}
	}
	@Override
	public String getAccountDetails() {
		return super.getAccountDetails() + ", limit: " + withdraw;
	}

	
}
