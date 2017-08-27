package com.charles.calculator;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {
	@RequestMapping(value = "/api/math/add",
		method = RequestMethod.POST,
		consumes = MediaType.APPLICATION_JSON_VALUE,
		produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CalculatorResponse add(@RequestBody CalculatorRequest req) {
		double addResult = Double.parseDouble(req.getNum1()) + Double.parseDouble(req.getNum2());
		CalculatorResponse calculatorResponse = new CalculatorResponse(addResult);
		System.out.println("Calling add method, result: "+ calculatorResponse.getResult());
		return calculatorResponse;
	}

	@RequestMapping(value = "/api/math/subtract",
		method = RequestMethod.POST,
		consumes = MediaType.APPLICATION_JSON_VALUE,
		produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CalculatorResponse subtract(@RequestBody CalculatorRequest req) {
		double subtractResult = Double.parseDouble(req.getNum1()) - Double.parseDouble(req.getNum2());
		CalculatorResponse calculatorResponse = new CalculatorResponse(subtractResult);
		System.out.println("Calling add method, result: "+ calculatorResponse.getResult());
		return calculatorResponse;
	}

	@RequestMapping(value = "/api/math/multiply",
		method = RequestMethod.POST,
		consumes = MediaType.APPLICATION_JSON_VALUE,
		produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CalculatorResponse multiply(@RequestBody CalculatorRequest req) {
		double multiplyResult = Double.parseDouble(req.getNum1()) * Double.parseDouble(req.getNum2());
		CalculatorResponse calculatorResponse = new CalculatorResponse(multiplyResult);
		System.out.println("Calling add method, result: "+ calculatorResponse.getResult());
		return calculatorResponse;
	}

	@RequestMapping(value = "/api/math/divide",
		method = RequestMethod.POST,
		consumes = MediaType.APPLICATION_JSON_VALUE,
		produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CalculatorResponse divide(@RequestBody CalculatorRequest req) {
		double divideResult = Double.parseDouble(req.getNum1())/Double.parseDouble(req.getNum2());
		CalculatorResponse calculatorResponse = new CalculatorResponse(divideResult);
		System.out.println("Calling add method, result: "+ calculatorResponse.getResult());
		return calculatorResponse;
	}




}






















