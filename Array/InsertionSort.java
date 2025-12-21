package Array;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[]){
      int n=arr.length;
      for(int i=1;i<n;i++){
          for(int j=i;j>0;j--) {
              if (arr[j - 1] > arr[j]) {
                  int temp = arr[j - 1];
                  arr[j - 1] = arr[j];
                  arr[j] = temp;
              }
          }
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
        insertionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
