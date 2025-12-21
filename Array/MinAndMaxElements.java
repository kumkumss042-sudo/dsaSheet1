package Array;
import java.util.*;
public class MinAndMaxElements {
    public static int minMaxElement(int nums[],int n){
        int i=0,j=0;
        for(int k=0;k<n;k++){
            if(nums[i]<nums[k]) i=k; //max
            else if(nums[j]>nums[k]) j=k; //min
        }
        //case 1-->delete from front
        int front=Math.max(i+1,j+1);
        //case 2-->delete from back
        int  back=Math.max(n-i,n-j);
        //case 3-->delete from front and back
        int frontback=Math.min(i+1+n-j,j+1+n-i);

        return Math.min(frontback,Math.min(front,back));
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
        int min=minMaxElement(arr,n);
        System.out.println("Min no of operations to delete min and max ele is:"+min);
    }
}
