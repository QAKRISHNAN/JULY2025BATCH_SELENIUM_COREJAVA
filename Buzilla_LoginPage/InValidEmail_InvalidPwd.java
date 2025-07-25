package Buzilla_LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InValidEmail_InvalidPwd 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM-JULY2025\\geckodriver.exe");
		
		driver.manage().window().maximize();
		
		driver.get("https://bugs.documentfoundation.org");
		Thread.sleep(2000);
		
		//Click on LogIn Link 
		//WebElement LogInLink=driver.findElement(By.id("login_link_top"));
		//WebElement LogInLink=driver.findElement(By.linkText("Log In"));
		
		WebElement LogInLink=driver.findElement(By.partialLinkText("Log I"));
		LogInLink.click();
		Thread.sleep(2000);
		
		WebElement EmailAddress=driver.findElement(By.name("Bugzilla_login"));
		EmailAddress.sendKeys("Krishna@123.com");
		Thread.sleep(2000);
		
		WebElement Password=driver.findElement(By.className("bz_password"));
		Password.sendKeys("23243432");
		Thread.sleep(2000);
		
		WebElement LogIn=driver.findElement(By.id("log_in_top"));
		LogIn.click();
	}

}
