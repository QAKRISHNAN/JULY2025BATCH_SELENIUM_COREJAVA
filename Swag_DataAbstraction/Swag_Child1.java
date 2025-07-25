package Swag_DataAbstraction;

import org.openqa.selenium.By;

public class Swag_Child1 extends Swag_Parent
{

	public void SwagLogin() {
		driver.get("https://www.saucedemo.com/");
		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// Thread.sleep(2000);

		// 6.Enter PassWord
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		// Thread.sleep(2000);

		// 7.Click on Login Button
		driver.findElement(By.id("login-button")).click();
		// Thread.sleep(2000);
		System.out.println("App Login Success");
	}
	
	
	
	

}
