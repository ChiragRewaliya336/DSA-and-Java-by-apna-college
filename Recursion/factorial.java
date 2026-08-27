package Recursion;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
    public static int fact(int n){
        return n<=1 ? 1: n* fact(n-1);
    }
}
