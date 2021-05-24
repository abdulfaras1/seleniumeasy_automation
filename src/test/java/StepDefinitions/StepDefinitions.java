package StepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions {

	@Given("^User launches Chrome browser$")
	public void user_launches_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expResult = "FIRST";
		String actResult = "FIRST";
		System.out.println("FIRST");
		assertEquals(expResult, actResult);
		//throw new PendingException();
	}
	@When("^User clicks on the Start Practicing button$")
	public void user_clicks_on_the_start_practicing_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("SECOND");
		//throw new PendingException();
	}
	@Then("^new page loads with new info$")
	public void new_page_loads_with_new_info() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("THIRD");
		//throw new PendingException();
	}

}
