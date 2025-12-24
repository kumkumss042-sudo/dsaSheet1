package Recursion;
import java.util.*;
public class SumOFArray {
    public static int total(int arr[],int index){
        if(index==arr.length) return 0; //base case
        else return arr[index]+total(arr,index+1); //adding curr ele and call to next one
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=total(arr,0);
        System.out.println("Sum of all elements of an array is:"+sum);
    }
}
