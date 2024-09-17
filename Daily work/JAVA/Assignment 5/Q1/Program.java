package org.Assignment5;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails b = new BankDetails("ABC", 1000.00);
		System.out.println(b.getAccountDetails());
		b.deposit(500.00);
		b.withdraw(300.00);
		System.out.println(b.getAccountDetails());
		
		SavingAccount s = new SavingAccount("XYZ", 2000.00, 500.00);
		System.out.println(s.getAccountDetails());
		s.deposit(300.00);
		s.withdraw(600.00);
		s.withdraw(400.00);
		System.out.println(s.getAccountDetails());
	}

}
