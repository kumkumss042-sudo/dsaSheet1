package Array;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        int min;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]) {
                    min=j;
                }
            }
               int temp=arr[min];
                    arr[min]=arr[i];  //swapping
                    arr[i]=temp;
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
        selectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
