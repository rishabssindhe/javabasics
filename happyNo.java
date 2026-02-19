import java.util.*;
public class happyNo {
    public static void main(String[] args) {
        int n,b=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        n=sc.nextInt();
        int temp=n;
        int sum=0;
        
       
        while(temp!=0){
            int d=temp%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            sum+=fact;
            temp=temp/10;

    }
    temp=sum;

    if(temp==n){
        System.out.println("Strong Number");

    }
    else
        System.out.println("NOT strong");

}
}