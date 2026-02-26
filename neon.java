package iot;

public class neon {
	public static void main(String args[])
	{
		int n=10,temp=n,sum=0;
		int sq=n*n;
		while(sq!=0)
		{
			sum+=sq%10;
			sq/=10;
		}
		if(sum==temp) {
			System.out.println("It is Neon number");
		}
		else
			System.out.println("Not a Neon number");
	}
}
