package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLogin_WPWOR 
{
	//Without ReturnType and With Parameters
	
		public void SL_Valid_InValidLogin(String UserName,String Password) throws InterruptedException 
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
			
			//SP SC 
			SwagLogin_WPWOR validInvalid=new SwagLogin_WPWOR();
			validInvalid.SL_Valid_InValidLogin("standard_user", "secret_sauce"); //V V
			validInvalid.SL_Valid_InValidLogin("dfgsd", "secret_sauce"); //IV V
			validInvalid.SL_Valid_InValidLogin("standard_user", "34543"); //V IV
			validInvalid.SL_Valid_InValidLogin("mhhv", "8976"); //IV IV 
			//V B
			//B V
			//IV B
			//B IV 
			//B B 
		}

}
