package iot;
import java.util.*;
public class method {
	int fact(int d)
	{
		int f=1;
		for(int i=1;i<=d;i++)
			f=f*i;
		return f;
	}
	boolean isStrong(int n)
	{
		int temp=n;
		int sum=0;
		while(temp!=0)
		{
			sum+=fact(temp%10);
			temp/=10;
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		method obj=new method();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if its is happy or not");
		int l=sc.nextInt();
		System.out.println(obj.isStrong(l));
		sc.close();
	}

}
