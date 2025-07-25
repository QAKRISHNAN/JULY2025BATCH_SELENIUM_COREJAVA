package Swag_Inheritance;

import org.openqa.selenium.By;

public class HI_SwagValidValid_Child1 extends HI_ChromeBrowserConfig_Parent
{

	public void Swag_ValidValid(String UserName,String Password) throws InterruptedException
	{

		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		Thread.sleep(2000);

		// 6.Enter PassWord
		driver.findElement(By.id("password")).sendKeys(Password);
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
		driver.close();
	}
}
