package WebPage_Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontally_Vertically {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		//driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);

		//Vertical scroll(Top to Bottom)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		//Vertical Scroll (Bottom to Top)
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);
		//driver.close();
		
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(1000);
		// Horizontal Scroll(Left to Right)
		js.executeScript("window.scrollBy(600,0)");
		Thread.sleep(3000);
		// Horizontal Scroll(Right to Left)
		js.executeScript("window.scrollBy(-600,0)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(600,600)");
		Thread.sleep(3000);
		
		driver.close();
	}

}
