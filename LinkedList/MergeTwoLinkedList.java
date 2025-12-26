package LinkedList;

public class MergeTwoLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node merge1(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node head=new Node(0);
        Node temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data>=temp2.data){
                Node newNode=new Node(temp2.data);
                temp.next=newNode;
                temp=newNode;
                temp2=temp2.next;
            }
            else{
                Node newNode=new Node(temp1.data);
                temp.next=newNode;
                temp=newNode;
                temp1=temp1.next;
            }
        }
       if(temp1==null){
           temp.next=temp2;
       }
       else if(temp2==null){
           temp.next=temp1;
       }
        return head.next;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node merge2(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node head=new Node(-1);
        Node temp=head;
        while(temp1!=null && temp2!=null){ //checking both the val
            if(temp1.data<=temp2.data){
                temp.next=temp1;
                temp=temp1;  //without taking any extra space manipulation in given nodes
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null) temp.next=temp2; //if any of them becoming null then add another
        if(temp2==null) temp.next=temp1;
        return head.next;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(4);
        a.next=b;
        b.next=c;
        c.next=null;
        Node d=new Node(1);
        Node e=new Node(3);
        Node f=new Node(6);
        d.next=e;
        e.next=f;
        f.next=null;
        a=merge2(a,d);
        display(a);
    }
}
