package iot;

public class Automorphic {
	public static void main(String args[])
	{
		int n=25,temp=n;
		int sq=n*n;
		while(temp!=0)
		{
			if((temp%10)!=(sq%10)) {
				System.out.println("No");return;}
			temp/=10;
			sq/=10;
		}
		System.out.println("Yes");
	}
}
