import java.util.Scanner;
public class count {
    public static void main(String args[]){
        int n,cnt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter No:");
        n=sc.nextInt();
        if(n==0){
                System.out.println("digit is 1");
            }
        else{
            while(n!=0){
            cnt++;
            n=n/10;
        }
        System.out.println("No of digits are:"+cnt);
    }}

}
