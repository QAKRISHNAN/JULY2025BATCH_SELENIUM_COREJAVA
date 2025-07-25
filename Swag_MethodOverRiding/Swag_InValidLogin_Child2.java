package Swag_MethodOverRiding;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_InValidLogin_Child2 extends BrowserConfig_Parent
{
	public void SwagLogin() 
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys("sdhsr");
		//Thread.sleep(2000);

		// 6.Enter PassWord
		driver.findElement(By.id("password")).sendKeys("431232");
		//Thread.sleep(2000);

		// 7.Click on Login Button
		driver.findElement(By.id("login-button")).click();
		//Thread.sleep(2000);

	}
}
