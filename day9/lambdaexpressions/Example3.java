package day9.lambdaexpressions;
interface Square{
    int Calculate(int x);
}
public class Example3 {
    public static void main(String[] args) {
        Square s=x-> x*x;
        System.out.println(s.Calculate(8));
    }
}
