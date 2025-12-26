package LinkedList;

public class AddTwoNumbers {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node add(Node l1,Node l2){
          Node head=new Node(100);
          Node temp=head;
          int carry=0;
          while(l1!=null || l2!=null){
              int sum=0+carry;
              if(l1!=null){
                  sum+=l1.data;
                  l1=l1.next;
              }
              if(l2!=null){
                  sum+=l2.data;
                  l2=l2.next;
              }
              carry=sum/10;
              sum=sum%10;
              Node newNode=new Node(sum);
              temp.next=newNode;
              temp=newNode;
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
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(3);
        a.next=b;
        b.next=c;
        c.next=null;
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(4);
        d.next=e;
        e.next=f;
        f.next=null;

        a=add(a,d);
        display(a);
    }
}
