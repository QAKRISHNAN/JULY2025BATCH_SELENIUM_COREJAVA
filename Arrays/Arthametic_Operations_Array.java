package Arrays;

import java.util.Scanner;

public class Arthametic_Operations_Array {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Row Size");
		int rsize=scan.nextInt();
		System.out.println("Enter Column Size");
		int csize=scan.nextInt();
		
		
		int a[][]=new int[rsize][csize];
		int b[][]=new int[rsize][csize];
		int c[][]=new int[rsize][csize];
		
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
		
		System.out.println("Addition of given two arrays: ");
		
		for(int i=0;i<rsize;i++) //Rows
		{
			for(int j=0;j<csize;j++) //Columns
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		

	}

}
