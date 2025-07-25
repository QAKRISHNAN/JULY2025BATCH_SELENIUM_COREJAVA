package Browser_Configuration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla_FireFox {

	public static void main(String[] args) throws InterruptedException {
		// 1.WebDriver Object Creation
		WebDriver driver = new FirefoxDriver();
		// 2.Browser Configuration
		System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM-JULY2025\\geckodriver.exe");
		Thread.sleep(3000);
		// 3.Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// 4.Enter given URL
		driver.get("https://www.amazon.in/");
		Thread.sleep(6000);
		// 5.Close Browser
		driver.close();
		Thread.sleep(3000);

	}

}
