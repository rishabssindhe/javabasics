package day9.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(8);
        System.out.println(list);
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);
        Collections.sort(list,(a,b)->a-b);
        System.out.println(list);
    }
}
