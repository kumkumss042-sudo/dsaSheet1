package Array;
import java.util.*;
public class CountElement {
    public static int freq(int arr[]){
       int count=0,max=0;
       int freq[]=new int[101]; //given 0<nums[i]<100
       for(int x:arr){
           freq[x]++; //treating all ele as indices and when traversed inc freq by 1
       }
       for(int x:freq){
           max=Math.max(x,max);
       }
       for(int x:freq){
           if(x==max) count++;
       }
       return count*max;
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
        int count=freq(arr);
        System.out.println("count of max freq element is:"+count);
    }
}
