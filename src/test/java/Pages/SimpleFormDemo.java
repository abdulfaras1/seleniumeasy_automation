package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemo {

	WebDriver driver;

	public SimpleFormDemo(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy (css = "div.container-fluid:nth-child(1) div.row:nth-child(2) nav.navbar.navbar-default div.container div.collapse.navbar-collapse ul.nav.navbar-nav:nth-child(1) li.dropdown.open:nth-child(1) > a.dropdown-toggle") 
	WebElement inputFormsArrow;
	@FindBy (css = "div.container-fluid:nth-child(1) div.row:nth-child(2) nav.navbar.navbar-default div.container div.collapse.navbar-collapse ul.nav.navbar-nav:nth-child(1) li.dropdown.open:nth-child(1) ul.dropdown-menu li:nth-child(1) > a:nth-child(1)")
	WebElement simpleFormDemoLink;
	@FindBy (xpath = "//body/div[@id='easycont']/div[1]/div[2]")
	WebElement enterMessageTextBox;
	@FindBy (xpath = "//button[contains(text(),'Show Message')]")
	WebElement enterMessageButton;

	public void clickOnSimpleFormLink() {
		inputFormsArrow.click();
		simpleFormDemoLink.click();
	}

	public void updateSingleInputFieldClickButton() {
		enterMessageTextBox.clear();
		enterMessageTextBox.sendKeys("Message Updated");
		enterMessageButton.click();
	}
}
