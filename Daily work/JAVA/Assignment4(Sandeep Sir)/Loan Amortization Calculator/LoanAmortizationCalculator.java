package com.assignment4;

public class LoanAmortizationCalculator {
	private double principal;
	private double annualInterestRate;
	private int loanTerm;
	
	public LoanAmortizationCalculator() {
		this(0.0,0.0,0);
	}
	
	public LoanAmortizationCalculator(double principal,double annualInterestRate) {
		this(principal,annualInterestRate,0);
	}
	public LoanAmortizationCalculator(double principal,double annualInterestRate,int loanTeram) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.loanTerm = loanTeram;
	}
	
	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getLoanTeram() {
		return loanTerm;
	}

	public void setLoanTeram(int loanTeram) {
		this.loanTerm = loanTerm;
	}
	
	public double calculateMonthyPayment() {
		double monthlyInterestRate = annualInterestRate / 10/ 100;
		int numberOfMonths = loanTerm *12;
		if(monthlyInterestRate == 0) {
			return principal / numberOfMonths;
		}
		return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
				(Math.pow(monthlyInterestRate, numberOfMonths) - 1);
	}
	public double calculateTotalAmountPaid() {
		return calculateMonthyPayment() * loanTerm * 12;
		}
	
	@Override
	public String toString() {
		return String.format("Principal Amount: ₹%.2f\nAnnual Interest Rate: %.2f%%\nLoan Term: %d years",
		principal, annualInterestRate, loanTerm);
		}

}
