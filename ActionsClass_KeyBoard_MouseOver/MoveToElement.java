package ActionsClass_KeyBoard_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		Thread.sleep(2000);
		
		WebElement Products=driver.findElement(By.id("products-dd-toggle"));
		WebElement Live=driver.findElement(By.xpath("//a[@aria-label=\"Live\"][1]"));
		WebElement AppTesting=driver.findElement(By.id("products-dd-tab-2"));
		WebElement AppLive=driver.findElement(By.xpath("//a[@aria-label=\"App Live\"][1]"));
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		/*
		action.moveToElement(Products).perform();
		Thread.sleep(2000);
		//Live.click();
		action.click(Live).perform();
		*/
		
		action.moveToElement(Products).perform();
		Thread.sleep(2000);
		action.moveToElement(AppTesting).perform();
		Thread.sleep(2000);
		action.click(AppLive).perform();
		
	}

}
