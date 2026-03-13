package day8.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveorders=new ArrayList<>();
        liveorders.add("Order 1");
        liveorders.add("Order 2");
        liveorders.add("Order 3");
        liveorders.add("Order 4");
        System.out.println("Orders exist ?"+liveorders.contains("Order 1"));
        System.out.println("Live orders :"+liveorders);
        liveorders.clear();
        System.out.println("Live orders now"+liveorders);
    }
}
