package Encapsulation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_Encapsulatio2
{
	public static void main(String[] args) {
		// Create object of Credentials
		Swag_Encapsulation1 en = new Swag_Encapsulation1();
        en.setUsername("krishna");
        en.setPassword("krishna@123");
      
        // Selenium WebDriver
        WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

        // Use encapsulated values
		driver.findElement(By.id("user-name")).sendKeys(en.getUsername());
		driver.findElement(By.id("password")).sendKeys(en.getPassword());
		driver.findElement(By.id("login-button")).click();

	}

}
