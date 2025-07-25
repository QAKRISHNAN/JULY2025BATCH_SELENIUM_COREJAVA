package Swag_MethodOverRiding;

public class Swag_Test {

	public static void main(String[] args) {
		Swag_ValidLogin_Child1 child1=new Swag_ValidLogin_Child1();
		child1.SwagLogin();
		
		Swag_InValidLogin_Child2 child2=new Swag_InValidLogin_Child2();
		child2.SwagLogin();

	}

}
