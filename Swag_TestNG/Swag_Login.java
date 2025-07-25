package Swag_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swag_Login {
	WebDriver driver;
	
	//Valid Valid
	@Test(priority=1)
	public void Swag_ValidValid() throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
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
		//Valid InValid
	@Test(priority=2)
	public void Swag_ValidInValid() throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);

		// 6.Enter PassWord
		driver.findElement(By.id("password")).sendKeys("dashgadsh");
		Thread.sleep(2000);

		// 7.Click on Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

	}
			//InValid Valid
	//@Test(priority=3 ,invocationCount=3)
	@Test(priority=3)
	public void Swag_InValidValid() throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys("vhfjh");
		Thread.sleep(2000);

		// 6.Enter PassWord
		driver.findElement(By.id("passwor")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		// 7.Click on Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

	}
	//InValid InValid
	
	@Test(priority=4)
	public void Swag_InValidInValid() throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys("dsgsd");
		Thread.sleep(2000);

		// 6.Enter PassWord
		driver.findElement(By.id("passwor")).sendKeys("23534");
		Thread.sleep(2000);

		// 7.Click on Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

	}
}
