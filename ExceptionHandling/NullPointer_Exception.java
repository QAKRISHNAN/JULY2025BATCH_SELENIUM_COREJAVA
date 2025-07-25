package ExceptionHandling;

public class NullPointer_Exception {

	public static void main(String[] args) {
		
		//String name="Krishna";
		//String name=null;
		//System.out.println(name.length());
		try
		{
			String name=null;
			System.out.println(name.length());
		}
		catch(NullPointerException np)
		{
			System.out.println(np.getMessage());
			//System.out.println(np);
			//System.out.println("No String Value "+np);
			System.out.println("Exception Handled");
		}
	}

}
