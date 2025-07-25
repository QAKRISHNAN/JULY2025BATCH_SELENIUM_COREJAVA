package Strings;

import java.util.Scanner;

public class Strings_Declaration_Static_Dynamic {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String str1="Krishna"; //4bytes
		String str2="Rama Rao"; //4bytes
		String str3="Krishna"; //4bytes
		
		System.out.println("Enter String Value:");
		
		//String str4=scan.next();
		String str4=scan.nextLine();
		String str5=new String("Prashanth");
		String str6=new String("Prashanth");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}

}
