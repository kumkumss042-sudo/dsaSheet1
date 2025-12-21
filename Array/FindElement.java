package Array;
import java.util.*;
public class FindElement {
    public static void findingElement(int arr[],int target){
        int loc=-1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target) loc=i;
       }
        if(loc==-1) System.out.println("target not found");
        else System.out.println("target found at "+loc+" index");
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

        System.out.println("enter target element");
        int target=sc.nextInt();
        findingElement(arr,target);

    }
}
