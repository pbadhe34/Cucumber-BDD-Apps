package com.test;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
//import junit.framework.Assert;

import static org.junit.Assert.*;

public class TestSum  {
	
	private int n1;
	private int n2;
	private int sum;
	
	@Before
	public void init(Scenario scenario) {
		System.out.println("Before scenario in the same pack: " + scenario.getName());
		
		System.out.println("Before scenario status :"+scenario.getStatus());
		
		 
    }

	@After
	public void afterTest(Scenario scenario) {
		System.out.println("After scenario : " + scenario.getName());
		System.out.println("After scenario status :"+scenario.getStatus());
		 
    }
    
	
	@When("^user enters first number$")
	public void getFirstNumber(){
	   n1= 22;
	}

	@When("^user enters second number$")
	public void getSecondNumber(){
	      n2= 23;
	}
	
	@When("^user hits enter key$")	
	public void GteSumByEnterKey(){
		System.out.println("Get the Sum Now");
		sum = n1 + n2;
	    
	}

	@Then("^the sum of two numbers should match$")
	public void verifySum()	{
		
		System.out.println("Verifying the Sum Now");
		// Assert.assertEquals((22 + 23), sum);
		assertEquals(22 + 23, sum);
	     
	}

	
	 
}
