
package test.com;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import cucumber.api.Scenario;
import cucumber.api.java8.En;

public class Cucumber_TestLiveServlet implements En {

	private static String url = "http://localhost:8090/WebLoginApp/login";

	HttpURLConnection connection = null;

	public Cucumber_TestLiveServlet() {

		System.out.println("Running the Cucumber_TestLiveServlet Constructor with the Lambda test steps..\n");

		Before((Scenario scenario) -> {
			System.out.println("Before scenario : " + scenario.getName());

		});

		After((Scenario scenario) -> {
			System.out.println("After scenario : " + scenario.getName());
			connection.disconnect();
		});

		// Scenerio 1
		Given("^connect to Servlet URL$", () -> {
			URL loginURL = null;
			try {
				loginURL = new URL(url);
				connection = (HttpURLConnection) loginURL.openConnection();
				connection.setRequestMethod("GET");
				int responseCode = connection.getResponseCode();
				assertEquals(HttpURLConnection.HTTP_OK, responseCode);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		When("^send request with default get method$", () -> {

			URL loginURL = null;

			try {
				loginURL = new URL(url);
				connection = (HttpURLConnection) loginURL.openConnection();
				// connection.setRequestMethod("GET");

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		Then("^verify the http response code$", () -> {

			int responseCode = 0;
			try {
				responseCode = connection.getResponseCode();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			assertEquals(HttpURLConnection.HTTP_OK, responseCode);

		});

		// Scenerio 2
		Given("^connect to Servlet URL with login Parameters$", () -> {
			String parameters = "user=Ashok";
			parameters += "&password=sdfsrsE";
			URL loginURL;
			try {
				loginURL = new URL(url + "?" + parameters);
				connection = (HttpURLConnection) loginURL.openConnection();
				connection.setRequestMethod("GET");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		});

		When("^send request with get method$", () -> {
			try {
				connection.connect();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Then("^verify the get response output$", () -> {
			BufferedReader reader = null;
			String line = null;
			
			try {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				line = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

			assertEquals("We donot expose get method", line);

		});

		// Scenerio 3
		Given("^connect to Servlet URL with post method$", () -> {
			URL loginURL = null;
			try {
				loginURL = new URL(url);
				connection = (HttpURLConnection) loginURL.openConnection();
				  connection.setDoOutput(true);				    
				connection.setRequestMethod("POST");				 
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		When("^send request with post method with in-correct login data$", () -> {
			  String userParam = "user=suresh";
		      userParam+= "&password=invaliDpass";
		      
		      OutputStreamWriter writer = null;
			try {
				writer = new OutputStreamWriter(
				  connection.getOutputStream());
				writer.write(userParam);	      
			      writer.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		});
		 
		Then("^verify the invalid login post response output$", () -> {
			BufferedReader reader = null;
			String line = null;
			try {
				reader = new BufferedReader(new
				          InputStreamReader(connection.getInputStream()));
				 line = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
		     
			assertEquals("Login denied...try again", line);
		});

	 
	
	//Scenerio 3
	When("^send request with post method with correct login data$", () -> {
		  String userParam = "user=viju";
	      userParam+= "&password=SeKreT100";
	      
	      OutputStreamWriter writer = null;
		try {
			writer = new OutputStreamWriter(
			  connection.getOutputStream());
			writer.write(userParam);	      
		      writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	});
	 
	Then("^verify the correct login post response output$", () -> {
		BufferedReader reader = null;
		String line = "";
		String output = null;
		try {
		reader = new BufferedReader(new
			          InputStreamReader(connection.getInputStream()));
			
			while (line != null)
		      {
		        
		         line = reader.readLine();
		         output+=line;
		      }
			 System.out.println(output.trim());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
  
	     String resultExpected = "null<h1>Welcome  :  viju</h1><p></p><br>"
	     		+ "</br> <div id='account_logout'><a href='./LoginPage.html'"
	     		+ "id='quitUser' >LogOut</a></div>null";
	     
		assertEquals(resultExpected, output);
	});

}


}
