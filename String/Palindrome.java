package String;
import java.util.*;
public class Palindrome {
    public static boolean isAlphaNumeric(char ch){
        if((ch>='0' && ch<='9')|| (Character.toLowerCase(ch)>'a'&& Character.toLowerCase(ch)<'z'))
        return true; //only accepts alphanumeric character like digits ans alphabets
else return false;
    }
    public static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while(right>left){
            if(!isAlphaNumeric(s.charAt(left))){
                left++; continue;  //if left character is non alpha numeric skip that iteration
            }
            if(!isAlphaNumeric(s.charAt(right))){
                right--; continue; //if right one is non alpha numeric skip that iteration
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) return false;
            left++; //check both left ans right character are equal or not
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     boolean ans=isPalindrome(s);
        System.out.println(ans);
    }
}
