package inheritence;

public class Calc {
	static void cal(int a,int b)
	{
		System.out.println(a+b);
	}
	static void cal(double a,double b) {
		System.out.println(a-b);
	}
	public static void main(String args[])
	{
		cal(2,3);
		cal(2.8,1.4);
	}

}
