package Strings;

import java.util.Scanner;

public class CountVowels {
    public static int count(String s){
        s.toLowerCase();
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        System.out.println(count(s));
        sc.close();
    }
}
