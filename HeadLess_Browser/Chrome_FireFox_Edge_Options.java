package HeadLess_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_FireFox_Edge_Options {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new ChromeDriver();
		// 2.Browser Configuration
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		Thread.sleep(3000);
		// 3.Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// 4.Enter given URL
		driver.get("https://www.saucedemo.com/");
		//driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		String ExceptedURL="https://www.saucedemo.com/";
		String ActuvalURL=driver.getCurrentUrl();
		
		if(ExceptedURL.equalsIgnoreCase(ActuvalURL)) //T/F
		{
			System.out.println("Smoke Test Pass");
		}
		else
		{
			System.out.println("Smoke Test Fail");
		}
		
		// 5.Close Browser
		driver.close();
		//Thread.sleep(3000);

	}

}
