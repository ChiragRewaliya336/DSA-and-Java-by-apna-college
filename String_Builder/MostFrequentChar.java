package String_Builder;

import java.util.Arrays;

public class MostFrequentChar {
    public static char getMaxOccuringChar(String s) {
        // brute force:
        int n = s.length();
        int maxFre = 0;
        char ans = s.charAt(0);
        for (int i = 0; i < n; i++) {
            int freq = 1;
            char ch = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == ch) {
                    freq++;
                }
                if (freq > maxFre) {
                    maxFre = freq;
                    ans = ch;
                } else if (freq == maxFre && ch < ans) {
                    ans = ch;
                }
            }
        }
        return ans;
    }

    public static char getMax(String s){
        //Better:
        int n=s.length();
        int maxFreq=-1;
        char ans =s.charAt(0);
        char[] arr= s.toCharArray();
        Arrays.sort(arr);
        int i=0,j=0;
        while(j<n){
            if(arr[i]==arr[j]) j++;
            else{
                int freq =j-i;
                if(freq>maxFreq){
                    maxFreq=freq;
                    ans=arr[i];
                }
                i=j;
            }
        }
        int freq =j-i;
        if(freq>maxFreq){
            maxFreq=freq;
            ans=arr[i];
        }
        return ans;
    }
    public static char getMaxOccurance(String s){
        // optimal:
        int n=s.length();
        int[] freq= new int[26];
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int idk=ch-'a';
            freq[idk]++;
        }
        int maxFreq=0;
        char ans =s.charAt(0);
        for(int i=0; i<26; i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                ans=(char)(i+97);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(getMaxOccuringChar(s));
        System.out.println(getMax(s));
        System.out.println(getMaxOccurance(s));
    }
}
