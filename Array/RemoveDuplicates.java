package Array;
import java.util.*;
public class RemoveDuplicates {
    public static int remove(int arr[]){
        int index=1;  //position to place next unique element
        int n=arr.length;
        for(int i=1;i<arr.length;i++){ //index 0th element is taken as it is
            if(arr[i]!=arr[i-1]){    //inplace comparison between consecutive element
                arr[index++]=arr[i];  // 0(n) -->single pass
            }
        }
        //return only the unique portion
        return index;
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

       int ans=remove(arr);
       System.out.println("length of array after removing duplicates:"+ans);
        
    }
}
