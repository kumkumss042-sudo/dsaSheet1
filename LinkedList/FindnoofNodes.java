package LinkedList;

public class FindnoofNodes {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int count(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
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
        int length=count(a);
        System.out.println("No of nodes in a linked list is:"+length);
    }
}
