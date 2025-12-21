package Array;
import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean swap=false; //boolean to track swap
            for(int j=0;j<n-i-1;j++){ //last ith ele already in place
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true; //mark swap occurs
                }
            }
            if(!swap) return; //if not ele will swap(already swapped) then return
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
        bubbleSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
