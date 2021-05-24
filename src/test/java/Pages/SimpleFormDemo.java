package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemo {

	WebDriver driver;

	public SimpleFormDemo(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(css = "div.container-fluid.text-center:nth-child(3) div.row div.col-md-6.text-left:nth-child(2) div.row div.board div.tab-content div.tab-pane.fade.active.in:nth-child(2) div.list-group:nth-child(4) > a.list-group-item:nth-child(1)")
	WebElement simpleFormDemoLink;
	@FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[2]")
	WebElement enterMessageTextBox;
	@FindBy(xpath = "//button[contains(text(),'Show Message')]")
	WebElement enterMessageButton;

	public void clickOnSimpleFormLink() {
		simpleFormDemoLink.submit();
	}

	public void updateSingleInputFieldClickButton() {
		enterMessageTextBox.clear();
		enterMessageTextBox.sendKeys("Message Updated");
		enterMessageButton.click();
	}
}
