@TestRest
Feature: Test the REST API from server
 
 @GetTest
  Scenario: Verify the output with get     
     Given connect to REST GET URL
     When send get request	
     Then verify the get http response code	 
	 And verify the get output

 @PostTest	 
 Scenario: verify with  post new data
     Given connect to REST POST URL
	 When send post request	 
	 Then verify the post http response code
	 And verify the post output
    
@PutTest
Scenario: Verify the output with PUT     
     Given connect to REST PUT URL
     When send put request	
     Then verify the put http response code	 
	 And verify the put output
	 
@DeleteTest
Scenario: Verify the output with Delete     
     Given connect to REST delete URL
     When send delete request	
     Then verify the delete http response code	 
	 And verify the delete output
    