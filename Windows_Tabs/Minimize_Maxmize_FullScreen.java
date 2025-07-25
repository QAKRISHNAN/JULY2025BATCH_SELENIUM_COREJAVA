package Windows_Tabs;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_Maxmize_FullScreen {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");

		driver.get("https://www.zomato.com/");
		Thread.sleep(1000);

		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*
		driver.manage().window().minimize();
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		*/
		Dimension dimension = new Dimension(2000, 800);
		driver.manage().window().setSize(dimension);

		
		//driver.manage().window().fullscreen();
		//Thread.sleep(2000);

		//driver.quit();

	}

}
