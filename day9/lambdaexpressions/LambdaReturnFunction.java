package day9.lambdaexpressions;
interface Calculator{
    int operate(int a,int b);
}
public class LambdaReturnFunction {
    public static void main(String[] args) {
        Calculator m=(a,b)->{
                int result=a*b;
                return result;
    };
        System.out.println("Multiplication "+m.operate(3,4));
    }
}
