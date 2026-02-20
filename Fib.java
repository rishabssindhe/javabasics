package iot;

public class Fib {
	public static void fibonacci(int n) {
		int a =0,b=1;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int t=a+b;
			a=b;
			b=t;
		}
	}
	public static void main(String args[])
	{
		fibonacci(7);
	}
}
