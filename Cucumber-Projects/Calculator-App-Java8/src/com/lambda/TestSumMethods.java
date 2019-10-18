package com.lambda;

import cucumber.api.java8.En;

public class TestSumMethods implements En {
	
	public  void testSumMethods(){
	
		System.out.println("Running the TestSumMethods Methods Tests..\n");
		 
		When("^user enters first number$", () -> {
			 System.out.println("The first nmumber is ");
		});
	
		When("^user enters second number$", () -> {
		     
		});
	
		When("^user hits enter key$", () -> {
		     
		});
	
		Then("^the sum of two numbers should be displayed$", () -> {
		    
		});
	}

}
