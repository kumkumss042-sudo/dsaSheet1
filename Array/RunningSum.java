package Array;
import java.util.*;
public class RunningSum {
    public static void runningSum(int arr[],int n){
        for(int i=1;i<n;i++){  //first element itself is the sum from beginning,so initialise ifrom 1
            arr[i]+=arr[i-1];  // adding previous element to all current index element
        }
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
        runningSum(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
