package Matrix;
import java.util.*;
public class MedianInRowwiseSortedMatrix {
    public static int median(int arr[][],int r,int c){
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans.add(arr[i][j]); //adding all ele in list
            }
        }
        //time complexity-->O(m*n) log(m*n)
        //space-->O(m*n)
        Collections.sort(ans);
        int mid=ans.size()/2; //finding the median
        return ans.get(mid);
    }
    public static int lowerbound(int arr[],int target){
        int low=0,high=arr.length-1;
        int mid=(low+high)/2;
        while(high>=low){
            if(arr[mid]<=target) low=mid+1;
            else high=mid-1;
            mid=(high+low)/2;
        }
        return low;
    }
    public static int median2(int mat[][],int r,int c) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][c-1]);
        }
        int desired=(r*c)/2;
        while(high>=low){
            int mid=(low+high)/2;
            int count=0;
            for(int i=0;i<r;i++){
                count+=lowerbound(mat[i],mid);
            }
            if(desired>=mid)  low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter elements");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans=median2(arr,r,c);
        System.out.println(ans);
    }
}
