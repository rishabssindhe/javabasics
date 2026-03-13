package day10.datastructures.linear.linkedlist.newlist;
class Node12{
int data;
Node12 next;
Node12(int data){
this.data=data;
this.next=null;
}
}
public class FloydsAlgo {
    static Node12 head;
    public static void insert(int data){
        Node12 newnode=new Node12(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node12 temp=head;
        while(temp!=null){
            temp=newnode;
            temp=temp.next;
        }
        temp.next=null;
    }
    public static int findmiddle(Node12 head){
        Node12 slow=head;
        Node12 fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node12 head1 = new Node12(1);
        head1.next = new Node12(2);
        head1.next.next = new Node12(3);
        head1.next.next.next = new Node12(4);
        head1.next.next.next.next = new Node12(5);
        System.out.println("Middle Node data: "+findmiddle(head1));
        //Example 2
        Node12 head2 = new Node12(1);
        head2.next = new Node12(2);
        head2.next.next = new Node12(3);
        head2.next.next.next = new Node12(4);
        head2.next.next.next.next = new Node12(5);
        head2.next.next.next.next.next = new Node12(6);
        System.out.println("Middle Node data: "+findmiddle(head2));
    }
}
