package Recursion;

import java.util.Scanner;

public class fibnonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fib(n);
        sc.close();

    }
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int x = fib(n-1)+fib(n-2);
        System.out.print(x+" ");
        return x;
    }
}
