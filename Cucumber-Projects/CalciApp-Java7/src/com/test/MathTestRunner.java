

 package com.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:testReport"},
		features = "src/stories"
		,glue={"com.sum.test"}
		)

public class MathTestRunner {

}