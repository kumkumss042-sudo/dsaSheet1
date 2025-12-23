package String;
import java.util.*;
public class FreqOfChar {
    public static void freq(String str){
       int freq=1;
       char arr[]=str.toCharArray(); //coverting string in a char array
       Arrays.sort(arr); //sorting characters in lexicographical order
       for(int i=1;i<arr.length;i++){
           if(arr[i]==arr[i-1]) freq++; //checking currentchar with previous character and inc freq
           else{
               System.out.print(arr[i-1]);
               System.out.print(freq+" ");
               freq=1; //reset the freq to 1
           }
       }
    }
    public static void freq2(String str){
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) //is the count of freq is not 0 then print
            System.out.print((char)(i+'a')+" "+freq[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        freq2(str);
    }
}
