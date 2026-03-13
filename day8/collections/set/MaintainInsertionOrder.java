package day8.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();//It is used to maintain insertion order !!!!!!!

        set.add(2);
        set.add(7);
        set.add(6);
        set.add(9);
        System.out.println(set);
    }
}
