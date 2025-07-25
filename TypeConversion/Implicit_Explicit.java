package TypeConversion;

public class Implicit_Explicit {

	public static void main(String[] args) 
	{
		//ASCII Values Read 
		// byte-short-char-int-long-float-double
		//byte a=10;
		//short b=a;
		//int a=99;
		//float b=a;
		
		char a='b';  //66
		//int b=a;
		float b=a;
		//float a=99.11f;
		//double b=a;
		System.out.println("Actuval Value: "+a);
		System.out.println("Converted Value: "+b);
		
		
		//double-float-long-int-char-short-byte
		//(datatype)varibalename
		/*
		double c=99.55;
		float c=99.99f;
		int d=(int)c; */
		
		//int c=98;
		
		float c=98.99f;
		char d=(char)c;  //b
		System.out.println("Actuval Value: "+c);
		System.out.println("Converted Value: "+d);
		
		/**
		float c=98.99f;
		char d=(char)c;  //b
		System.out.println("Actuval Value: "+c);
		System.out.println("Converted Value: "+d);
	*/
	}

}
