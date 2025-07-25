package TestResult_ExcelFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Swag_TestData 
{

	WebDriver driver;
	Swag_ExcelTestData config;
	int currentRow = 0; // Declare and track current row

	@Test(dataProvider = "testdata")
	public void SwagLabsLoginPage(String UserName, String Password) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM-JULY2025\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);

		driver.findElement(By.id("user-name")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

		String actualUrl = driver.getCurrentUrl();
		String result;

		if (actualUrl.contains("inventory")) {
			result = "Pass";
		}
			else if (driver.findElements(By.cssSelector("h3[data-test='error']")).size() > 0) {
				result = "Pass"; // Invalid login but error shown → expected → pass
			} else {
				result = "Fail"; // No redirect and no error → unexpected
			}

		// Write result to Excel (column 2 = 3rd column)
		config.writeData(0, currentRow, 2, result);

		currentRow++; // ✅ Move to next row for next test
	}

	@AfterMethod
	public void ProgramTermination() {
		driver.close();
	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() throws IOException {

		config = new Swag_ExcelTestData("D:\\SELENIUM-JULY2025\\SwagLoginTestData.xlsx");

		int rows = config.getRowCount(0);
		Object[][] credentials = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			credentials[i][0] = config.getData(0, i, 0);
			credentials[i][1] = config.getData(0, i, 1);
		}

		return credentials;
	}
}
