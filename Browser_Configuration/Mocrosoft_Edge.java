package Browser_Configuration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Mocrosoft_Edge {

	public static void main(String[] args) throws InterruptedException {
		// 1.WebDriver Object Creation
		WebDriver driver = new EdgeDriver();
		// 2.Browser Configuration
		System.setProperty("webdriver.edge.driver", "D:\\SELENIUM-JULY2025\\msedgedriver.exe");
		Thread.sleep(3000);
		// 3.Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// 4.Enter given URL
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		// 5.Close Browser
		//driver.close();
		//Thread.sleep(3000);

	}

}
