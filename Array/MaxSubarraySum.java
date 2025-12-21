package Array;
import java.util.*;
public class MaxSubarraySum {
    public static int maxSubArraySum(int arr[],int n){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){ //linear time complexity(Kadane's Algoritm)
         currSum+=arr[i];
         maxSum=Math.max(currSum,maxSum);
         if(currSum<0){  // if array contain negative no then max sum will be negative
             currSum=0;  //that's why this condition is after calculation maxsum once
         }
        }
        return maxSum;
    }
    public static int subarraySum(int arr[],int n){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){ //brute force approach -->O(n^2)
            int curr_sum=0;
            for(int j=i;j<n;j++){  //add upto ith element
                curr_sum+=arr[j];
                max_sum=Math.max(curr_sum,max_sum); //max ele
            }
        }
        return max_sum;
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
//        int sum=subarraySum(arr,n);  //by brute force approach
//        System.out.println("max SubArray sum is:"+sum);

        int sum=maxSubArraySum(arr,n);
        System.out.println("Max Subarray Sum:"+sum);
    }
}
