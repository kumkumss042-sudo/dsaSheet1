package LinkedList;

public class RotateList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node rotate(Node head,int k){
        if(head==null || head.next==null || k==0) return head;
        Node temp=head;
        Node temp1=head;
        //Counting length
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        //circular list
        temp.next=head;
         k=k%length;
        for(int i=1;i<length-k;i++){
            temp1=temp1.next;
        }
        head=temp1.next;
        temp1.next=null;
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
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        int k=2;
        a=rotate(a,k);
        display(a);
    }
}
