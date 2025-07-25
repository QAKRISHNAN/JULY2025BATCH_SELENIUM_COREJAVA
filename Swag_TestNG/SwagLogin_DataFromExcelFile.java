package Swag_TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLogin_DataFromExcelFile {
	WebDriver driver;

	@Test(dataProvider = "testdata")
	public void SwagLabsLoginPage(String UserName, String Password) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);

		driver.findElement(By.id("user-name")).sendKeys(UserName);
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	void ProgramTermination() {
		driver.close();
	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() throws IOException {

		// Object
		ExcelReadData_SwagLogin config = new ExcelReadData_SwagLogin("D:\\SELENIUM-JULY2025\\SwagLoginTestData.xlsx");

		int rows = config.getRowCount(0);
		Object[][] credentials = new Object[rows][2];

		for (int i = 0; i < rows; i++) // 0<9 1<9 9<9
		{
			credentials[i][0] = config.getData(0, i, 0); // Calling
			credentials[i][1] = config.getData(0, i, 1);
		}

		return credentials;

	}

}
