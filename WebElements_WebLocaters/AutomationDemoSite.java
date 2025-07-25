package WebElements_WebLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite {

	public static void main(String[] args) throws InterruptedException {
		// 1.WebDriver Object Creation
		WebDriver driver = new ChromeDriver();
		// 2.Browser Configuration
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		//Thread.sleep(3000);
		// 3.Maximize the Browser
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		// 4.Enter given URL
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		WebElement FirstName = driver
				.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		
		//Thread.sleep(2000);
		
		WebElement LastName = driver
				.findElement(By.xpath("//input[@ng-model=\"LastName\"]"));
		
		//Thread.sleep(2000);
		
		WebElement Adress = driver
				.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
	
		//Thread.sleep(2000);
		
		WebElement EmailAdress = driver
				.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required\"]"));
		
		//Thread.sleep(2000);
		
		WebElement PhoneNum = driver
				.findElement(By.xpath("//input[@type=\"tel\"]"));
		
		//Thread.sleep(2000);
		
		WebElement GenderMale = driver
				.findElement(By.name("radiooptions"));
		
		//Thread.sleep(2000);
		
		WebElement GenderFeMale = driver
				.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		
		WebElement HobbiesCricket = driver
				.findElement(By.id("checkbox1"));
		
		WebElement HobbiesMovies = driver
				.findElement(By.id("checkbox2"));
		
		WebElement HobbiesHockey = driver
				.findElement(By.xpath("//input[@value=\"Hockey\"]"));
		
		
		Thread.sleep(2000);
		
		FirstName.sendKeys("Krishna");
		LastName.sendKeys("Rao");
		EmailAdress.sendKeys("krishna@gmail.com");
		Adress.sendKeys("KPHB,\n HYD");
		PhoneNum.sendKeys("123456789");
		GenderMale.click();
		GenderFeMale.click();
		HobbiesCricket.click();
		HobbiesMovies.click();
		HobbiesHockey.click();
		
		
		
		
	}

}
