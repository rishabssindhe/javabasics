package day9.map;
import java.util.*;
public class FreqMap { // imp que in interview
    public static void main(String[] args) {
        int[] arr={2,5,1,7,8,8,2,5,3,4,4,4,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        System.out.println(map.get(4));
    }
}
