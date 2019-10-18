$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login-Test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login and logOut Action",
  "description": "",
  "id": "login-and-logout-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Successful Login and with Valid Credentials and logout",
  "description": "",
  "id": "login-and-logout-action;successful-login-and-with-valid-credentials-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber_Selenium_steps.user_is_on_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.user_enters_UserName_and_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.user_LogOut_from_the_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.message_displayed_LogOut_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("sum.feature");
formatter.feature({
  "line": 1,
  "name": "SUM of two numbers",
  "description": "",
  "id": "sum-of-two-numbers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get The sum of two numbers",
  "description": "",
  "id": "sum-of-two-numbers;get-the-sum-of-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user enters first number",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters second number",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user hits enter key",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the sum of two numbers should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSum.java:24"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSum.java:28"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSum.java:32"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSum.java:36"
});
formatter.result({
  "status": "skipped"
});
});