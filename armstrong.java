import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        n=sc.nextInt();
        int cnt=0,temp=n,sum=0;
        while(temp!=0){
            cnt++;
            temp=temp/10;
        }
        temp=n;
        while(temp!=0){
            int d=temp%10;
            sum+=Math.pow(d, cnt);
            temp=temp/10;

        }
        if(n==sum){
            System.out.println("Armstrong");
        }
        else
            System.out.println("Not armstrong");
        sc.close();
    }

}
