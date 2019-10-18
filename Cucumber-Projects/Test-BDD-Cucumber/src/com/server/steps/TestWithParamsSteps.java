package com.server.steps;
import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import cucumber.runtime.junit.Assertions;

public class TestWithParamsSteps implements En {
	private int data;
	
	public TestWithParamsSteps() { //start of constructor

		Given("^User opens the application with \"([^\"]*)\" message$", (String arg1) -> {
		   System.out.println("The opening messages is "+arg1);
		});

		When("^User enter number (\\d+) to get squareroot$", (Integer value) -> {
			System.out.println("The number passed is "+value.intValue());
			data = value.intValue();
		});

		Then("^The matching squareRoot value (\\d+) should be displayed$", (Integer result) -> {
			System.out.println("The expected value is "+result.intValue());
			int res = (int) Math.sqrt(data);
			Assert.assertEquals(result.intValue(), res);
		});

}}

	/*private void Then(String string, Object object) {
		// TODO Auto-generated method stub
		
	}

	private void When(String string, Object object) {
		// TODO Auto-generated method stub
		
	}} */
