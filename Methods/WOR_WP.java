package Methods;

public class WOR_WP 
{
	public void Addition(int a,int b) 
	{
		
		int c=a+b;
		System.out.println("Addition: "+c);
					
	}
	
	public static void main(String[] args)
	{
		WOR_WP worwp=new WOR_WP();
		worwp.Addition(10, 10);
		worwp.Addition(20, 20);
		worwp.Addition(30, 30);
	}

}
