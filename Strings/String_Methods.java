package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class String_Methods {

	public static void main(String[] args) {

		// 1.String Length()
		Scanner scan = new Scanner(System.in);
		/*
		// System.out.println("Enter any String: ");
		// String s1=scan.next();
		// String s1=scan.nextLine();
		// String s1=new String("abcd def");
		// String s1="Krishna";
		// int len=s1.length();
		// System.out.println("Length: "+len); //7
		// System.out.println("Length: "+s1.length()); //7
		
		//2.String UpperCase()
		//String s2="abcde";
		String s2="ABCde123#%%$";
		System.out.println("Actuval String:"+s2);
		System.out.println("Upper Case:"+s2.toUpperCase());
		
		//3.String LowerCase()
		String s3="ABCDE";
		System.out.println("Actuval String:"+s3);
		System.out.println("Lower Case:"+s3.toLowerCase());
		
		
		//4.String replace()
		String s4="ABVDE";
		System.out.println("Actuval String:"+s4);
		System.out.println("Replaced:"+s4.replace('V', 'C'));
		String s5="ABCDE";
		System.out.println("Actuval String:"+s5);
		System.out.println("Replaced:"+s5.replace("ABCDE", "Java"));
		
		
		//5.String trim()
		String s6="  ABCDE  ";
		//System.out.println("Actuval String:"+s6.length());
		//System.out.print("Trimmed String:"+s6.trim().length());
		System.out.print("Actuval String:"+s6);
		System.out.println("Krishna");
		System.out.print("Trimmed String:"+s6.trim());
		System.out.print("Krishna");
		
		
		//6.String concat()
		String s7="ABCDE";
		String s8="DEFGH";
		
		System.out.println(s7.concat(s8));
		System.out.println(s8.concat(s7));
		System.out.println(s7.concat(s7));
		System.out.println(s8.concat(s8));
		
		
		//7.String isEmpty()
		//String s9="DEFGH";
		//String s9="";
		String s9=" ";
		System.out.println(s9.isEmpty()); //f
		
		//8.String equals()
		String s10="ABCDE";
		String s11="ABCDE";
		
		System.out.println(s10.equals(s11));//f
		
		
		//9.String copyValueOf() & valueOf
		String s12="ABCDE";
		String s13="";
		
		System.out.println(s13.valueOf(s12));
		System.out.println(s12.valueOf(s13));
		
		char s14[]= {'1','2','3','4'};
		String s15="";
		System.out.println(s15.copyValueOf(s14));
		*/
		
		//10.String getBytes()
		
		//ABCD  int {65,66,67,68}
		//A	int 65
		
		String str = "ABCD";
		byte[] byteArray;
		byteArray = str.getBytes();
		System.out.println(Arrays.toString(byteArray));
	}

}
