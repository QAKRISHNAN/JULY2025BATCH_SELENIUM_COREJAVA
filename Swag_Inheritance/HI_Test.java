package Swag_Inheritance;

public class HI_Test {

	public static void main(String[] args) throws InterruptedException {
		HI_SwagValidValid_Child1 ch1 = new HI_SwagValidValid_Child1();
		ch1.ChromeBrowser("https://www.saucedemo.com/");
		ch1.Swag_ValidValid("standard_user", "secret_sauce");
		
		
		HI_SwagValidInValid_Child2 ch2 = new HI_SwagValidInValid_Child2();
		ch2.ChromeBrowser("https://www.saucedemo.com/");
		ch2.Swag_ValidInValid("standard_user", "243532");

		
		HI_SwagInValidInValid_Child3 ch3=new HI_SwagInValidInValid_Child3();
		ch3.ChromeBrowser("https://www.saucedemo.com/");
		ch3.Swag_InValidInValid("askjfkasj", "2222222222");
	}

}
