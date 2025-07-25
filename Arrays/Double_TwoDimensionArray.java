package Arrays;

import java.util.Scanner;

public class Double_TwoDimensionArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Static Way
		/*
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}}; //3*3=9

		for(int i=0;i<3;i++) //Rows
		{
			for(int j=0;j<3;j++) //Columns
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		*/
		/*
		int a[][]= {{10,20,30},{40,50,60}}; //2*3=6

		for(int i=0;i<2;i++) //Rows
		{
			for(int j=0;j<3;j++) //Columns
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		*/
		//Dynamic Way Memory Allocation
		//dattype arrayname[]=new datattype[Size];
		/*
		int a[][]=new int[2][3];
		System.out.println("Enter Array Elements");
		for(int i=0;i<2;i++) //Rows
		{
			for(int j=0;j<3;j++) //Columns
			{
				a[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("Given Array: ");
		for(int i=0;i<2;i++) //Rows
		{
			for(int j=0;j<3;j++) //Columns
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		*/
		System.out.println("Enter Row Size");
		int rsize=scan.nextInt();
		System.out.println("Enter Column Size");
		int csize=scan.nextInt();
		
		
		int a[][]=new int[rsize][csize];
		System.out.println("Enter Array Elements");
		for(int i=0;i<rsize;i++) //Rows
		{
			for(int j=0;j<csize;j++) //Columns
			{
				a[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("Given Array: ");
		for(int i=0;i<rsize;i++) //Rows
		{
			for(int j=0;j<csize;j++) //Columns
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
