package com.data;

import com.Belly;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	
	@Before
	public void beforeScenario() {
		System.out.println("beforeScenario");
	}

	@After
	public void afterScenario() {
		System.out.println("afterScenario");
	}
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
    	System.out.println("Stepdefs.I_have_cukes_in_my_belly() test");
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("waiting for "+arg1);
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	 System.out.println("The belly is growing ");
    }
}
