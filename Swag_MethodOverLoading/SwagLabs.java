package Swag_MethodOverLoading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
	WebDriver driver;

	
	public void SwagLogin() {
		driver.close();

	}
	
	public void SwagLogin(String url) {

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get(url);

	}

	public void SwagLogin(String UserName, String Pwd) throws InterruptedException {
		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		Thread.sleep(2000);

		// 6.Enter PassWord
		driver.findElement(By.id("password")).sendKeys(Pwd);
		Thread.sleep(2000);

		// 7.Click on Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);


	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		SwagLabs swag=new SwagLabs();
		swag.SwagLogin("https://www.saucedemo.com/");
		swag.SwagLogin("standard_user", "secret_sauce");
		swag.SwagLogin();
		
	}
}
