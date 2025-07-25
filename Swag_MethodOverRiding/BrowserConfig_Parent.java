package Swag_MethodOverRiding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig_Parent 
{
	WebDriver driver;
	public void SwagLogin()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		
	}
	
	public void DriverClose()
	{
		driver.close();
	}
	

}
