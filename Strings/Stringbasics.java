package Strings;

import java.util.Scanner;

public class Stringbasics {
    public static void line(String s){
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    public static void word(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                break;
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s = "My_name is Chirag";
        line(s);
        word(s);
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(t);
        String e = sc.next();
        System.out.println(e);
        sc.close();
    }
}
