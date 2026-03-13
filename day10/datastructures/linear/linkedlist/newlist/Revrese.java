package day10.datastructures.linear.linkedlist.newlist;

import java.sql.SQLOutput;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=next;
    }
}
public class Revrese {
    static Node head;

    static void Insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    static void printEven(){
        System.out.println("Even elements are ");
        Node temp=head;
        while(temp!=null){
            if((temp.data%2)==0){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    static void printOdd(){
        System.out.println("Odd elements are");
        Node temp=head;
        while(temp!=null){
            if((temp.data%2)==1){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in list ");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" elements ");
        for(int i=0;i<n;i++){
            Insert(sc.nextInt());
        }
        display();
        reverse();
        System.out.println(" ");
        display();
        System.out.println(" ");
        printEven();
        printOdd();
    }
}
