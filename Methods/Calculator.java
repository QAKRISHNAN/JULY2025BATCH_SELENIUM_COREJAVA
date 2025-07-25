package Methods;

public class Calculator
{
	//User-Deine Method Static Non-Static:Object
	
	public int Addition() 
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println("Addition: "+c);
		return 0;
				
	}
	
	public static void Substraction() 
	{
		int a=20,b=10,c;
		c=a-b;
		System.out.println("Substraction: "+c);
				
	}
	public static void Multification() 
	{
		int a=20,b=10,c;
		c=a*b;
		System.out.println("Multification: "+c);
				
	}
	
	public void Division() 
	{
		int a=20,b=10,c;
		c=a/b;
		System.out.println("Division: "+c);
				
	}
	public static void main(String[] args) //Cal 
	{
		Calculator cal=new Calculator();
		cal.Addition();
		Calculator.Substraction();
		//Calculator.Multification();
		cal.Multification();
		
		//cal.Substraction();
		//cal.Multification();
		//cal.Division();
	}
	
}
