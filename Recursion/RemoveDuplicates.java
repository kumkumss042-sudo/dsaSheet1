package Recursion;
import java.util.*;
public class RemoveDuplicates {
    public static void remove(int arr[],int index){
        if(index==arr.length) return;
        for(int i=0;i<index;i++){
            if(arr[i]==arr[index]){ //comparison
                arr[index]=-1;
                break;
            }
        }
        //recursive call
        remove(arr,index+1);

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
        remove(arr,0);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
