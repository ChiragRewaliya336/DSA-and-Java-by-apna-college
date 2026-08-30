package Strings;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);
        sc.close();
        // String to int
        String y = "25255";
        int m = Integer.parseInt(y);
    }
}
