package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwagValidTestCase
{
	/*	Test Steps:
		Step1:Open Chrome/Mozilla/Edge Browser
		Step2:Enter Valid URL[Given by DevTeam]
		Step3:Enter Valid UserName 
		Step4:Enter Valid Password
		Step5:Click on Login Button
		Step6:Observe actuval behaviour of app.

		Test Data:
		URL:https://www.saucedemo.com/
		UserName:standard_user
		Password:secret_sauce
		*/
	//@Test
	//public void Swag()
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		//Step1:Open Chrome/Mozilla/Edge Browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Step2:Enter Valid URL[Given by DevTeam]
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		//Step3:Enter Valid UserName 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		//Step4:Enter Valid Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		//Step5:Click on Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);	
	}

}
