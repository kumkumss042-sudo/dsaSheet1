package Recursion;
import java.util.*;
public class PrintIncOrDec {
    public static void printIncreasing(int n){
        if(n==0) return;  //base case
        printIncreasing(n-1); //subproblem
        System.out.print(n+" "); //self work
    }
    public static void printDecreasing(int n){
        if(n==0) return; //base case
        System.out.print(n+" "); //self work
        printDecreasing(n-1); //sub problem
    }
    public static void printDecInc(int n){
        printDecreasing(n);
        printIncreasing(n);
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
//        printIncreasing(n);
//        System.out.println();
//        printDecreasing(n);
        printDecInc(n);
    }
}
