package WebElements_WebLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_CreateAccount_DropDown_Radio_TextBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//Click on Create New Account Button 
		WebElement CreateNewAccountButton=driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		CreateNewAccountButton.click();
		
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Krishna");
		
		WebElement SurName=driver.findElement(By.name("lastname"));
		SurName.sendKeys("Rao");
		
		//DropDown
		WebElement DateOfBirth_Day=driver.findElement(By.name("birthday_day"));
		//DateOfBirth.sendKeys("15");
		
		Select dayselect=new Select(DateOfBirth_Day);
		dayselect.selectByIndex(19);
		Thread.sleep(1000);
		
		WebElement DateOfBirth_Month=driver.findElement(By.name("birthday_month"));
		Select monthselect=new Select(DateOfBirth_Month);
		monthselect.selectByValue("8");
		Thread.sleep(1000);
		
		WebElement DateOfBirth_Year=driver.findElement(By.name("birthday_year"));
		Select yearselect=new Select(DateOfBirth_Year);
		yearselect.selectByVisibleText("1990");
	}

}
