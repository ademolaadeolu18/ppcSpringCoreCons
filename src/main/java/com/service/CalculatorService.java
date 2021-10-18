package com.service;

import com.model.InterestCalculator;


public class CalculatorService {

	private InterestCalculator ic;

	
	public CalculatorService(InterestCalculator ic) {
		super();
		this.ic = ic;
	}


	public double service(double amount) {
		return ic.calculate(amount);
	}
}
