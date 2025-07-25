package Arrays;

import java.util.Scanner;

public class Single_OneDimensionArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// Static Way
		
		//int a[]= {10,20,30,40,50};
		
		//float a[]= {10.5f,20.5f,30.5f,40.5f,50.5f};
		
		//char a[]= {'A','B','C','D','E'};
		
		//boolean a[]= {true,false,true,false,true};
		/*
		String a[]= {"Krishna","Sandeep","Prashanth","Purender","Anil"};
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
			//System.out.print(a[i]+"  " );
			
		}
		*/
		
		//Dynamic Way Memory Allocation
		//dattype arrayname[]=new datattype[Size];
		
		int a[]=new int[5];
		
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<5;i++)
		{
			a[i]=scan.nextInt();
		}

		System.out.println("Given Array: ");
		
		for(int i=0;i<5;i++)
		{
			//System.out.println(a[i]);
			System.out.print(a[i]+"  " );
			
		}
	}

}
