package com.test;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class CucumberRun implements En  {
	
	public CucumberRun() {
		
	When("^user enters first number$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	});

	When("^user enters second number$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	});

	When("^user hits enter key$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	});

	Then("^the sum of two numbers should be displayed$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new RuntimeException();
	});
	}


}
