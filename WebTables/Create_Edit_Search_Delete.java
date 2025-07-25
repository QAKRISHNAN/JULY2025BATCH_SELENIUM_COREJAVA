package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Edit_Search_Delete {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(1000);
		
		WebElement Add=driver.findElement(By.id("addNewRecordButton"));
		Add.click();
		
		WebElement FirstName=driver.findElement(By.id("firstName"));
		WebElement LastName=driver.findElement(By.id("lastName"));
		WebElement Email=driver.findElement(By.id("userEmail"));
		WebElement Age=driver.findElement(By.id("age"));
		WebElement Salary=driver.findElement(By.id("salary"));
		WebElement Department=driver.findElement(By.id("department"));
				
		FirstName.sendKeys("Rishna");
		LastName.sendKeys("Rao");
		Email.sendKeys("Krishna@gmail.com");
		Age.sendKeys("35");
		Salary.sendKeys("5000");
		Department.sendKeys("IT");
		
		WebElement Submit=driver.findElement(By.id("submit"));
		Submit.click();
		Thread.sleep(1000);
		
		//Vertical scroll(Top to Bottom)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		
		//Edit Data
		WebElement Edit=driver.findElement(By.id("edit-record-4"));
		Edit.click();
		Thread.sleep(3000);
		
		WebElement FirstNameEdit=driver.findElement(By.id("firstName"));
		FirstNameEdit.clear();
		Thread.sleep(1000);
		FirstNameEdit.sendKeys("Krishna");
		Thread.sleep(1000);
		
		WebElement UpdateSubmit=driver.findElement(By.id("submit"));
		UpdateSubmit.click();
		
		WebElement Search=driver.findElement(By.id("searchBox"));
		Search.click();
		Thread.sleep(1000);
		Search.sendKeys("Krishna");
		Thread.sleep(1000);
		
		WebElement Delete=driver.findElement(By.id("delete-record-4"));
		Delete.click();
		Thread.sleep(5000);
		
		driver.close();
		
	}
}
