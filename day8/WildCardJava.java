package day8;

import java.util.ArrayList;
import java.util.List;

public class WildCardJava {
    public static void printList(List<?> list) {
        for(Object o:list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("Rishab");
        s.add("Sindhe");
        printList(s);
    }
}
