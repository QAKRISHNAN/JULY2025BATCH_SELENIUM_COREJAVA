package ExceptionHandling;

import java.nio.channels.AlreadyBoundException;

public class ArrayOutOf_BoundException {

	public static void main(String[] args) {
		/*
		int a[]= {10,20,30,40};
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		try  //throw 
		{
			int a[]= {10,20,30,40};
			for(int i=0;i<=4;i++)
			{
				System.out.println(a[i]);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception Handled");
			
	}
		finally
		{
			System.out.println("Thanku");
		}

	}

}
