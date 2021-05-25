package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LandingPage;
import Pages.SimpleFormDemo;
import Utilities.BrowserFactory;
//import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions {
	
	WebDriver driver;

	@Given("^User launches Chrome browser$")
	public void user_launches_chrome_browser() throws Throwable {
		String expResult = "FIRST";
		String actResult = "FIRST";
		assertEquals(expResult, actResult);
		driver = BrowserFactory.launchAppInBrowser(driver, "Chrome", "https://www.seleniumeasy.com/test/");
		//throw new io.cucumber.java.PendingException();
	}
	@When("^User clicks on the Start Practicing button$")
	public void user_clicks_on_the_start_practicing_button() throws Throwable {
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.clickStartPracticingButton();
		//throw new io.cucumber.java.PendingException();
	}
	@Then("^new page loads with new info$")
	public void new_page_loads_with_new_info() throws Throwable {
		//BrowserFactory.closeBrowser(driver);
		//throw new io.cucumber.java.PendingException();
	}
	
	@Given("User clicks on Simple Form Demo link")
	public void user_clicks_on_simple_form_demo_link() throws Throwable {
		SimpleFormDemo simpleFormDemo = PageFactory.initElements(driver, SimpleFormDemo.class);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		simpleFormDemo.clickOnSimpleFormLink();
	}
	
	@Given("User enters message in the text box and clicks on Show Message button")
	public void user_enters_message_in_the_text_box_and_clicks_on_show_message_button() throws Throwable {
		SimpleFormDemo simpleFormDemo = PageFactory.initElements(driver, SimpleFormDemo.class);
		simpleFormDemo.updateSingleInputFieldClickButton();
	}

}
