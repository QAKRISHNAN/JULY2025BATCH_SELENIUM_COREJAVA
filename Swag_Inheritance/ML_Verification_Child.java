package Swag_Inheritance;

public class ML_Verification_Child extends ML_SwagValidValid_ParentChild
{

	public void URLVerification()
	{
		String ExceptedURL1 = "https://www.saucedemo.com/inventory.html";
		String ActuvalURL1 = driver.getCurrentUrl();

		if (ExceptedURL1.equalsIgnoreCase(ActuvalURL1)) // Inner T F

		{
			System.out.println("Test Cas Pass");
		}

		else // Inner
		{
			System.out.println("Test  Case Fail");
		}
		driver.close();
	
	}
}
