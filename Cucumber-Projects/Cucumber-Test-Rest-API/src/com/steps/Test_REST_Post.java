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

public class Test_REST_Post implements En{
	
	private HttpURLConnection connection;
	private URL restURL = null;
	
	public Test_REST_Post(){	
		
		
		Before(new String[]{"@PostTest"}, (Scenario scenario) -> {
			 System.out.println("Before @PostTest");
			 System.out.println("Before scenario : " + scenario.getName());
				try {
					restURL = new URL("http://localhost:8090/UserApp/rs/users/add");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 });
		
		After(new String[]{"@PostTest"}, (Scenario scenario) -> {
			System.out.println("After scenario : " + scenario.getName());
			connection.disconnect();
			restURL = null;
	    });
	
	Given("^connect to REST POST URL$", () -> {
		System.out.println("Opening connection..");
		try {
			connection = (HttpURLConnection) restURL.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected..");
	});

	When("^send post request$", () -> {
		try {
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");		 

			//connection.connect();
			System.out.println("Connection done");
			OutputStream os = connection.getOutputStream();
			
			 //we can also use json translator
			  JSONObject obj = new JSONObject(); 
			  obj.put("addrerss", "Mumbai");
			  obj.put("num", 4536); 
			  obj.put("name", "Ramarao"); 
			  
			  String dataJson = obj.toString();			 
			 
			os.write(dataJson.getBytes());
			 
			os.flush();
			System.out.println("The object push done in post method ");
					 

			
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});

	Then("^verify the post output$", () -> {
		BufferedReader br= null;
		String output  = "";
		try {
			br = new BufferedReader(new InputStreamReader(
					(connection.getInputStream())));
			output =br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		System.out.println("Output from the post request .... \n"+output);
		assertEquals("user is added with name = Ramarao", output);
		 


	});
	
	 

	Then("^verify the post http response code$", () -> {
		int responseCode=0;
		try {
			responseCode = connection.getResponseCode();
			System.out.println("Verifying post httpResponse..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(HttpURLConnection.HTTP_OK, responseCode);
  
	});

	}
}
