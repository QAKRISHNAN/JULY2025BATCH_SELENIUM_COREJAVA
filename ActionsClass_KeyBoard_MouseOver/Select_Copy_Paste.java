package ActionsClass_KeyBoard_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);

		Actions action = new Actions(driver);

		WebElement TextAreaField1 = driver.findElement(By.id("ta1"));
		WebElement TextAreaField2 = driver.findElement(By.xpath("//div[@id=\"HTML11\"]/div/textarea"));

		action.keyDown(Keys.SHIFT).sendKeys(TextAreaField1, "abcdefghijklmnopqrstuvwxyz").keyUp(Keys.SHIFT).build()
				.perform();
		Thread.sleep(1000);
		
		action.keyDown(TextAreaField1, Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(1000);
		
		action.keyDown(TextAreaField1, Keys.CONTROL).sendKeys(TextAreaField1, "c").build().perform();
		Thread.sleep(1000);
		
		TextAreaField2.clear();
		Thread.sleep(1000);
		
		action.keyDown(TextAreaField2, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		

	}

}
