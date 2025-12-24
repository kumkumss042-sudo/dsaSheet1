package Recursion;
import java.util.*;
public class FibonacciNumber {
    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        else return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no");
        int n=sc.nextInt();
        int no=fibo(n);
        System.out.println(n+" fibonacci no is:"+no);
    }
}
