package Utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
//	String appURL = "https://www.seleniumeasy.com/test/";
//	String browserName = "Chrome";

	//public static WebDriver driver;

	public static WebDriver launchAppInBrowser(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
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