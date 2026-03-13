package day9.map;

public interface Add {
    int sum(int a ,int b);
}
class Example2{
    public static void main(String[] args) {
        Add s=(a,b)->a+b;
        int result=s.sum(10,20);
        System.out.println(result);
    }
}
