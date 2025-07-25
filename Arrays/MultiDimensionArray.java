package Arrays;

import java.util.Scanner;

public class MultiDimensionArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Row Size");
		int rsize=scan.nextInt();
		System.out.println("Enter Column Size");
		int csize=scan.nextInt();
		
		
		int a[][]=new int[rsize][csize];
		int b[][]=new int[rsize][csize];
		
		System.out.println("Enter First Array Elements");
		for(int i=0;i<rsize;i++) //Rows
		{
			for(int j=0;j<csize;j++) //Columns
			{
				a[i][j]=scan.nextInt();
			}
			
		}
		
		System.out.println("Enter Second Array Elements");
		for(int i=0;i<rsize;i++) //Rows
		{
			for(int j=0;j<csize;j++) //Columns
			{
				b[i][j]=scan.nextInt();
			}
			
		}
				
		
		System.out.println("Given First Array: ");
		for(int i=0;i<rsize;i++) //Rows
		{
			for(int j=0;j<csize;j++) //Columns
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("Given Second Array: ");
		for(int i=0;i<rsize;i++) //Rows
		{
			for(int j=0;j<csize;j++) //Columns
			{
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
