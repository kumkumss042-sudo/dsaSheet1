package Matrix;
import java.util.Scanner;
public class SearchIn2DArray {
    public static boolean search(int arr[][],int target){
        int row=arr.length;
        int col=arr[0].length;
        int low=0,high=row*col-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            int r=mid/col;
            int c=mid%col;
            if(arr[r][c]==target) return true;
            else if(arr[r][c]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter target");
        int target=sc.nextInt();
        boolean ans=search(arr,target);
        System.out.println(ans);
    }
}
