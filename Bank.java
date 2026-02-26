package inheritence;

public class Bank {
	void interest(){
		System.out.println("Bank provides interest on deposits");
	}
	void interest(double rate) {
		
		System.out.println("Rate of interest on deposits is:"+rate+"%");
	}
	
}
class sbi extends Bank{
	void interest(double rate,int years) {
		double amount=10000;
		double interests=amount*rate*years/100;
		System.out.println("Total interest for "+years+" years is "+interests+"%");
	}
	public static void main(String args[]) {
		sbi lunch=new sbi();
		lunch.interest();
		lunch.interest(8.5);
		lunch.interest(8.5,4);
	}
}
