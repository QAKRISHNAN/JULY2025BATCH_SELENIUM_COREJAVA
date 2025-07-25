package WebElements_WebLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_FindElements {

	public static void main(String[] args) throws InterruptedException {
		// 1.WebDriver Object Creation
		WebDriver driver = new ChromeDriver();
		// 2.Browser Configuration
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		// Thread.sleep(3000);
		// 3.Maximize the Browser
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		// 4.Enter given URL
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		List<WebElement> Hobbies=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for(int i=0;i<Hobbies.size();i++) //0<3 1<3 2<3 3<3
		
			//for(int i=0;i<3;i++) //3,0 1 2
		{
			Hobbies.get(i).click();
		}
		
	}

}
