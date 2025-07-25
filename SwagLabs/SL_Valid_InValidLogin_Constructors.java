package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SL_Valid_InValidLogin_Constructors
{
	//Parameterized Constructor
	public SL_Valid_InValidLogin_Constructors(String UserName,String Password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");

		driver.manage().window().maximize();

		// 4.Enter given URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);

		// 5.Enter UserName
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		Thread.sleep(1000);

		// 6.Enter PassWord
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(1000);

		// 7.Click on Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		SL_Valid_InValidLogin_Constructors pc1=new SL_Valid_InValidLogin_Constructors("standard_user", "secret_sauce"); //V V
		SL_Valid_InValidLogin_Constructors pc2=new SL_Valid_InValidLogin_Constructors("dfgsd", "secret_sauce"); //IV V
		SL_Valid_InValidLogin_Constructors pc3=new SL_Valid_InValidLogin_Constructors("standard_user", "34543"); //V IV
		SL_Valid_InValidLogin_Constructors pc4=new SL_Valid_InValidLogin_Constructors("mhhv", "8976"); //IV IV 
		
	
	}
	
	
}
