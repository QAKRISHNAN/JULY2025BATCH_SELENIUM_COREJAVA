package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLogin_WOPWOR 
{

	//Without ReturnType and Without Parameters
	public void SL_VUVP() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");

		driver.manage().window().maximize();

		// 4.Enter given URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

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
	
	//
	public void SL_IVUVP() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");

		driver.manage().window().maximize();

		// 4.Enter given URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys("dfjhsdkjf");
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
	
		SwagLogin_WOPWOR WOPWOR=new SwagLogin_WOPWOR();
		WOPWOR.SL_VUVP();
		WOPWOR.SL_IVUVP();
		
		
	}

}
