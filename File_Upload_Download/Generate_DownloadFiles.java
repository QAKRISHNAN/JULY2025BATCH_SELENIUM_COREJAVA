package File_Upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generate_DownloadFiles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(1000);

		// WebElement
		// DownloadFile=driver.findElement(By.xpath("//a[text()=\"Download\"]"));
		// DownloadFile.click();
		// Thread.sleep(1000);

		WebElement EnterText_TextFile = driver.findElement(By.id("textbox"));
		EnterText_TextFile.sendKeys("My Name is Krishna");
		Thread.sleep(1000);

		WebElement GenerateTextFile=driver.findElement(By.id("createTxt"));
		GenerateTextFile.click();
		Thread.sleep(1000);

		WebElement DownloadTextFile=driver.findElement(By.id("link-to-download"));
		DownloadTextFile.click();
		
		

	}

}
