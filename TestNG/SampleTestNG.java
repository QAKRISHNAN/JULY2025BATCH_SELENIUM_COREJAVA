package TestNG;

import org.testng.annotations.Test;

public class SampleTestNG 
{
	@Test(priority=4)
	public void KPHB()
	{
		System.out.println("I am in KPHB");
	}
	
	@Test(priority=3)
	public void Hyderabad()
	{
		System.out.println("I am in Hyderabad");
	}
	
	@Test(priority=2)
	public void Telangana()
	{
		System.out.println("I am in Telangana");
	}
	@Test(priority=1)
	public void India()
	{
		System.out.println("I am in India");
	}
	
	
}
