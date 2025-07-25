package Conditional_Statements;

import java.util.Scanner;

public class Switch_Calculator
{

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any Two Values: ");
		int a=scan.nextInt(),b=scan.nextInt();
		
		System.out.println("CALCULATOR");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBSTRACTION");
		System.out.println("3.MULTIFICATION");
		System.out.println("4.DIVISION");
		System.out.println("5.MODULO DIVISION");
	
		System.out.println("Choose your option");
		int ch=scan.nextInt();
		
		switch(ch)
		{
		case 1:
		{
			int c=a+b;
			System.out.println("Addition:"+c);
			break;
		}
		case 2:
		{
			int c=a-b;
			System.out.println("Substraction:"+c);
			break;
		}
		case 3:
		{
			int c=a*b;
			System.out.println("Multification:"+c);
		break;
		}
		case 4:
		{
			int c=a/b;
			System.out.println("Division:"+c);
			break;
		}
		default:
		{
			
		System.out.println("Pls choose b/w 1 to 4 only");
		}
		}
		
		
		
		}
		
		
	

}
