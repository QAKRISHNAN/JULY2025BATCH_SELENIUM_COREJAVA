package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
		//driver.switchTo().frame(0);  //By Index
		//driver.switchTo().frame("SingleFrame");  //By Name
		//driver.switchTo().frame("singleframe");  //BY ID
		//By WebElement
		WebElement SingleFrameElememnt=driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(SingleFrameElememnt);
		Thread.sleep(1000);
		
		WebElement SingleFrame=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		SingleFrame.sendKeys("Apple");
		Thread.sleep(1000);

	}

}
