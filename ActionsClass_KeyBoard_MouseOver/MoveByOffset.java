package ActionsClass_KeyBoard_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		WebElement DragBox=driver.findElement(By.id("dragBox"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		//action.clickAndHold(DragBox).moveByOffset(0, 100).build().perform();
		//action.clickAndHold(DragBox).moveByOffset(0, -100).build().perform();
		//action.clickAndHold(DragBox).moveByOffset(100, 0).build().perform();
		action.clickAndHold(DragBox).moveByOffset(-100, 100).build().perform();
		/* (0, 100): Down
		 * (0, -100): UP
		 * (100, 0):Right
		 * (-100, 0):Left
		 * (-100, 100):Left & Down
		 */
		

	}

}
