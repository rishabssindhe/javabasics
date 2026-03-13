package day8.collections.lists;

import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Laptop");
        l.add("Keyboard");
        l.add("Controller");
        l.add("Mouse");
        l.remove("Controller");
        l.set(1,"Graphics Card");
        System.out.println("Cark  details:"+l);
        System.out.println("no of items in Cart "+l.size());
    }
}
