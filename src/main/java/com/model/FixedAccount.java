package com.model;

public class FixedAccount implements InterestCalculator {

	private int duration;
	private double roi;
	
	public FixedAccount(int duration, double roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}
	public FixedAccount() {
		System.out.println("inside FDA");
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*duration/roi;
	}

	
	
}
