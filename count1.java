package iot;
import java.util.*;
public class count1 {
	static int countbits(int n) {
		int count=0;
		while(n!=0) {
		if((n&1)==1) {
			count++;
			
		}
		n=n>>1;
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		System.out.println("number of 1 in binary is "+countbits(n));
	}

}
