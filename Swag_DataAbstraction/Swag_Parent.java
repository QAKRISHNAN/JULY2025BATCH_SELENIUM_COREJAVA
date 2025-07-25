package Swag_DataAbstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Swag_Parent 
{

	public abstract void SwagLogin();
	
	WebDriver driver;
	public void BrowserConfig()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		System.out.println("Browser Opened");
		
	}
	public void DriverClose()
	{
		driver.close();
		System.out.println("Browser Closed");
	}
}
