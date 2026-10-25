package com.recursionOnTop.simpleQu;

public class Fibanacci {

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int ansFib =  fib(n-1) + fib(n-2);
        return ansFib;
    }

    static void main(String[] args) {
        int n=11;
        int ans = fib(n);
        System.out.println("fibanacci : "+ans);

    }
}
