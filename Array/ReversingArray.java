package Array;
import java.util.*;
public class ReversingArray {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];  //for swapping
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverseArray(int arr[]){
        int i=0,j=arr.length-1;  //two pointer approach
        while(i<j){
            swap(arr,i,j);  //time complexity-->O(n)
            i++;            //space complexity-->O(1)
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
