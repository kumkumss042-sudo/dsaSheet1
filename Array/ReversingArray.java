package Array;
import java.util.*;
public class ReversingArray {
    public static void reverseArray(ArrayList<Integer> arr){
        int i=0;
        int j=arr.size()-1; //to reverse upto any index just update value of i
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter elements");
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        reverseArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
