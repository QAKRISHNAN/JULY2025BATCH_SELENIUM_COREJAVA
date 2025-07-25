package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_OK {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		
		WebElement AlertBox_OK=driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		System.out.println(AlertBox_OK.getText());
		AlertBox_OK.click();
		Thread.sleep(2000);
		
		//Click Alert OK 
		
		Alert alertOK=driver.switchTo().alert();
		System.out.println(alertOK.getText());
		alertOK.accept();
		
		
		
		
	}

}
