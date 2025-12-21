package Array;
import java.util.*;
public class RotatingArray {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int arr[],int i,int j){
        while(j>i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rightRotate(int arr[],int k){
        int n=arr.length;
        k=k%n;    //[1,2,3,4,5] for k=2
        reverse(arr,0,n-k-1);  // [3,2,1,4,5]
        reverse(arr,n-k,n-1);  // [3,2,1,5,4]
        reverse(arr,0,n-1);    // [4,5,1,2,3]
        System.out.println("right rotation:");
        printArray(arr);
    }
    public static void leftRotate(int arr[],int k){
        int n=arr.length;
        k=k%n;    //for k=2  arr[]=[1,2,3,4,5]
        reverse(arr,0,k-1);  //[2,1,3,4,5]
        reverse(arr,k,n-1);    // [2,1,5,4,3]
        reverse(arr,0,n-1);  // [3,4,5,1,2]
        System.out.println("left rotation:");
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter value of k"); //parameter for rotation
        int k=sc.nextInt();
        System.out.println("enter choice for rotation-->(0 or 1)");
        int choice=sc.nextInt();
        if(choice==1){
            leftRotate(arr,k);
        }
        else rightRotate(arr,k);
    }
}
