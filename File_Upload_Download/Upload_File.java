package File_Upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(1000);
		
		/*
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\HP\\Downloads\\sampleFile.jpeg");
		Thread.sleep(1000);
		
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\HP\\Downloads\\cucumber.png");
		*/
		
		WebElement UploadFile=driver.findElement(By.id("input-4"));
		UploadFile.sendKeys("C:\\Users\\HP\\Downloads\\sampleFile.jpeg");
		Thread.sleep(1000);
		UploadFile.sendKeys("C:\\Users\\HP\\Downloads\\cucumber.png");
		
	}

}
