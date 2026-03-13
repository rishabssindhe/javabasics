package day8.collections.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoar {
    public static void main(String[] args) {
        Set<Integer> scores=new TreeSet<>();//Always order is ascending order
        scores.add(0);
        scores.add(98);
        scores.add(18);
        scores.add(17);
        System.out.println(scores);
    }
}
