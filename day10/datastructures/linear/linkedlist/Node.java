package day10.datastructures.linear.linkedlist;
class ll {
    Node head;
    private int size;
    ll(){
        size=0;
    }
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;// we dont know the address of the next node
            size++;//Increment the size as soon as the data is inserted
        }
    }
    public void printList(){
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        //Create a new node
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
    public void addLast(String data){
        //Create  a new node
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        //If there is multiple nodes, we need to find the last node
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        // At the end of this loop , we will stand at the last node
        //Point the last node next pointer in the new node
        last.next=newNode;

    }
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty, Can't delete the head");
            return;
        }
        // For a single node, the head will point to the next (ie null)
        //For multiple nodes, the head will point to the next (head.next)
        head=this.head.next;
        size--;
    }
    public void removeLast(){

        if(head==null){
            System.out.println("No elements in list to delete");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        //If there is multiple nodes, we need to find the last node
        Node curr=head;
        Node last=head.next;
        while(last.next!=null){
            curr=last;
            last=last.next;
        }
        curr.next=null;
        size--;
        // The last node will be cleared by the JVM if not used
        //So we point the secondLast(curr) to null
    }
    public void removeTarget(String target){
        if(head==null){
            System.out.println("No elements in list to delete");
            return;
        }
        if(head.data.equals(target)){
        head=head.next;
        size--;
        return;
        }
        Node prev = null;
        Node curr=head;
        while(curr!=null&&!curr.data.equals(target)){
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("not found");
        }
        prev.next=curr.next;
        size--;

    }
    public static void main(String[] args) {
        ll sll=new ll();
        sll.addFirst("Data Structures");
        sll.addFirst("learning");
        sll.addFirst("are");
        sll.addFirst("We");
        sll.printList();
        sll.addLast("in");
        sll.addLast("Java");

        sll.printList();
        sll.removeTarget("Java");
        sll.printList();
    }
}
