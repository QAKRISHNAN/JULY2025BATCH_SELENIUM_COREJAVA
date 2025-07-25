package Conditional_Statements;

import java.util.Scanner;

public class Switch_Calculator_Symbols {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any Two Values: ");
		int a=scan.nextInt(),b=scan.nextInt();
		
		System.out.println("CALCULATOR");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
	
		System.out.println("Choose your option");
		char ch=scan.next().charAt(0);
		
		switch(ch)
		{
		case '+':
		{
			int c=a+b;
			System.out.println("Addition:"+c);
			break;
			
		}
		case '-':
		{
			int c=a-b;
			System.out.println("Substraction:"+c);
			break;
		}
		case '*':
		{
			int c=a*b;
			System.out.println("Multification:"+c);
		break;
		}
		case '/':
		{
			int c=a/b;
			System.out.println("Division:"+c);
			break;
		}
		default:
		{
			
		System.out.println("Pls choose + or - or * or /");
		}
		}
		
		
		
		}
		
		

	}


