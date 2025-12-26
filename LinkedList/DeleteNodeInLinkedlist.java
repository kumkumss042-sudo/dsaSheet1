package LinkedList;

public class DeleteNodeInLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void deleteNode(Node node){
        node.data=node.next.data;
        node.next=node.next.next;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        deleteNode(b); //here we have given only node to delete it
        display(a);
    }
}
