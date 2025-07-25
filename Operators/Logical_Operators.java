package Operators;

public class Logical_Operators {

	public static void main(String[] args) {
		
		//boolean a=true,b=true;
		//boolean a=true,b=false;
		//boolean a=false,b=true;
		boolean a=false,b=false;
		
		System.out.println(a && b); //true false false false
		System.out.println(a || b); //true true true false
		
		System.out.println(!(a && b)); 
		System.out.println(!(a || b));
		System.out.println(!a);

	}

}
