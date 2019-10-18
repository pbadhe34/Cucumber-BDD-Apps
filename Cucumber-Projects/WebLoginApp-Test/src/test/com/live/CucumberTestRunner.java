
package test.com.live;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = { "html:target/cucumber-html-report",
		"json:target/cucumber-json-report.json" }, features = "src/features", glue = { "test.com" })

public class CucumberTestRunner {

}