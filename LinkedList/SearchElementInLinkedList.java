package LinkedList;

public class SearchElementInLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node search(Node head,int key){
       while(head!=null){
           if(key==head.data){
               return head;
           }
           head=head.next;
       }
        return null;
    }
    public static Node searchByRecursion(Node head,int key){
        while(head!=null){
            if(key==head.data) return head;
            head=head.next;
        }
        return searchByRecursion(head.next,key);
    }
    public static Node moveToFront(Node head,int key){
        Node p=head;
        Node q=null;
        while(p!=null){
            if(key==p.data) {
               q.next=p.next;
               p.next=head;
               head=p;
               return head;
            }
            q=p;
            p=p.next;
        }
        return null;
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
        int key=7;
        Node result=moveToFront(a,key);
        System.out.println(result.data);
    }
}
