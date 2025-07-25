package Inheritance;

public class SL_Test 
{
	public static void main(String[] args) 
	{

		SL_Parent parent=new SL_Parent();
		SL_Child child=new SL_Child();
		
		parent.Father();
		
		child.Child();
		child.Father();
		

	}

}
