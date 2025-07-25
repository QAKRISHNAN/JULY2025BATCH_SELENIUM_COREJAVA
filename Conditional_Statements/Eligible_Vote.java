package Conditional_Statements;

import java.util.Scanner;

public class Eligible_Vote {

	public static void main(String[] args) {
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

}
