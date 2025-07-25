package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidUserName_ValidPwd_IfCondition {

	public static void main(String[] args) throws InterruptedException

	{
		// 1.WebDriver Object Creation
		WebDriver driver = new ChromeDriver();

		// 2.Browser Configuration
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		Thread.sleep(3000);

		// 3.Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// 4.Enter given URL
		// driver.get("https://www.saucedemo.com/");
		 driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		String ExceptedURL = "https://www.saucedemo.com/";
		String ActuvalURL = driver.getCurrentUrl();

		if (ExceptedURL.equalsIgnoreCase(ActuvalURL)) // Outer T T/F
		{

			// 5.Enter UserName
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);

			// 6.Enter PassWord
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);

			// 7.Click on Login Button
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);

			String ExceptedURL1 = "https://www.saucedemo.com/inventory.html";
			String ActuvalURL1 = driver.getCurrentUrl();

			if (ExceptedURL1.equalsIgnoreCase(ActuvalURL1)) // Inner T F

			{
				System.out.println("Test Cas Pass");
			}

			else // Inner
			{
				System.out.println("Test  Case Fail");
			}
		} else // Outer
		{
			System.out.println("Smoke Test Fail");
			driver.close();
		}
	}

	// 5.Close Browser
	// driver.close();
	// Thread.sleep(3000);

}
