package day8.collections.lists;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek()); //disp top element
        System.out.println(stack.pop());//remove top element
        System.out.println(stack.size());

        System.out.println(stack);

    }
}
