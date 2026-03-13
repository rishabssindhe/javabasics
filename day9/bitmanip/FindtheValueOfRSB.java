package day9.bitmanip;

public class FindtheValueOfRSB {
    public static void main(String[] args) {
        int n=12;// 12=1100 rsb=4
        int result=n& -n;                        //-n is bitwise not
        System.out.println(result);
    }
}
