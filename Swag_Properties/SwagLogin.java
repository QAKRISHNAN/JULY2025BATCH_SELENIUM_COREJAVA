package Swag_Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLogin 
{
	WebDriver driver;
	@Test
	public void SwagLoginProperties() throws InterruptedException, IOException
	{
		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SELENIUM_JULY2025/Drivers/chromedriver.exe");
		driver.manage().window().maximize();
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("/SELENIUM_JULY2025/src/Swag_Properties/SwagTestData.properties");
		prop.load(fis);
		
		Thread.sleep(2000);
		driver.get(prop.getProperty("url"));
		// 5.Enter UserName
		driver.findElement(By.id(prop.getProperty("UserNameL"))).sendKeys(prop.getProperty("UserName"));
		Thread.sleep(2000);


		// 6.Enter PassWord
		driver.findElement(By.id(prop.getProperty("PasswordL"))).sendKeys(prop.getProperty("Password"));
		Thread.sleep(2000);

		// 7.Click on Login Button
		driver.findElement(By.id(prop.getProperty("LoginButtonL"))).click();
		Thread.sleep(2000);
		
	}

}
