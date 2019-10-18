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
  "line": 21,
  "name": "Login and logOut Action",
  "description": "",
  "id": "login-and-logout-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@UserLoginApp"
    }
  ]
});
formatter.before({
  "duration": 3825255781,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Successful Login and with Valid Credentials and logout",
  "description": "",
  "id": "login-and-logout-action;successful-login-and-with-valid-credentials-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber_Selenium_steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 97512293,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 835868492,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 507409150,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 283709,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 115681975,
  "status": "passed"
});
formatter.match({
  "location": "Cucumber_Selenium_steps.message_displayed_LogOut_Successfully()"
});
formatter.result({
  "duration": 114716,
  "status": "passed"
});
formatter.after({
  "duration": 2986152932,
  "status": "passed"
});
});