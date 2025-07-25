package Swag_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

interface BrowserOpen
{
	public abstract void ChromBrowserOpen();
}

interface Login
{
	public void ValidLogin(String UserName,String Pwd) throws InterruptedException;
}

interface BrowserClose
{
	public void ChromBrowserClose();
}

public class Swag_Login implements BrowserOpen,Login,BrowserClose
{
	WebDriver driver;
	public void ChromBrowserOpen()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
	}
	public void ValidLogin(String UserName,String Pwd) throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
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
	public void ChromBrowserClose()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException
	{
		Swag_Login swag=new Swag_Login();
		swag.ChromBrowserOpen();
		swag.ValidLogin("standard_user","secret_sauce");
		swag.ValidLogin("zdgd","23523");
		swag.ValidLogin("","23523");
		swag.ValidLogin("zdgd","");
		swag.ChromBrowserClose();
		
	}
}
