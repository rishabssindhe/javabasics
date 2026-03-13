package day9.bitmanip;

public class Power2 {
    public static void main(String[] args) {
        int n=8;
        if((n&(n-1))==0){ //& is a bitwise AND                 //n=   8=1000
            System.out.println("Is power of 2");               //n-1= 7=0111
        }                                                      //and    0000
        else System.out.println("not a power of 2");
    }
}
