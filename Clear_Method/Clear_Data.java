package Clear_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Data {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(1000);
		
		WebElement Add=driver.findElement(By.id("addNewRecordButton"));
		Add.click();
		
		WebElement FirstName=driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Kishna");
		Thread.sleep(2000);
		//FirstName.clear();
		//Thread.sleep(2000);
		FirstName.sendKeys("RamaRao");
	}

}
