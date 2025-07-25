package Conditional_Statements;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// Find the given number is Even or Odd 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int number=scan.nextInt(); //Input

		/*
		if(number%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}*/
		
		//if(number%2==1)
		if(number%2!=0)	
		{
			System.out.println("Odd Number");
		}
		else
		{
			System.out.println("Even Number");
		}
	}

}
