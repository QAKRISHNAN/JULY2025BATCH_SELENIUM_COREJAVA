package ActionsClass_KeyBoard_MouseOver;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalLetters 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		Actions action=new Actions(driver);
		
		WebElement TextAreaField1=driver.findElement(By.id("ta1"));
		//TextAreaField1.sendKeys("abcdefgh");
		//TextAreaField1.sendKeys("ABCDEFGH");
		
		action.keyDown(Keys.SHIFT).sendKeys(TextAreaField1, "abcdefghijklmnopqrstuvwxyz").keyUp(Keys.SHIFT).build().perform();
		

	}

}
