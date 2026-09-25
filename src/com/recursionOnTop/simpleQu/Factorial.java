package com.recursionOnTop.simpleQu;

public class Factorial {
    static int  fact(int n) {
        if (n == 0) return 1;

        int Ans = n * fact(n - 1);
        return Ans;
    }

    static void main() {
        int n =5;
        int  ans = fact(n);
        System.out.print(ans);
    }
}
