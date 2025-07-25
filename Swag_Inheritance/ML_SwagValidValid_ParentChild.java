package Swag_Inheritance;

import org.openqa.selenium.By;

public class ML_SwagValidValid_ParentChild extends ML_BrowserConfig_Parent
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

	}
	
}
