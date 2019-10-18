package com.steps;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class Test_REST_Get implements En {	 
	
	
	private HttpURLConnection connection;
	private URL restURL = null;
	
	public Test_REST_Get(){
		
		/*Before((Scenario scenario) -> {
			System.out.println("Before scenario : " + scenario.getName());
			try {
				restURL = new URL("http://localhost:8090/UserApp/rs/users/getData?request=uu");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});*/
		
		Before(new String[]{"@GetTest"}, (Scenario scenario) -> {
			 System.out.println("Before @GetTest");
			 System.out.println("Before scenario : " + scenario.getName());
				try {
					restURL = new URL("http://localhost:8090/UserApp/rs/users/getData?request=uu");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 });

		/*After((Scenario scenario) -> {
			System.out.println("After scenario : " + scenario.getName());
			connection.disconnect();
			restURL = null;
		});*/
		
		After(new String[]{"@GetTest"}, (Scenario scenario) -> {
			System.out.println("After scenario : " + scenario.getName());
			connection.disconnect();
			restURL = null;
	    });

	Given("^connect to REST GET URL$", () -> {
		try {
			System.out.println("Opening connection..");
			connection = (HttpURLConnection) restURL.openConnection();
			System.out.println("Connected..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	});

	When("^send get request$", () -> {
		try {
			connection.setRequestMethod("GET");
			connection.connect();
			System.out.println("Connection done");
			
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	});
	
	Then("^verify the get http response code$", () -> {
		int responseCode=0;
		try {
			responseCode = connection.getResponseCode();
			System.out.println("Verifying httpResponse..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(HttpURLConnection.HTTP_OK, responseCode);
  
	});

	Then("^verify the get output$", () -> {
		System.out.println("Verifying the get output..");
		BufferedReader reader = null;
		String line = null;
		String output = "";
		try {
			reader = new BufferedReader(new
			          InputStreamReader(connection.getInputStream()));			   
			  
			 line = reader.readLine();
		      /*while (line != null)
		      {
		         System.out.println(line);
		         line = reader.readLine();
		         output+=line;
		      }*/
		      System.out.println("The line read is "+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  assertEquals("This is response for you from space", line);     

	    
	});
	}
}
	
	 

	 

		 


