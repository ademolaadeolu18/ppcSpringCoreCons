package com.model;

public class LoanAccount implements InterestCalculator {

	private int duration;
	private double roi;
	
	public LoanAccount(int duration, double roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}
	public LoanAccount() {
		System.out.println("inside Loan Account");
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*duration/roi;
	}

}
