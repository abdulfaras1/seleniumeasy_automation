package Utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
	public static WebDriver launchAppInBrowser(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chromer.driver", "./drivers/chromedriver.exe");
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.ghecko.driver", "./drivers/geckodriver.exe");
		} else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		} else {
			System.out.println("This browser is not supported yet");
		}
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(appURL); // hitting the url here

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
}