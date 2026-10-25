package com.recursionOnTop.simpleQu;

public class Factorial {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans = n * factorial(n-1);

        return ans;

    }

    static void main() {
        int n = 5;
       int ans =  factorial(n);
       System.out.println("factorial is "+ans);
    }
}
