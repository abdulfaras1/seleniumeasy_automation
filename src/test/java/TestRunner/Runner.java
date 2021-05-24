package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//tags="@LandingPage", "@SimpleFormDemoPage",
		features = {"./src/test/resources/features"},
		glue = {"StepDefinitions"},
				plugin = {"pretty"})
public class Runner {

}