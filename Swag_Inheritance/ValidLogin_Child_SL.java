package Swag_Inheritance;

import org.openqa.selenium.By;

public class ValidLogin_Child_SL extends BrowserConfig_Parent_SL
{
	public void Swag_ValidValid() throws InterruptedException
	{
		// 4.Enter given URL
		//driver.get("https://www.saucedemo.com/");
		//Thread.sleep(2000);

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
	
	public static void main(String[] args) throws InterruptedException
	{
	
		ValidLogin_Child_SL swag=new ValidLogin_Child_SL();
		swag.ChromeBrowser("https://www.saucedemo.com/");
		swag.Swag_ValidValid();
		
	}

}
