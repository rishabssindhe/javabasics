package day9.hasttable;

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();

        ht.put(117,"Tejas MG");
        ht.put(84,"Rishab");
        ht.put(92,"Sathwik D Bhat");
        ht.put(100,"Shreyas Gowda G");
        ht.remove(100);
        for(Map.Entry<Integer,String> entry : ht.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        ht.remove(100);
        String str="Java";
        System.out.println(str.hashCode());
        System.out.println(ht.getOrDefault(100,"Not found"));

    }
}
