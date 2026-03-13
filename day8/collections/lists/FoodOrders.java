package day8.collections.lists;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        q.add("Pen"); //strict capacity wise
        q.offer("Umbrella");//not strict
        System.out.println("Orders:"+q);
        System.out.println("Serving:"+q.poll());
        System.out.println("Pending:"+q);
    }

}
