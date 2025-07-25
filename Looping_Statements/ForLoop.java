package Looping_Statements;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=100;i++) //1<=10T 2<=10T 11<=10F Exit
		{
			System.out.println(i+".Hai"); //Print
		}
		*/
		/*
		for(;;) //1<=10T 2<=10T 11<=10F Exit
		{
			System.out.println("Hai"); //Print
		}
			*/
		
		//Print 1 to 10 Numbers
		/*
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		*/
		//Print 10 to 1 Numbers
		/*
		for(int i=10;i>=1;i--) //10<=10 9<=10 8<=10 0<=10 -1<=10
		{
			System.out.println(i);
		}
		*/
		
		//Print Even Numbers b/w 2 to 20
		
		for(int i=2;i<=20;i+=2) //10<=10 9<=10 8<=10 0<=10 -1<=10
		{
			//System.out.println(i);
			System.out.print(i+"  ");
		}
		
		/*
		for(int i=1;i<=3;i++) //10<=10 9<=10 8<=10 0<=10 -1<=10
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
	}

}
