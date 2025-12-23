package String;
import java.util.*;
public class RemoveCharacters {
    public static String ans1(String str){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<'z') || (ch>='A' && ch<='Z')) result.append(ch);
            else continue;
        }
        return result.toString();
    }
    public static String ans(String str){
        String ans=""; //creating empty ans string
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); //checking each character
            if((ch>='a' && ch<'z') || (ch>='A' && ch<='Z')) ans+=ch; //is alphabets adding in ans
            else continue; //skip the iteration if not alphabet
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=ans1(str);
        System.out.println("String after removal of charactes except alphabets:"+str1);
    }
}
