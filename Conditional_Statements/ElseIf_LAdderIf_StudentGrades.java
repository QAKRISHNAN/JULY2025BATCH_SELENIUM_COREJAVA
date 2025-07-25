package Conditional_Statements;

import java.util.Scanner;

public class ElseIf_LAdderIf_StudentGrades 
{

	public static void main(String[] args) 
	{
	
		Scanner scan=new Scanner(System.in);
		//int obmarks=85;
		
		System.out.println("Enter Student Marks: ");
		int obmarks=scan.nextInt(); //Input 55 
		
		if(obmarks>=80 && obmarks<=100) //99>=80 T 75>=80F 150>=80
		{
			System.out.println("A Grade");
		}
		else if(obmarks>=60 && obmarks<80) //75>=60 P
		{
			System.out.println("B Grade");
		}
		else if(obmarks>=40 && obmarks<60) //55>=40
		{
			System.out.println("C Grade");
		}
		else if(obmarks>=35 && obmarks<40 ) //35>=35
		{
			System.out.println("D Grade");
		}
		else if(obmarks>=0 && obmarks<35 ) //35>=35
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pls enter marks b/w 0 to 100 Only");
		}
		
		/* A:>80
		 * B:>60
		 * C:>40
		 * D:>35
		 * Fail:else
		 */
	}

}
