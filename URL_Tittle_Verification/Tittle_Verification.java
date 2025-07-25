package URL_Tittle_Verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tittle_Verification {

	public static void main(String[] args) throws InterruptedException {
		// Smoke Testing
		// 1.WebDriver Object Creation
		WebDriver driver = new ChromeDriver();
		// 2.Browser Configuration
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		Thread.sleep(3000);
		// 3.Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// 4.Enter given URL
		// driver.get("https://www.saucedemo.com/");
		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);

		String ExceptedTittle = "Swag Labs";
		String ActuvalTittle = driver.getTitle();
		System.out.println("ExceptedTittle: "+ExceptedTittle);
		
		System.out.println("ActuvalTittle: "+ActuvalTittle);
		if (ExceptedTittle.equalsIgnoreCase(ActuvalTittle)) // T/F
		{
			System.out.println("Smoke Test Pass");
		} else {
			System.out.println("Smoke Test Fail");
		}

		// 5.Close Browser
		driver.close();
		// Thread.sleep(3000);

	}

}
