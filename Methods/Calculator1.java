package Methods;

public class Calculator1 
{
	//	+	-	*	/	%
	
	public void ModuloDivision() 
	{
		int a=20,b=10,c;
		c=a%b;
		System.out.println("ModuloDivision: "+c);
				
	}	
	
	public static void main(String[] args) 
	{
		Calculator cal=new Calculator();
		Calculator1 cal1=new Calculator1();
		cal.Addition(); //Re-Use
		Calculator.Substraction();
		cal.Multification();
		cal.Division();
		cal1.ModuloDivision();
		
	}
	
}
