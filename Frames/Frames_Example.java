package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frames.html");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		WebElement Frame1=driver.findElement(By.id("001"));
		Frame1.sendKeys("Apple");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame(1);
		WebElement Frame2=driver.findElement(By.id("002"));
		Frame2.sendKeys("Banana");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		WebElement Frame3Elememnt=driver.findElement(By.xpath("//frame[@src=\"D:\\SELENIUM\\Selenium Scripts\\Frames\\frame_c.html\"]"));
		
		driver.switchTo().frame(Frame3Elememnt);
		WebElement Frame3=driver.findElement(By.id("003"));
		Frame3.sendKeys("Mango");
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		WebElement Frame4Elememnt=driver.findElement(By.xpath("//frame[@src=\"D:\\SELENIUM\\Selenium Scripts\\Frames\\frame_d.html\"]"));
		
		driver.switchTo().frame(Frame4Elememnt);
		WebElement Frame4=driver.findElement(By.id("004"));
		Frame4.sendKeys("Guvva");
		
	}

}
