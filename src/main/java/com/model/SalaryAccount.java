package com.model;

public class SalaryAccount implements InterestCalculator {

	private int duration;
	private double roi;
	
	public SalaryAccount(int duration, double roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}
	public SalaryAccount() {
		System.out.println("inside Salary Account");
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*duration/roi;
	}
	

}
