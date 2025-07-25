package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_ResumeUpload {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get(
				"https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gad_campaignid=21929936595&gbraid=0AAAAADLp3cHRyXIvp0T6sGcynlMfTl_r-&gclid=CjwKCAjw7MLDBhAuEiwAIeXGIU4IpysPwX6SzpQV7wscTnitYoEv3di2KeGFZWoDcft91n6YXFFd7BoCAaMQAvD_BwE&gclsrc=aw.ds");
		Thread.sleep(1000);

		// Vertical scroll(Top to Bottom)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);

		WebElement ExperiencedButton = driver.findElement(By.xpath("//p[normalize-space()='I have work experience (excluding internships)']"));
		ExperiencedButton.click();
		Thread.sleep(1000);

		WebElement UploadResume = driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']"));
		UploadResume.click();
		//UploadResume.sendKeys("D:\\Resumes\\experience-sample-1.doc");
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("D:\\SELENIUM-JULY2025\\AutoIT\\UploadResume_x64.exe");

		
	}

}
