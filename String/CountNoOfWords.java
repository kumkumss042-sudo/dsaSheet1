package String;
import java.util.*;
public class CountNoOfWords {
    public static int noOfWord(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        int count=noOfWord(str);
        System.out.println("No of words in a String is:"+count);
    }
}
