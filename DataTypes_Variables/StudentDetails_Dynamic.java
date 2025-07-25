package DataTypes_Variables;

import java.util.Scanner;

public class StudentDetails_Dynamic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your ID: ");
		byte id=scan.nextByte();
		
		System.out.println("Enter your Name: ");
		String name=scan.next();
		// name=scan.nextLine();
		
		System.out.println("Enter your Gender: ");
		char gender=scan.next().charAt(0);
		
		System.out.println("Enter your Percentage: ");
		float percentage=scan.nextFloat();
		
		System.out.println("Enter your Result: ");
		boolean result=scan.nextBoolean();
		
		System.out.println("Student Details");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Percentage: "+percentage);
		System.out.println("Result: "+result);
	
		//InputMismatchException
		
		
	}

}
