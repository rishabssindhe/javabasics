package day8.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> actions=new ArrayDeque<>();
        actions.addLast("User Types A");
        actions.addLast("User Types b");
        actions.addLast("User deletes b");
        System.out.println("Undo "+actions.removeLast());
        System.out.println("Remaining actions:"+actions);
    }
}
