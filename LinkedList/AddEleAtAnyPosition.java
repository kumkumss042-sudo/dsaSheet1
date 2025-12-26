package LinkedList;
import java.util.*;
public class AddEleAtAnyPosition {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node head = null;
    public static int size=0;
    public static int size(){
        Node temp=head;
        int count=0;
        while(temp!=head){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static int getAt(int index){
        Node temp=head;
        if(index<0 || index>=size()) return -1;
        if(index==0) return head.data;
        else{
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertAtStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public static void insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;
    }
    public static void insertAt(int data,int index){
        Node newNode=new Node(data);
        Node temp=head;
        if(index<0 || index>size) return;
        else if(index==0){
            insertAtStart(data);
            return;
        }
        else if(index==size){
            insertAtEnd(data);
            return;
        }
        else{
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }
    }
    public static void deleteAtStart(){
        if(head==null) return;
        head=head.next;
        size--;
    }
    public static void deleteAtEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    public static void deleteAt(Node head,int index){
        Node temp=head;
        if(index<0 || index>size()) return;
        else if(index==0){
            deleteAtStart();
            size--;
            return;
        }
        else{
            for(int i=0;i<=index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    public static void main(String[] args) {
       insertAtStart(10);
       display();
       insertAtEnd(20);
       display();
     insertAt(30,1);
     display();
     insertAtEnd(40);
     display();
     deleteAtEnd();
     display();
    }
}
