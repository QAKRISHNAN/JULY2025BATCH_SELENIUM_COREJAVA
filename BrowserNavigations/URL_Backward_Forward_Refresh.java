package BrowserNavigations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class URL_Backward_Forward_Refresh {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions optins = new ChromeOptions();
		optins.addArguments("--headless");
		WebDriver driver = new ChromeDriver(optins);
		
		//WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		//driver.manage().window().maximize();
		// driver.get("https://www.amazon.in/");

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		// Screenshot-1
		File ss1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss1, new File("D:\\SELENIUM-JULY2025\\ScreenShots\\S1amazon.jpeg"));

		//driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://web.whatsapp.com/");
		Thread.sleep(2000);
		// Screenshot-2
		File ss2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss2, new File("D:\\SELENIUM-JULY2025\\ScreenShots\\S2facebook.jpeg"));

		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		// Screenshot-1
		File ss3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss3, new File("D:\\SELENIUM-JULY2025\\ScreenShots\\S3flipcart.jpeg"));

		// BackWard
		driver.navigate().back();
		Thread.sleep(3000);
		// Screenshot-1
		File ss4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss4, new File("D:\\SELENIUM-JULY2025\\ScreenShots\\S4back.jpeg"));

		// ForWard
		driver.navigate().forward();
		Thread.sleep(3000);
		// Screenshot-1
		File ss5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss5, new File("D:\\SELENIUM-JULY2025\\ScreenShots\\S5forward.jpeg"));

		// Refresh
		driver.navigate().refresh();
		// Screenshot-1
		File ss6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss6, new File("D:\\SELENIUM-JULY2025\\ScreenShots\\S6refresh.jpeg"));

		System.out.println("Success");
		driver.close();
	}

}
