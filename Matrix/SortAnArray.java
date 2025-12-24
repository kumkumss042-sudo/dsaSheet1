package Matrix;
import java.util.*;
public class SortAnArray {
    public static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        //copy data into temporary left and right arrays
        for(int i=0;i<n1;i++) left[i]=arr[i+l];
        for(int j=0;j<n2;j++) right[j]=arr[mid+j+1];
        //merging two arrays by comparisons
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]) arr[k++]=left[i++];
            else if(left[i]>right[j]) arr[k++]=right[j++];
        }
        //copying all element in an array
        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
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
        mergeSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
