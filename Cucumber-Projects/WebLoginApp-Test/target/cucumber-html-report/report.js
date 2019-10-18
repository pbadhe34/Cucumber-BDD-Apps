$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login-test.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Login Servlet",
  "description": "",
  "id": "test-the-login-servlet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 175925,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the servlet URL",
  "description": "",
  "id": "test-the-login-servlet;verify-the-servlet-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "connect to Servlet URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "send request with default get method",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify the http response code",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:38"
});
formatter.result({
  "duration": 188465588,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:55"
});
formatter.result({
  "duration": 148208,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:74"
});
formatter.result({
  "duration": 2140351,
  "status": "passed"
});
formatter.after({
  "duration": 1915537,
  "status": "passed"
});
formatter.before({
  "duration": 87769,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify the login response with get",
  "description": "",
  "id": "test-the-login-servlet;verify-the-login-response-with-get",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "connect to Servlet URL with login Parameters",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "send request with get method",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify the http response code",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify the get response output",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:89"
});
formatter.result({
  "duration": 250991,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:108"
});
formatter.result({
  "duration": 1121375,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:74"
});
formatter.result({
  "duration": 2370939,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:116"
});
formatter.result({
  "duration": 329136,
  "status": "passed"
});
formatter.after({
  "duration": 196327,
  "status": "passed"
});
formatter.before({
  "duration": 75836,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "verify response by post method with in-correct login data",
  "description": "",
  "id": "test-the-login-servlet;verify-response-by-post-method-with-in-correct-login-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "connect to Servlet URL with post method",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "send request with post method with in-correct login data",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "verify the http response code",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify the invalid login post response output",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:134"
});
formatter.result({
  "duration": 181699,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:150"
});
formatter.result({
  "duration": 1624511,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:74"
});
formatter.result({
  "duration": 2224656,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:167"
});
formatter.result({
  "duration": 195557,
  "status": "passed"
});
formatter.after({
  "duration": 157062,
  "status": "passed"
});
formatter.before({
  "duration": 66597,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "verify response by post method with correct login data",
  "description": "",
  "id": "test-the-login-servlet;verify-response-by-post-method-with-correct-login-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "connect to Servlet URL with post method",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "send request with post method with correct login data",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "verify the http response code",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "verify the correct login post response output",
  "keyword": "And "
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:134"
});
formatter.result({
  "duration": 123186,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:186"
});
formatter.result({
  "duration": 1050158,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:74"
});
formatter.result({
  "duration": 4783453,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_TestLiveServlet.java:203"
});
formatter.result({
  "duration": 2492199,
  "status": "passed"
});
formatter.after({
  "duration": 256765,
  "status": "passed"
});
});