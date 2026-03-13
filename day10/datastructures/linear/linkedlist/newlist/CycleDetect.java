package day10.datastructures.linear.linkedlist.newlist;
class Node1{
int data;
Node1 next;
Node1(int data){
this.data=data;
this.next=null;
}
}
public class CycleDetect {
    static Node1 head = null;
    static void createList(){
        head = new Node1(1);
        head.next = new Node1(20);
        head.next.next= new Node1(30);
        head.next.next.next=new Node1(40);
        //creating a cycle
        head.next.next.next.next=new Node1(20);
    }
    static boolean hasCycle(){
        Node1 slow=head;
        Node1 fast=head;
        while(fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        createList();
        if(hasCycle()){
            System.out.println("Cycle Detected");
        }
        else System.out.println("No cycle Detected");
    }
}
