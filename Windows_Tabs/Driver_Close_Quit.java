package Windows_Tabs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import Browsers_Methods.ChromeBrowser;

public class Driver_Close_Quit
{
	WebDriver driver;
	
	public void Close_Quit() throws InterruptedException
	{
		ChromeBrowser cb=new ChromeBrowser();
		driver=cb.ChromeBrowser_Config();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		//driver.close();
		//driver.quit();
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(2000);
		
		//driver.close();
		driver.quit();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		Driver_Close_Quit CloseQuit=new Driver_Close_Quit();
		CloseQuit.Close_Quit();
		
	}
}
