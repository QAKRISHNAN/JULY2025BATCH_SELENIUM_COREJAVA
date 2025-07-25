package ActionsClass_KeyBoard_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		WebElement DragMe=driver.findElement(By.id("draggable"));
		WebElement DropHere=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		//action.dragAndDropBy(DragMe, 0, 150).perform();
		action.dragAndDrop(DragMe, DropHere).perform();

	}

}
