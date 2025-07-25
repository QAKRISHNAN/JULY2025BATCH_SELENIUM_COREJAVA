package Constructors;

public class ParameterizedConstructor 
{
	public  ParameterizedConstructor(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		ParameterizedConstructor pc1=new ParameterizedConstructor(10,20);
		ParameterizedConstructor pc2=new ParameterizedConstructor(100,200);
	
	}

}
