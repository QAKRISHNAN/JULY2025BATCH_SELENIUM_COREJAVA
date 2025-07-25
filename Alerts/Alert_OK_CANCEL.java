package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_OK_CANCEL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);

		// Step-1
		WebElement AlertBox_OK_cancel = driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]"));
		System.out.println(AlertBox_OK_cancel.getText());
		AlertBox_OK_cancel.click();
		Thread.sleep(2000);

		// Step-2
		WebElement Display_ConfirmBox = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		System.out.println(Display_ConfirmBox.getText());
		Display_ConfirmBox.click();
		Thread.sleep(2000);

		// Step-3
		Alert alertOK_Cancel = driver.switchTo().alert();
		System.out.println(alertOK_Cancel.getText());
		//alertOK.accept();
		alertOK_Cancel.dismiss();
		Thread.sleep(2000);

		WebElement AlertText = driver.findElement(By.id("demo"));
		System.out.println(AlertText.getText());
		Thread.sleep(2000);

		driver.close();

	}

}
