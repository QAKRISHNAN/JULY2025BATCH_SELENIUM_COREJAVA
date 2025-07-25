package Conditional_Statements;

import java.util.Scanner;

public class Nested_If_BloodDonation 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age=scan.nextInt();
		
		if(age>=18) //Outer T T F
		{
			System.out.println("Enter Your Weight: ");
			int weight=scan.nextInt();
			
			if(weight>=40) //Inner T F
			{
				System.out.println("Your Eligible to Donate Blood");
				//TBS
			}
			else //Inner
			{
				System.out.println("Your Weight is <40");
				System.out.println("You are not Eligible");
				//FBS
			}
		}
		else  //Outer
		{
			System.out.println("Your Age is <18");
			System.out.println("You are not Eligible");
			//FBS
		
		}
		
	}

}
