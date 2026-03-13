package day8.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class FlashSaleOrders {
    public static void main(String[] args){
        Collection<Integer> orderids=new ArrayList<>();
        orderids.add(11);
        orderids.add(12);
        orderids.add(13);
        orderids.add(14);
        System.out.println("Orders received :"+ orderids);
        System.out.println("No of orders "+orderids.size());
    }
}
