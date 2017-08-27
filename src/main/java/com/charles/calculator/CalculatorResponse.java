package com.charles.calculator;


public class CalculatorResponse {
	private Object result;

	public CalculatorResponse(Object result) {
		this.result = result;
	}

	public Object getResult(){
		return result;
	}
}