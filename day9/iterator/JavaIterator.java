package day9.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(62);
        list.add(3);
        list.add(25);
        list.add(2);
        list.add(22);
        list.add(7);
        Iterator<Integer> it=list.iterator();
        //remove the elements which are greater than 10
        while(it.hasNext()){
            Integer i=it.next();
            if(i>10){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
