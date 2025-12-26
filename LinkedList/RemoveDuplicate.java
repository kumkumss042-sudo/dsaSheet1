package LinkedList;

public class RemoveDuplicate {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node remove(Node head){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data!=temp.next.data){
                temp=temp.next;
            }
            else{
                temp.next=temp.next.next;
            }
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(1);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(3);
        Node f=new Node(3);
        Node g=new Node(4);
        Node h=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=null;
        a=remove(a);
        display(a);
    }
}
