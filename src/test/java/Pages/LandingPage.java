package Pages;

//this is the main PAGE OBJECT MODEL for this framework

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(id = "btn_basic_example") WebElement startPracticeButton;
	@FindBy(id= "at-cv-lightbox-close") WebElement bannerCloseButton;
	
	public void clickStartPracticingButton()
	{
		bannerCloseButton.click();
		startPracticeButton.click();
	}
}
