package ExceptionHandling;

public class Arithmetic_Exception {

	public static void main(String[] args) {

		//System.out.println(10/0);
		//System.out.println("Program Success");
		try  //throw 
		{
			System.out.println(10/0);
			System.out.println("Divisible Success");
			//System.out.println("Thanku");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Unable to divide something by Zero"+ae);
			System.out.println("Divisible Un-Success");
			//System.out.println("Thanku");
	}
		finally
		{
			System.out.println("Thanku");
		}
		
	}

}
