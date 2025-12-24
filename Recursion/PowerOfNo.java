package Recursion;
import java.util.*;
public class PowerOfNo {
    public static int power(int n,int rev){
        if(rev==0) return 1;  //something^0=1 hence this is the base case
        else return n*power(n,rev-1);  //else multiply no and then decrease expo by 1
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no");
        int n=sc.nextInt();
        //find power of no n raise to power of its reverse
        int s=n;
        int rem,rev=0;
        while(s>0){
            rem=s%10;
            rev=rev*10+rem; //finding rev
            s=s/10;
        }
        int pow=power(n,rev);
        System.out.println("Power of "+n+" raise "+rev+" is:"+pow);
    }
}
