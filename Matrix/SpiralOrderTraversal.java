package Matrix;
import java.util.*;
public class SpiralOrderTraversal {
    public static List<Integer> spiralTraversal(int arr[][],int r,int c) {
         int top=0,bottom=r-1,left=0,right=c-1,total=0;
         List<Integer>ans=new ArrayList<>();
         while(total<r*c){
             for(int j=left;j<=right && total<r*c;j++){
                 ans.add(arr[top][j]);
                 total++;
             }
             top++;
             for(int i=top;i<=bottom && total<r*c;i++){
                 ans.add(arr[i][right]);
                 total++;
             }
             right--;
             for(int j=right;j>=left && total<r*c;j--){
                 ans.add(arr[bottom][j]);
                 total++;
             }
             bottom--;
             for(int i=bottom;i>=top && total<r*c;i--){
                 ans.add(arr[i][left]);
                 total++;
             }
             left++;
         }
         return ans;
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
        List<Integer>ans=spiralTraversal(arr,r,c);
        System.out.print(ans);
    }
}
