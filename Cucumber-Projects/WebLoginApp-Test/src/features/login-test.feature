 Feature: Test the Login Servlet

  Scenario: Verify the servlet URL     
     Given connect to Servlet URL 
     When send request with default get method 
	 Then verify the http response code	 
 
  Scenario: Verify the login response with get     
     Given connect to Servlet URL with login Parameters
     When send request with get method 
	 Then verify the http response code
	 And verify the get response output
	 
 Scenario: verify response by post method with in-correct login data
     Given connect to Servlet URL with post method  
	 When send request with post method with in-correct login data
	 Then verify the http response code
	 And verify the invalid login post response output
	 
Scenario: verify response by post method with correct login data
     Given connect to Servlet URL with post method  
	 When send request with post method with correct login data
	 Then verify the http response code
	 And verify the correct login post response output
    
