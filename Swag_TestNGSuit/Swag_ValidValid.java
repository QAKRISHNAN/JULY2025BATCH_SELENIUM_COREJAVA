package Swag_TestNGSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swag_ValidValid {

	// Valid Valid
	WebDriver driver;

	@Test(priority = 1)
	public void BrowserOpen() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void Swag_ValidValidLogin() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);

		// 6.Enter PassWord
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		// 7.Click on Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void BrowserClose() {
		driver.close();
	}
}
