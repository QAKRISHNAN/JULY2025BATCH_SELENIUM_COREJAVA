package WebElements_WebLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

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

		List<WebElement> Names = driver.findElements(By.xpath("//input[@type=\"text\"]"));

		for (int i = 0; i < Names.size(); i++) // 0<2T 1<2 2<2 F

		// for(int i=0;i<3;i++) //3,0 1 2
		{
			Names.get(i).sendKeys("Krishna");
			
		}

	}

}
