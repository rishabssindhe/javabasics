import java.util.*;
public class palindrome {
    public static void main(String args[]){
        int n,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        n=sc.nextInt();
        int temp=n;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not palindrome");

sc.close();
    }

}
