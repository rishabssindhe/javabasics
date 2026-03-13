package day9.iterator;

import java.util.*;

public class RemoveUsingLambda {
    public static void main(String[] args) {
        HashSet<Integer> list=new HashSet<>();
        list.add(62);
        list.add(3);
        list.add(25);
        list.add(2);
        list.add(22);
        list.add(7);
        list.removeIf(n->n%2==0); // Lambda function used in single line to remove items with a
                                         // condition in a collection
        System.out.println(list);
    }
}
