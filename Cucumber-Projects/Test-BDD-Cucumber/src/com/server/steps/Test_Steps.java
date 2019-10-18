package com.server.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	@Given("^User opens the application$")
	public void openApplication(){
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User opens the application");
	}
	
	@When("^User enter number to get squareroot$")
	public void enterNumberValue()
	{
		 System.out.println("User enters the number value");
	}
	/*When("^User enter number to get squareroot$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}); */
		 
	@Then("^The matching squareRoot value should be displayed$")
	public void verifySquareRoot()
	{
     System.out.println("in the verify square root");
	}
	

	/*Then("^The matching squareRoot value should be displayed$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}); */

}
