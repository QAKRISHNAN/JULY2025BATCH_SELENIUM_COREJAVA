package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Text_OK {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);

		// Step-1
		WebElement AlertTextBox = driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]"));
		System.out.println(AlertTextBox.getText());
		AlertTextBox.click();
		Thread.sleep(2000);

		// Step-2
		WebElement Display_PromptBox = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		System.out.println(Display_PromptBox.getText());
		Display_PromptBox.click();
		Thread.sleep(2000);

		// Step-3
		Alert alertOK_Cancel = driver.switchTo().alert();
		System.out.println(alertOK_Cancel.getText());
		
		alertOK_Cancel.sendKeys("Krishna");
		Thread.sleep(2000);

		//alertOK_Cancel.accept();
		alertOK_Cancel.dismiss();
		Thread.sleep(2000);

		WebElement AlertText = driver.findElement(By.id("demo1"));
		System.out.println(AlertText.getText());
		Thread.sleep(2000);

	}

}
