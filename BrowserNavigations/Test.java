package BrowserNavigations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		//ChromeOptions optins = new ChromeOptions();
		//optins.addArguments("--headless");
		//WebDriver driver = new ChromeDriver(optins);
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		File ss1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss1, new File("D:\\SELENIUM-JULY2025\\ScreenShots\\Test.jpeg"));
		driver.close();

	}

}
