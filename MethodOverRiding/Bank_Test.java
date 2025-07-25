package MethodOverRiding;

public class Bank_Test {

	public static void main(String[] args) {
		
		SBI_Child1 sbi=new SBI_Child1();
		sbi.LoanIntrest();
		
		HDFC_Child2 hdfc=new HDFC_Child2();
		hdfc.LoanIntrest();
		
		ICICI_Child3 icici=new ICICI_Child3();
		icici.LoanIntrest();

	}

}
