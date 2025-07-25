package Operators;

public class Unary_Operators {

	public static void main(String[] args) {
		/*
		int a=10,b=10,c=10,d=10;
		
		System.out.println(++a); //11
		System.out.println("a: "+a); //11
		
		System.out.println(b++); //10
		System.out.println("b: "+b); //11
		
		System.out.println(--c); //9
		System.out.println("c: "+c); //9
		
		System.out.println(d--); //10
		System.out.println("d: "+d); //9
		*/
		
		int a=10;
		
		System.out.println("First: "+a); //10
		
		System.out.println(++a); //11
		System.out.println("a: "+a); //11
		
		System.out.println(a++); //11 10
		System.out.println("a: "+a); //12 
		
		System.out.println(--a); //11
		System.out.println("a: "+a); //11
		
		System.out.println(a--); //11 10
		System.out.println("a: "+a); //10
		
		System.out.println("Last: "+a); //10
	}

}
