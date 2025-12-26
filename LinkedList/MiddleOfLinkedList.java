package LinkedList;

public class MiddleOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node middleOfLinkedList(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(7);
        Node e=new Node(5);
        Node f=new Node(1);
        Node g=new Node(0);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=null;
        a=middleOfLinkedList(a);
        display(a);
    }
}
