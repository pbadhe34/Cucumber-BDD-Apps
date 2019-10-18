package com.test;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:testReports"},
		features = "src/stories",		 
		glue={"com.data"}
		)

public class TestRunner {

}