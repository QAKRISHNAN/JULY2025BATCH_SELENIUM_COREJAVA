package Arthematic_Programs;


import java.util.Scanner;

public class ArthematicOperations_Dynamic 
{
	public  void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter any Two values: ");
		int value1=scan.nextInt();
		int value2=scan.nextInt();
		

		int sum=value1+value2;
		int sub=value1-value2;
		int mul=value1*value2;
		int div=value1/value2;
		
		System.out.println("Addiiton: "+sum);
		System.out.println("Substraction: "+sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
		
	}

}
