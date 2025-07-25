package ActionsClass_KeyBoard_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_Hold {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		Thread.sleep(2000);
		
		
		WebElement DragBox=driver.findElement(By.id("dragBox"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.clickAndHold(DragBox).perform();
		
		
		
		
	}

}
