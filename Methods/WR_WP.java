package Methods;

public class WR_WP 
{

	public int Addition(int a,int b) 
	{
		int c=a+b;
		return c;
					
	}
	
	public static void main(String[] args) {
		
		WR_WP wrwp=new WR_WP();
		
		System.out.println("Addition: "+wrwp.Addition(10, 20));
		System.out.println("Addition: "+wrwp.Addition(100, 200));
		System.out.println("Addition: "+wrwp.Addition(1000, 2000));
	}
	
	
}
