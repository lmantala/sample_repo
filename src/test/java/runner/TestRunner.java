package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"stepDefination"},
		plugin = {
				"html:target/cucumber-html-report",
				"pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json",
				"junit:target/cucumber-junit-report.xml"
			}
		)
public class TestRunner {

}
