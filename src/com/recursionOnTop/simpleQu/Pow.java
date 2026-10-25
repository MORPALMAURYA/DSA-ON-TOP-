package com.recursionOnTop.simpleQu;

public class Pow {
    static int pow(int a){
        if(a==0){
            return 1;
        }
        int getAns = 2 * pow(a-1);
        return getAns;
    }

    static void main(String[] args) {
        int n=5;
        int ans = pow(n);
        System.out.println("pow "+ans);

    }
}
