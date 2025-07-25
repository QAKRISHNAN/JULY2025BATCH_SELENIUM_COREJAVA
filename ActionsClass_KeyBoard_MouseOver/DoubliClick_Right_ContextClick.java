package ActionsClass_KeyBoard_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubliClick_Right_ContextClick 
{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		//Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		WebElement DoubleClick=driver.findElement(By.id("doubleClickBtn"));
		WebElement RightClick=driver.findElement(By.id("rightClickBtn"));
		
		
		Actions action=new Actions(driver);
		
		action.doubleClick(DoubleClick).perform();
		Thread.sleep(2000);
		//action.contextClick().perform();
		action.contextClick(RightClick).perform();
	}
}
