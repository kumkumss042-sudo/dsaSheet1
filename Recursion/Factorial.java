package Recursion;
import java.util.*;
public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1) return 1; //base case
        else return n*fact(n-1); //subproblem
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter no to find factorial");
     int n=sc.nextInt();
     int factorial=fact(n);
        System.out.println("Factorial of entered no is:"+factorial);
    }
}
