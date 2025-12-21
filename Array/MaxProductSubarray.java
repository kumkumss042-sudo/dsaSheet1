package Array;
import java.util.*;
public class MaxProductSubarray {
    public static int maxSubarray(int arr[],int n){
        int leftProduct=1,rightProduct=1,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(leftProduct==0) leftProduct=1;  //if we traversed through 0 product become 1
           else if(rightProduct==0) rightProduct=1;
            leftProduct*=arr[i];    //multiply from beg
            rightProduct*=arr[n-i-1]; //multiply from last
            max=Math.max(max,Math.max(leftProduct,rightProduct)); //max from start,end and already calculated max
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        System.out.println("enter no of elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int product=maxSubarray(arr,n);
        System.out.println("Maximum subarray product:"+product);
    }
}
