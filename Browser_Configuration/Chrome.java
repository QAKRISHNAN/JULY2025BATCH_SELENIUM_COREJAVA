package Browser_Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//1.WebDriver Object Creation
		WebDriver driver=new ChromeDriver();
		//2.Browser Configuration
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		Thread.sleep(3000);
		//3.Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//4.Enter given URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		//5.Close Browser
		driver.close();
		Thread.sleep(3000);
		
		System.out.println("Success");
		
		
		
		
		
	}

}
