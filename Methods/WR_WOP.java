package Methods;

public class WR_WOP
{
	public int Addition() 
	{
		int a=20,b=10,c;
		c=a+b;
		//System.out.println("Addition: "+c);
		return c;
				
	}
	public static void main(String[] args)
	{
		WR_WOP wrwop=new WR_WOP();
		int result=wrwop.Addition();
		System.out.println("Addition: "+result);
		
		//System.out.println("Addition: "+wrwop.Addition());
	}

}
