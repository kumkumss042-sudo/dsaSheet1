package Array;
import java.util.*;
public class Equilibrium {

    public static int totalSum(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }

    public static int findEquilibrium(int arr[]){
        int prefix_sum=0,suffix_sum=0;
        int total_sum=totalSum(arr);
      for(int i=0;i<arr.length;i++){
          suffix_sum=total_sum-prefix_sum-arr[i];
          if(suffix_sum==prefix_sum) return arr[i];
          prefix_sum+=arr[i];  //adding current ele
      }
      return -1;
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
        int ele=findEquilibrium(arr);
        System.out.println("equilibrium ele:"+ele);
    }
}
