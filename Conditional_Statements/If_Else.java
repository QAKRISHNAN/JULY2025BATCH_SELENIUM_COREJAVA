package Conditional_Statements;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		//WAJP to find Student Result:Pass/Fail 
				Scanner scan=new Scanner(System.in);
				//int obmarks=85;
				
				System.out.println("Enter Student Marks: ");
				int obmarks=scan.nextInt(); //Input 55 
				
				if(obmarks>=35) //55>=35 true/false 
				{ //Entry 
					System.out.println("Pass");
				} //Exit 
				
				else
				{
					System.out.println("Fail");
				}
				
	}

}
