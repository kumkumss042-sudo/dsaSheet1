package Array;
import java.util.*;
public class UnionAndIntersection {
    public static void intersection(int arr[],int brr[]){
        int left=0,right=0; //two pointer approach
        List<Integer>ans=new ArrayList<>();
        while(left<arr.length && right<brr.length ){
            //remove duplicates
            while(left>0 && left<arr.length && arr[left]==arr[left-1]) left++;
            while(right>0 && right<brr.length && brr[right]==brr[right-1]) right++;
            //is one array is traversed
            if(left>=arr.length || right>=brr.length){
                break;   //to terminate loop
            }
            //comparison
            if(arr[left]==brr[right]){
                ans.add(arr[left]);
                left++;
                right++;
            }
        }
        System.out.println("intersection of array is:");
        System.out.print(ans);
    }
    public static void method2(int arr[],int brr[]){
        HashSet<Integer>union=new HashSet<>();
        HashSet<Integer>intersection=new HashSet<>();
        for(int x:arr){
            union.add(x);
        }
        for(int x:brr){
            if(union.contains(x)) intersection.add(x); //adding only common elements
        }
        for(int x:brr){
            union.add(x);   //adding all distict elementsk
        }

        System.out.println("union:"+union);
        System.out.println("intersection:"+intersection);
    }
    public static void union(int arr[],int brr[]) {
        int left=0,right=0;
        List<Integer>ans=new ArrayList<>();
      while(left<arr.length || right<brr.length){ //unitl both array is traversed
          //remove duplicates
          while(left>0 && left<arr.length && arr[left]==arr[left-1]) left++;
          while(right>0 && right<brr.length && brr[right]==brr[right-1]) right++;
          //if whole array is traversed
          if(left>=arr.length){
              ans.add(brr[right]);
              right++;
              continue;
          }
          if(right>=brr.length){
              ans.add(arr[left]);
              left++;
              continue;  //to again check the condition for ele before comparison bcz one array is traversed
          }
          //comparison
          if(arr[left]<brr[right]){
              ans.add(arr[left]);
              left++;
          }
          else if(arr[left]>brr[right]){
              ans.add(brr[right]);
              right++;
          }
          else{
              ans.add(brr[right]);
              right++;
              left++;
          }
      }
        System.out.println("the union of set is:");
        System.out.print(ans);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter size of first and second array");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("enter elements");
        int arr[]=new int[n1];
        int brr[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            brr[i]=sc.nextInt();
        }
      //  method2(arr,brr);
        System.out.println("select choice (0 or 1)");
       int choice=sc.nextInt(); //0-->union 1-->intersection
        if(choice==1) union(arr,brr);
        if(choice==0) intersection(arr,brr);
    }
}
