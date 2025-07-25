package Looping_Statements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*
		while(true)
		{
			System.out.println("Hai");
		}
		*/
		/*
		while(true)
		{
			//Eligible To apply vote 
			Scanner scan=new Scanner(System.in);
			//int obmarks=85;
			
			System.out.println("Enter your Age: ");
			int age=scan.nextInt(); //Input 55 
			
			if(age>=18) 
			{
				System.out.println("You are eligible to apply Vote");
				System.out.println("Click on below link and fill your details");
			}
			else
			{
				System.out.println("You are not eligible to apply Vote");
				System.out.println("Pls try when ever your age is >=18");
			}
			
		}
		*/
		//Print 1 to 10
		/*
		int i=1;
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		int i=1;
		
		while(i<1) //1<1 F null
		{
			System.out.println(i);
			i++;
		}

	}

}
