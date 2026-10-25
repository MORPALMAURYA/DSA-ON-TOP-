package com.recursionOnTop.simpleQu;

public class CountingPrint {

    static void count(int n){

        if(n==0){
            return;
        }
        System.out.print(n+",");
        count(n-1);
    }

    static void main(String[] args) {
        int n = 10;
        count(n);

    }
}
