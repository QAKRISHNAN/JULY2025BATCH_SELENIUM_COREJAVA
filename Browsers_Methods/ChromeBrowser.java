package Browsers_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	 
	public WebDriver ChromeBrowser_Config() {
		// 1.WebDriver Object Creation
		WebDriver driver = new ChromeDriver();
		// 2.Browser Configuration
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		// 3.Maximize the Browser
		driver.manage().window().maximize();
		return driver;
		
	}
}
