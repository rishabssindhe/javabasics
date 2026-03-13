package day8.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,4,5,6,4,4};
        System.out.println(Arrays.toString(arr));
        Set<Integer> i=new HashSet<>();
        for(int x: arr){
            i.add(x);
        }
        System.out.println(i);
        Set<Integer> i2=new HashSet<>();
        i2.addAll(Arrays.asList(1,2,3,2,33,44,3,2,3,3,2,2,34,3,3,2,2,4,5,5,6,4,5,5,4,2,4,23,2));
        System.out.println(i2);
    }
}
