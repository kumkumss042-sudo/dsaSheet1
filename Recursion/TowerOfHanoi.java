package Recursion;
import java.util.Scanner;
public class TowerOfHanoi {
    public static int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n==1) return 1;
        return towerOfHanoi(n-1,from,aux,to)+1+towerOfHanoi(n-1,aux,to,from);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of disks");
        int n=sc.nextInt();
        int no=towerOfHanoi(n,1,3,2);
        System.out.println("required steps to move the disk from source to destination is:"+no);
    }
}
