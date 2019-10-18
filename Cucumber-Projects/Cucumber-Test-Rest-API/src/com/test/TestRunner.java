package com.test;

 

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:testReport"},
		features = "src/features"
		,glue={"com.steps"}
		)

public class TestRunner {

}