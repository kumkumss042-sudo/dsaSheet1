package Recursion;
import java.util.*;
//we have to return the no of digits in a number which divides that no
public class CountDigits {
    public static int countDigit(int n,int count){
        int s=n;
        while(s>0){
            int r=s%10;
            if(r!=0) if(n%r==0) count++;
            s=s/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        int count=countDigit(n,0);
        System.out.println("Count of digits are:"+count);
    }
}
