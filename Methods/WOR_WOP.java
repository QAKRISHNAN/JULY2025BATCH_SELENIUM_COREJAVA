package Methods;

public class WOR_WOP
{
	public void Addition() 
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println("Addition: "+c);
		
				
	}
	
	public static void Substraction() 
	{
		int a=20,b=10,c;
		c=a-b;
		System.out.println("Substraction: "+c);
				
	}
	
	public static void main(String[] args) 
	{
		WOR_WOP worwop=new WOR_WOP();
		worwop.Addition();
		WOR_WOP.Substraction();
	}

}
