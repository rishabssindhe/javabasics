package day9.map;
import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("01","1sg23is084");
        hashmap.put("03","1sg23is092");
        hashmap.put("04","1sg23is114");
        hashmap.put("02","1sg23is084");
        for(Map.Entry<String,String> entry:hashmap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Map<String,String> hashmap1=new LinkedHashMap<>(); //It is used to maintain the insertion order
        hashmap1.put("01","1sg23is084");  // we use this data structure to find the frequency we use hashmap
        hashmap1.put("03","1sg23is092");
        hashmap1.put("04","1sg23is114");
        hashmap1.put("02","1sg23is084");
        for(Map.Entry<String,String> entry:hashmap1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
