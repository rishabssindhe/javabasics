package day9.lambdaexpressions;

import java.util.ArrayList;
// Java Streams ::
public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(7);
        list.add(3);
        list.forEach(System.out::println);//STREAM API Java
        list.forEach(n-> System.out.println(n));// Lambda
    }
}
