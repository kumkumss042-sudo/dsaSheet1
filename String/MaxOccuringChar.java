package String;
import java.util.*;
public class MaxOccuringChar {
    public static char maxFreqChar(String str){
        //Phase1-->sorting string into alphabetical order by converting in char array
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        //finding the freq of max array and return it
        int max=1,curr=1;
        char maxChar=arr[0];
        for(int i=1;i<arr.length;i++){
          if(arr[i]==arr[i-1]) curr++;
          else{
              if(curr>max){  //update the max freq if curr one is larger
                  max=curr;
                  maxChar=arr[i-1];
              }
              curr=1;
          }
        }
        if(curr>max){  //final check for last character
            max=curr;
            maxChar=arr[arr.length-1];
        }
        return maxChar; //returning result
    }
    public static char maxFreqChar2(String s){
        HashMap<Character,Integer>mp=new HashMap<>(); //Map to store frequency
        for(char ch: s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);  //count each character
        }
        int maxFreq=0;  //variable to store result
        char maxChar='\0';
        //traverse through the map to find maxfreq and maxchar
        for(Map.Entry<Character,Integer>entry: mp.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq= entry.getValue();
                maxChar= entry.getKey();
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ans=maxFreqChar2(s);
        System.out.println("Maximum occuring character is:"+ans);
    }
}
