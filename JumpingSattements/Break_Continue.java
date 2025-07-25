package JumpingSattements;

public class Break_Continue 
{

	public static void main(String[] args)
	{
		
		for(int i=1;i<=10;i++) //1<=10T 
		{
			//if(i==5) //1==5F 5==5T 
			//if(i<=5) //1<=5T  6<=5null 
			if(i>=5) //1>=5 
			{
				//break;  //1 2 3 4 5
				continue; //1 2 3 4
			}
			
			System.out.println(i); //1  2 3 4 6 7 8 9 10 
		}

	}

}
