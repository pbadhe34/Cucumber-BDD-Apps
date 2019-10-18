package stepDefinition;

import org.junit.internal.runners.statements.Fail;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import junit.framework.Assert;

public class TestSum implements En {
	
	public TestSum(){
	
		System.out.println("Running the TestSum Constructor in the same package test..\n");
		
		Before((Scenario scenario) -> {
			System.out.println("Before scenario : " + scenario.getName());
			 
        });

        After((Scenario scenario) -> {
        	System.out.println("After scenario : " + scenario.getName());
        });
		 
		When("^user enters first number$", () -> {
			 System.out.println("The first nmumber is given");
		});
	
		When("^user enters second number$", () -> {
			 System.out.println("The second nmumber is given");
		});
	
		When("^user hits enter key$", () -> {
			 System.out.println("The uzser hits enter key");
		});
	
		Then("^the sum of two numbers should be displayed$", () -> {
			 System.out.println("The sum is produced");
			//Assert.assertTrue(false);
			  
		});
	}

}
