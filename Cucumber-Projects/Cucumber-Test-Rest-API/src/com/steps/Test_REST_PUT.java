package com.steps;


import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.json.JSONObject;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class Test_REST_PUT implements En{
	
	private HttpURLConnection connection;
	private URL restURL = null;
	
	public Test_REST_PUT(){	
		
		
		Before(new String[]{"@PutTest"}, (Scenario scenario) -> {
			 System.out.println("Before @PutTest");
			  
		 });
		
		After(new String[]{"@PutTest"}, (Scenario scenario) -> {
			System.out.println("After scenario : " + scenario.getName());
			 
	    });
		
		Given("^connect to REST PUT URL$", () -> {
		     
		});

		When("^send put request$", () -> {
		    
		});

		Then("^verify the put http response code$", () -> {
		    
		});

		Then("^verify the put output$", () -> {
		     
		});

	
	}
}
