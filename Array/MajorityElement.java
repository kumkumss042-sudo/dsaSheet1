package Array;
import java.util.*;
public class MajorityElement {
    public static int majorityEle2(int arr[]){
        int freq=0,ans=0;
        for(int i=0;i<arr.length;i++){
            if(freq==0) ans=arr[i];
            if(ans==arr[i]) freq++;
            else freq--;
        }
        return ans;
    }
    public static int majorityEle1(int arr[]){
        Arrays.sort(arr);  //sorting an array
      int freq=1,ans=arr[0];
      for(int i=1;i<arr.length;i++){
          if(arr[i]==arr[i-1]) freq++; //if same ele is met increase freq by 1
          else{
              freq=1;     //if next ele is distict update freq=1 for next ele count
              ans=arr[i]; //update and with the curr encountered ele
          }

          if(freq>(arr.length/2)) return ans; //if freq>n/2 return max
      }
      return -1;
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
        int x=majorityEle2(arr);
        System.out.println("Majority Element in the array:"+x);
    }
}
