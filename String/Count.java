package String;
import java.util.*;
public class Count {
    public static void ans(String lower){
        int vowel=0,consonant=0,spaces=0;
        for(int i=0;i<lower.length();i++){
            char ch=lower.charAt(i); //finding each character
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowel++; //checking vowel
            else if(ch==' ') spaces++;
            else consonant++;
        }
        System.out.println("count of vowel:"+vowel);
        System.out.println("count of Whitespaces:"+spaces);
        System.out.println("count of consonants:"+consonant);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String lower=str.toLowerCase(); //converting into lower case using inbuilt fnction
       ans(lower);
    }
}
