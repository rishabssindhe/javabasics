package day9.bitmanip;

public class TurnOffRSB {
    public static void main(String[] args) {
        int n=18;
        int result= n&(n-1);
        System.out.println(result);
    }
}
