package Recursion;

import java.util.Scanner;

public class print1toN {
     static int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        x=1;
        print(x,n);
        sc.close();

    }
    // public static void print(int n){
    //     if(n==0) return ;
    //     print(n-1);
    //     System.out.print(n+" ");
    // }
    
    public static void print(int x, int n){
        if(x>n) return ;
        System.out.print(x+" ");
        print(x+1,n);
    }

}
