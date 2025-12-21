package Array;
import java.util.*;
public class FindRepeating {
    public static int find(int arr[]){
        Arrays.sort(arr); //sort array in nlogn time
        for(int i=1;i<arr.length;i++){  //comparing consecutive ele
         if(arr[i]==arr[i-1]) return arr[i];
        }
        return -1; //if no repeating ele found return -1
    }
    public static int find2(int arr[]){
        int slow=0,fast=0; //phase 1->intersection
            slow=arr[slow];
            fast=arr[arr[fast]];
        while(slow!=fast){ //checking the intersection of point
            slow=arr[slow];
            fast=arr[arr[fast]]; //when slow pointer meets fast pointer it is not necessary that it is repating ele
        }
        //phase 2-->to detect the entrance to the cycle
        int finder=0;
        while(slow!=finder){
            slow=arr[slow];
            finder=arr[finder];
        }
        return finder;
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
        int ele=find(arr);
        System.out.println("repeating ele:"+ele);
        int ele1=find2(arr);
        System.out.println("repeating ele:"+ele1);
    }
}
