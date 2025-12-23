package String;
import java.util.*;
public class RemoveDuplicates {
    public static String remove4(String str){
        StringBuilder ans=new StringBuilder();
        int c1[]=new int[26];
        int c2[]=new int[26];
        for(int i=0;i<26;i++){
            c1[i]=c2[i]=0;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(asci>=97){
                if(c1[asci-97]==0) ans.append(ch);
                c1[asci-97]=1;
            }
            else{
                if(c2[asci-65]==0) ans.append(ch);
                c1[asci-65]=1;
            }
        }
        return ans.toString();
    }
    public static String remove3(String str){
        HashSet<Character>visited=new HashSet<>();
        StringBuilder ans=new StringBuilder();
         for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
             if(!visited.contains(ch)){
                 ans.append(ch);
                 visited.add(ch);
             }
         }
         return ans.toString();
    }
    public static String remove2(String str){
        StringBuilder ans=new StringBuilder();
        boolean visited[]=new boolean[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!visited[ch]){
                ans.append(ch);
                visited[ch]=true;
            }
        }
        return ans.toString();
    }
    public static String remove1(String str){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!result.toString().contains(String.valueOf(ch))) result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        String ans=remove4(str);
        System.out.println(ans);
    }
}
