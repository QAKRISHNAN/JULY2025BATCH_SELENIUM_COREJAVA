package Windows_Tabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import Browsers_Methods.ChromeBrowser;

public class NewTab_NewWindow 
{
	 WebDriver driver;
	public void NewTab_Window() throws InterruptedException
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
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://web.whatsapp.com/");
		
		}

	public static void main(String[] args) throws InterruptedException 
	{
				
		NewTab_NewWindow TabWindow=new NewTab_NewWindow();
		TabWindow.NewTab_Window();
		
		
		
}
}
