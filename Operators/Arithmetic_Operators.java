package Operators;

import java.util.Scanner;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int a=20,b=10;
		
		System.out.println("Enter any Two Values: ");
		int a=scan.nextInt(),b=scan.nextInt();
		
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mdiv=a%b;
		
		System.out.println("Addition:"+sum+"\nSubstraction: "+sub+"\nMultification:"+mul+"\nDivision:"+div+"\nModulo division:"+mdiv);
		
		
		
		/*
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mdiv);
		*/
		
		/*
		System.out.println(a +"+"+b +"="+(a+b)); //7
		System.out.println(a +"-"+b +"="+(a-b)); //3
		System.out.println(a +"*"+b +"="+(a*b)); //10 
		System.out.println(a +"/"+b +"="+(a/b)); //2
		System.out.println(a +"%"+b +"="+(a%b)); //1
		*/
		/*
		System.out.println("a+b: "+(a+b)); //7
		System.out.println("a-b: "+(a-b)); //3
		System.out.println("a*b: "+(a*b)); //10 
		System.out.println("a/b: "+(a/b)); //2
		System.out.println("a%b: "+(a%b)); //1
		*/
	}

}
